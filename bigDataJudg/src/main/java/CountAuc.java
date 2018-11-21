import java.io.IOException;
import java.util.*;

public class CountAuc {
    int m, n;
    Map<String,String> mapInput, mapVail;
    private void init(String resouce) {
        mapInput = new HashMap<String, String>();
        mapVail = new HashMap<String, String>();
        try {
            getCsv.read(mapInput, resouce);
            getCsv.read(mapVail, "validate_label.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Iterator<Map.Entry<String, String>> iterator = mapVail.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> ma = iterator.next();
            if (ma.getValue().equals("1")) {
                m++;
            } else if (ma.getValue().equals("0")) {
                n++;
            } else {
                System.out.println(ma.getKey());
            }
        }
    }



       private double getAuc() {
        ArrayList<Map.Entry<String, String>> arrayList = new ArrayList<Map.Entry<String, String>>(mapInput.entrySet());
        Collections.sort(arrayList, new Comparator<Map.Entry<String, String>>() {
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        double k = 0;
        double countrank = 0;
        for (Map.Entry<String, String> ma : arrayList) {
            k++;
            if (mapVail.containsKey(ma.getKey())&&mapVail.get(ma.getKey()).equals("1")) {
                countrank += k;
            }
        }
        return (countrank - 1000 * 1001 / 2) / (1000 * 1000);
    }
    public static void main(String[] args) {
        CountAuc auc = new CountAuc();
        Map<String, Double> map = new HashMap<String, Double>();
        for (int i = 1; i < 7; i++) {
            String key = "input_" + i + ".csv";
            auc.init(key);
            map.put(key, auc.getAuc());
        }
        Iterator<Map.Entry<String, Double>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Double> a = iterator.next();
            System.out.println(a.getKey() + "  " + a.getValue());
        }

    }
}
