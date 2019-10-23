package com.ydc.study.collection.readfile;

import java.io.*;
import java.nio.charset.Charset;

/**
 * @author Administrator
 */
public class Test1 {

    String localFilePath = this.getClass().getClassLoader().getResource("套餐资费说明.txt").getPath();

    public static void main(String[] args) {

        String path = "E:\\Java Space\\DemoYDC\\Java Space\\Demo\\src\\com\\ydc\\study\\collection\\readfile\\ReadFile.txt";
        //String path = "E:\\Java Space\\DemoYDC\\Java Space\\Demo\\src\\com\\ydc\\study\\collection\\readfile\\套餐资费说明.txt";


        try {
            String pathGBK = new String(new String(path.getBytes("ISO-8859-1"), "utf-8"));

            System.out.println(pathGBK);
            // readFileByLines(pathGBK);
            // readFileByLines(pathGBK);
            // readFileByLines(pathGBK);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }


    }

    /**
     * 以行为单位读取文件，常用于读面向行的格式化文件
     */
    public static void readFileByLines(String fileName) {
        File file = new File(fileName);
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {
                // 显示行号
                System.out.println(tempString);
                line++;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
    }

}
