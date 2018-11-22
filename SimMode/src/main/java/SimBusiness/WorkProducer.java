package SimBusiness;
import Service.WorkDataService;
import Service.XtransService;

import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;


public class WorkProducer implements Runnable{
    private volatile boolean isRunning = true;
    private BlockingQueue<WorkData> queue;// 内存缓冲区
    private Set<Integer> set;
    private static AtomicInteger count = new AtomicInteger();// 总数 原子操作
    private static final int SLEEPTIME = 3000;

    public WorkProducer(BlockingQueue<WorkData> queue,Set<Integer> set) {
        this.queue = queue;
        this.set = set;
    }



    public void run() {
        Random r = new Random();
        TransClass transClass = new TransClass();
        transClass.xtransService = new XtransService();
        WorkClass workClass = new WorkClass();
        workClass.workDataService = new WorkDataService();
        HttpRequest httpRequest = new HttpRequest();
       // /WorkDataService workDataService = new WorkDataService();
      //  System.out.println("start producting id:" + Thread.currentThread().getId());
        try {
            while (isRunning) {
                List<WorkData> list = httpRequest.getWorkdatas(set,workClass.fetchUrl);
                Thread.sleep(r.nextInt(SLEEPTIME));
                for (WorkData data : list) {
                    System.out.println(data + " 加入队列");
                    data.setMap( workClass.getParams(data));
                    data.setXtrans(transClass.insertInfo(data));
                    workClass.workDataService.addXtransToWorkData(data);
                    transClass.insertLog(data, "01", "Pull", "Application", data.getAppid());
                    if (!queue.offer(data, 2, TimeUnit.SECONDS)) {
                        System.err.println(" 加入队列失败");
                    }
                }

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void stop() {
        isRunning = false;
    }
}
