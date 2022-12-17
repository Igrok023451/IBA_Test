package util.property;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class XLUtility {

    public FileInputStream fi;
    public XSSFWorkbook workbook;
    public XSSFSheet sheet;
    public XSSFRow row;
    public XSSFCell cell;
    String path;

    public XLUtility(String path)
    {
        this.path=path;
    }

    //////самая длинная колонка сколько размер
    public int getRowCount(String sheetName) throws IOException
    {
        fi=new FileInputStream(path);
        workbook=new XSSFWorkbook(fi);
        sheet=workbook.getSheet(sheetName);
        int rowcount=sheet.getLastRowNum();
        workbook.close();
        fi.close();
        return rowcount;
    }

////Самая длнная строчка + пустые до последнего элемента
    public int getCellCount(String sheetName,int rownum) throws IOException
    {
        fi=new FileInputStream(path);
        workbook=new XSSFWorkbook(fi);
        sheet=workbook.getSheet(sheetName);
        row=sheet.getRow(rownum);
        int cellcount=row.getLastCellNum();
        workbook.close();
        fi.close();
        return cellcount;
    }
///Достать конкретный объект
    public String getCellData(String sheetName,int rownum,int colnum) throws IOException {
        fi=new FileInputStream(path);
        workbook=new XSSFWorkbook(fi);
        sheet=workbook.getSheet(sheetName);
        row=sheet.getRow(rownum);
        cell=row.getCell(colnum);

        DataFormatter formatter = new DataFormatter();
        String data;
        try{
            data = formatter.formatCellValue(cell); //Returns the formatted value of a cell as a String regardless of the cell type.
        }
        catch(Exception e)
        {
            data="";
        }
        workbook.close();
        fi.close();
        return data;
    }
    ///Сделать массив конкретной колонки
    public String[] getSubscriberText( int numberSheet, int numberRow, int numberCell) throws IOException {
        fi=new FileInputStream(path);
        workbook=new XSSFWorkbook(fi);
        String[] text = new String[22];
        for (int i = 0; i < text.length; i++) {
            cell = workbook.getSheetAt(numberSheet).getRow(numberRow).getCell(numberCell);
           switch (cell.getCellType()) {
               case STRING:
                   text[i] = cell.getRichStringCellValue().getString();
                   numberRow++;
                   break;
               case NUMERIC:
                   text[i] = String.valueOf((int) cell.getNumericCellValue());
                   numberRow++;
                   break;
           }
        }
        return text;
    }
}