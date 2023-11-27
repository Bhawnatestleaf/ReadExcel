package week5.day3;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {

	@Test

	public void readExcelData() throws IOException {
		XSSFWorkbook book = new XSSFWorkbook("./data/CreateLead.xlsx");

//To get the sheet by using index
//Index starts from zero
 XSSFSheet sheet = book.getSheetAt(0);

//get the row
//row count starts from 0(zero)
int rowCount = sheet.getLastRowNum();
System.out.println("rowcount :" +rowCount);
{

//Get the col count
//col count starts from 1(one)
int colCount=sheet.getRow(0).getLastCellNum();
	System.out.println("colCount:" +colCount);
	// TODO Auto-generated method stub

}
    //To get the value from the particular cell
    //To get the data the index position will starts from 0(zero)
String stringCellValue=sheet.getRow(2).getCell(1).getStringCellValue();
System.out.print("stringCellValue :" +stringCellValue);

String firstCname = sheet.getRow(1).getCell(0).getStringCellValue();
String firstNname = sheet.getRow(1).getCell(1).getStringCellValue();
String firstLname = sheet.getRow(1).getCell(2).getStringCellValue();
String firstphno = sheet.getRow(1).getCell(3).getStringCellValue();

System.out.println(firstCname);
System.out.println(firstNname);
System.out.println(firstLname);
System.out.println(firstphno);

System.out.print("=============================================");
for(int i=1;i<rowCount;i++) {
	
		String celValue = sheet.getRow(1).getCell(i).getStringCellValue();
		System.out.println(celValue);
}
}

}

