package SimBusiness;

import com.sun.org.apache.xerces.internal.parsers.IntegratedParserConfiguration;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Properties;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.*;

public class StartClass {
    static int threadNum;
    private static void init() {
        if(threadNum==0) {
            Properties props = new Properties();
            File f = null;
            String path = System.getProperty("user.dir") + f.separator + "config.properties";
            // ResourceBundle resourceBundle = ResourceBundle.getBundle("config");
            try {
                props.load(new FileInputStream(path));
            } catch (IOException e) {
                e.printStackTrace();
            }
            threadNum= Integer.valueOf(props.getProperty("threadNum"));
        }
    }
    public static void main(String[] args) throws InterruptedException {
        init();
        BlockingQueue<WorkData> queue = new LinkedBlockingDeque<WorkData>();
        Set<Integer> set = new HashSet<Integer>();
        WorkProducer p1 = new WorkProducer(queue,set);
        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0; i < threadNum; i++) {
            WorkConsumer workConsumer = new WorkConsumer(queue, set);
            service.execute(workConsumer);
        }
        service.execute(p1);


//        Thread.sleep(10*1000);
//        p1.stop();
//        Thread.sleep(3000);
       // service.shutdown();
    }
}
