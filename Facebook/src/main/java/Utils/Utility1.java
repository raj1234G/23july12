package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility1 {
	
	
	public static void parameterization() throws EncryptedDocumentException, IOException  {
		
	FileInputStream File = new FileInputStream("D:\\Book1.xlsx");
	
	 Sheet v = WorkbookFactory.create(File).getSheet("Sheet2");
		
	//for(int i=0; i<=v.getLastRowNum(); i++) {
		
	//	for(int j=0; j<=v.getRow(i).getLastCellNum(); j++) {
			
		//	System.out.println(v.getRow(i).getCell(j).getStringCellValue());
			
		
		
	//}
		
		String data = v.getRow(6).getCell(0).getStringCellValue();
			String dd = v.getRow(6).getCell(1).getStringCellValue();
	
		System.out.println(data+" : "+dd);
	
	}
}
