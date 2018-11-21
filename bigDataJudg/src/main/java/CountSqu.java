import java.io.IOException;
import java.util.*;

public class CountSqu {
    List<String> mapInput, mapVail;
    private void init(String resouce) {
        mapInput = new ArrayList<String>();
        mapVail = new ArrayList<String>();
        resouce = "4\\" + resouce;
        try {
            getCsv.read(mapInput, resouce);
            getCsv.read(mapVail, "4\\validate_data.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
//        Iterator<Map.Entry<String, String>> iterator = mapVail.entrySet().iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<String, String> ma = iterator.next();
//            if (ma.getValue().equals("1")) {
//                m++;
//            } else if (ma.getValue().equals("0")) {
//                n++;
//            } else {
//                System.out.println(ma.getKey());
//            }
//        }
    }
    private double getSqu(){
        double e = 0;
        double size = mapInput.size();
        for (int i = 0; i < mapInput.size(); i++) {
            if (mapVail.get(i).equals("-1")) {
                size--;
                continue;
            }
            e += Math.pow(Double.valueOf(mapInput.get(i)) - Double.valueOf(mapVail.get(i)), 2);
        }
//        while (iterator.hasNext()) {
//            String s = iterator.next();
//            String s = mapVail.get(ma.getKey());
//            e += Math.pow(Double.valueOf(ma.getValue()) - Double.valueOf(s), 2);
//        }
        return Math.sqrt(e / size);
    }
    public static void main(String[] args) {
        CountSqu auc = new CountSqu();
        Map<String, Double> map = new HashMap<String, Double>();
        for (int i = 1; i < 7; i++) {
            String key = "input_" + i + ".csv";
            auc.init(key);
            map.put(key, auc.getSqu());
        }
        ArrayList<Map.Entry<String, Double>> listResult = new ArrayList<Map.Entry<String, Double>>(map.entrySet());
        Collections.sort(listResult, new Comparator<Map.Entry<String, Double>>() {
            public int compare(Map.Entry<String, Double> o1, Map.Entry<String, Double> o2) {
                return Double.valueOf(o1.getValue()).compareTo(Double.valueOf(o2.getValue()));
            }
        });
        Iterator<Map.Entry<String, Double>> iterator = listResult.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Double> a = iterator.next();
            System.out.println(a.getKey() + "  " + a.getValue());
        }

    }

}
