package M11.Task4;


import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import com.sun.xml.internal.ws.util.StringUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by asevruk on 11/9/2016.
 */
public class Main {
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

    static int checkWord(String word, String line) {
        String[] strArray = line.trim().split(" ");
        int count = 0;

        for (int i = 0; i < strArray.length; i++) {
            if (strArray[i].equals(word)) {
                count++;
            }

        }
        return count;


    }


    public static void main(String[] args) throws IOException {
        String line = readLineForFile();
        System.out.println(checkWord("You", line));


    }
}

