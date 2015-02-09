package com.runawaybits.html2markdown;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Testbed {
    public static void main(String[] args) {
        URL url;
        try {
            url = new URL("http://jsoup.org/");
            String parsedText = HTML2Md.convert(url, 30000);
            System.out.println(parsedText);

            // test parse local html file
//            String pathFile = "test.html";
//            File f = new File(pathFile);
//            String parsedFileText = HTML2Md.convertFile(f, "gbk");
//            System.out.println(parsedFileText);

            System.out.println("done");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}