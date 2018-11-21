package SimBusiness;

import Service.WorkDataService;
import Service.XfcService;
import Service.XtransService;

import java.util.Random;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
public class WorkConsumer implements Runnable {
    private BlockingQueue<WorkData> queue;
    private Set<Integer> set;
    private static final int SLEEPTIME = 3000;

    public WorkConsumer(BlockingQueue<WorkData> queue, Set<Integer> set) {
        this.set = set;
        this.queue = queue;
    }


    public void run() {
        System.out.println("start Consumer id :"+Thread.currentThread().getId());
        Random r = new Random();
        try{
            WorkClass workClass = new WorkClass();
            workClass.xfcService = new XfcService();
            TransClass transClass = new TransClass();
            transClass.xtransService = new XtransService();
            WorkDataService workDataService = new WorkDataService();
            workClass.httpRequest = new HttpRequest();
            while(true){
                WorkData data = queue.take();
                if(data != null)
                {

                  //  data.setXtrans(transClass.insertInfo(data));
                    workClass.dofun(data);
                    //int re = data.getData() * data.getData();
                  //  System.out.println(MessageFormat.format("{0}*{1}={2}", data.getData(),data.getData(),re));
                    Thread.sleep(r.nextInt(SLEEPTIME));
                    set.remove(data.getId());
                   // workDataService.deleteWorkData(data);
                }
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
