package assignment;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("contacts");
		DataFormatter format=new DataFormatter();
		String value1=format.formatCellValue(sh.getRow(0).getCell(1));
		String value2=format.formatCellValue(sh.getRow(1).getCell(1));
		System.out.println(value1);
		System.out.println(value2);
		}
}
