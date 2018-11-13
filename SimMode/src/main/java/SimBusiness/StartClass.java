package SimBusiness;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.*;

public class StartClass {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<WorkData> queue = new LinkedBlockingDeque<WorkData>();
        Set<Integer> set = new HashSet<Integer>();
        WorkProducer p1 = new WorkProducer(queue,set);
        WorkConsumer c1 = new WorkConsumer(queue,set);
        WorkConsumer c2 = new WorkConsumer(queue, set);
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(p1);
        service.execute(c1);
        service.execute(c2);
//        Thread.sleep(10*1000);
//        p1.stop();
//        Thread.sleep(3000);
       // service.shutdown();
    }
}
