package org.rerun;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderWithExcel {
	
	private static Object[][] readExcel() throws IOException {
	
	File f = new File("C:\\Users\\Administrator\\eclipse-workspace\\TestNG_Day1\\src\\test\\resources\\Excel\\Exceltng.xlsx");

	FileInputStream fs = new FileInputStream(f);
	
	Workbook w = new XSSFWorkbook(fs);
	
	Sheet s = w.getSheet("Sheet1"); 
	
	Row r = s.getRow(4);
	
	int rowcount= s.getPhysicalNumberOfRows();
	int cellcount = r.getPhysicalNumberOfCells();
	
//	Object o [][]= new Object[s.getPhysicalNumberOfRows()-1][r.getPhysicalNumberOfCells()]; 
	Object o [][]=new Object[rowcount-1][cellcount];
	for(int i=0;i<s.getPhysicalNumberOfRows()-1;i++) {
		Row row = s.getRow(i+1);
		for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
			Cell cell = row.getCell(j);
			
			int Type = cell.getCellType(); 
		
			
			String value=null;
			if(Type==1) {
				  value = cell.getStringCellValue();
			}
			else {
				if(DateUtil.isCellDateFormatted(cell)) {
					Date datecellvalue = cell.getDateCellValue();
					SimpleDateFormat sd = new SimpleDateFormat("dd-MMM-yyyy");
					 value = sd.format(datecellvalue);
				}
				else {
					double numericCellValue = cell.getNumericCellValue();
					long numeric = (long) numericCellValue;
					 value  = String.valueOf(numeric);
				}
			}
			o[i][j]=value;
		}
	}
	return o;
	  
	
	
	} 
	public static void main(String[] args) throws IOException {
		
		Object[][] readExcel = readExcel();
		for(Object[] x:readExcel) {
			for(Object y:x) {
				System.out.println(y);
			}
		}
	}
	@DataProvider(name="login")
	private Object[] [] data() throws IOException {
		Object[][] readExcel = readExcel();
		return readExcel;

	}

	@Test(dataProvider="login")
	private void test(String user,String pass) {
		System.out.println(user);
		System.out.println(pass);
		

	}
 
		
	}



