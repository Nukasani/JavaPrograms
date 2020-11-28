package harsha;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

public class poiooxmlsheetcreation 
{

	public static void main(String[] args) throws Exception
	{
		Workbook wb=new HSSFWorkbook();
		wb.createSheet("Harsha");
		File f=new File("grapes.xls");
		FileOutputStream fo=new FileOutputStream(f);
		wb.write(fo);
		wb.close();
		fo.close();
	

	}

}
