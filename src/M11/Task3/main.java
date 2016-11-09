package M11.Task3;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by asevruk on 11/9/2016.
 */
public class main {
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

    static String replacer(Map<String, String> map, String line) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            line = line.replaceAll(key, value);

        }
        return line;
    }

    static void addStringToFile(String line) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\text.txt", true));
        bw.write(line);
        bw.close();
    }

    static Map<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("You", "YOU");
        map.put("map", "MAP");
        map.put("with", "AAAAAAAAAAAA");
        return map;
    }


    public static void main(String[] args) throws IOException {

        addStringToFile(replacer(createMap(),readLineForFile()));
    }

}