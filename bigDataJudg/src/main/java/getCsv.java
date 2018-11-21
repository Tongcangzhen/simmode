import com.csvreader.CsvReader;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class getCsv {
    public static void read(Map<String,String>map,String resouce) throws IOException {
        CsvReader csvReader = new CsvReader("C:\\Users\\93441\\IdeaProjects\\bigDataJudg\\src\\main\\resources\\"+resouce, ',', Charset.forName("UTF-8"));
        csvReader.readHeaders();
        while (csvReader.readRecord()) {
            // 获取内容的两种方式
            // 1. 通过下标获取
            //System.out.print(csvReader.get(0));

            // 2. 通过表头的文字获取
            //System.out.println(" " + csvReader.get(1));
            map.put(csvReader.get(0)+csvReader.get(1), csvReader.get(3));
        }

    }
    public static void read(List<String> list, String resouce) throws IOException {
        CsvReader csvReader = new CsvReader("C:\\Users\\93441\\IdeaProjects\\bigDataJudg\\src\\main\\resources\\"+resouce, ',', Charset.forName("UTF-8"));
        csvReader.readHeaders();
        while (csvReader.readRecord()) {
            // 获取内容的两种方式
            // 1. 通过下标获取
            //System.out.print(csvReader.get(0));

            // 2. 通过表头的文字获取
            //System.out.println(" " + csvReader.get(1));
            list.add(csvReader.get(1));
        }

    }




}
