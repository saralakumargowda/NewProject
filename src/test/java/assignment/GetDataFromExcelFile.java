package assignment;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.yantra.genericUtility.BaseClass;

public class GetDataFromExcelFile extends BaseClass{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// To get the file path

		FileInputStream fis4 = new FileInputStream("./src/test/resources/TestData.xlsx");
		// open workbook in read mode
		Workbook book4 = WorkbookFactory.create(fis4);

		// to get particular sheet
		Sheet sh = book4.getSheet("Address");
		
		// Data formatter will convert as per your required type data
		
		DataFormatter format = new DataFormatter();
		String text = format.formatCellValue(sh.getRow(2).getCell(1));
		System.out.println(text);
		}
}



