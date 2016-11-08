package M11.Task1;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by asevruk on 11/8/2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        HashMap<String, String> map = new HashMap<>();
        map.put("You", "YOU");
        map.put("map", "MAP");
        map.put("with", "AAAAAAAAAAAA");


        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader("D:\\text.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {


                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            String everything = sb.toString();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                everything = everything.replaceAll(key, value);
            }
            System.out.println(everything);

        } finally {
            br.close();
        }


    }
}










