package M11.Task1;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by asevruk on 11/8/2016.
 */
public class Main {

    static Map<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("You", "YOU");
        map.put("map", "MAP");
        map.put("with", "AAAAAAAAAAAA");
        return map;
    }

    static String replacer(Map<String, String> map, String line) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            line = line.replaceAll(key, value);

        }
        return line;
    }

    static String readLineForFile() throws IOException {
        BufferedReader br;
        String everything;

        br = new BufferedReader(new FileReader("D:\\text.txt"));


        StringBuilder sb = new StringBuilder();
        String line = br.readLine();

        while (line != null) {


            sb.append(line);
            sb.append(System.lineSeparator());
            line = br.readLine();
        }

        everything = sb.toString();
        br.close();

        return everything;


    }


    public static void main(String[] args) throws IOException {

        System.out.println(replacer(createMap(), readLineForFile()));

    }
}










