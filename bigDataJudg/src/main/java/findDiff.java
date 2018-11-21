import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class findDiff {
    public static void main(String[] args) {
            Map<String, String> mapInput = new HashMap<String, String>();
            Map<String, String> mapvali = new HashMap<String, String>();
            String resouce = "input_6.csv";
            String vali = "validate_label.csv";
            try {
                getCsv.read(mapInput,resouce);
                getCsv.read(mapvali, vali);
            } catch (IOException e) {
                e.printStackTrace();
            }
            Iterator<Map.Entry<String,String>> iterator = mapInput.entrySet().iterator();
            int k = 0;
            while (iterator.hasNext()) {
                Map.Entry<String, String> en = iterator.next();
                if (!mapvali.containsKey(en.getKey())) {
                    k++;
                }
                System.out.println(en.getKey());
            }
            System.out.println(k);

    }
}
