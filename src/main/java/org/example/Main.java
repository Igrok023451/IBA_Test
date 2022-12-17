package org.example;

import util.property.XLUtility;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String path = "src/main/resources/UserFile.xlsx";
        XLUtility xlUtility = new XLUtility(path);
        int i = xlUtility.getRowCount("Лист1");
        System.out.println(i);
        int a = xlUtility.getCellCount("Лист1", 3);
        System.out.println(a);
        String s = xlUtility.getCellData("Лист1", 1, 1);
        System.out.println(s);
    }
}