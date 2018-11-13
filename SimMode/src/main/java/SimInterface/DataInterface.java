package SimInterface;

import java.util.Iterator;
import java.util.Map;

public class DataInterface {
    public static String getData(String name,Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        sb.append("请求数据源 "+ name +" 成功： ");
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> a = iterator.next();
            sb.append(a.getKey() + " " + a.getValue());
            sb.append("   ");
        }
        sb.append("\n");
        return sb.toString();
    }
}
