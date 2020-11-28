package harsha;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

public class poisheetcreation  
{

	public static void main(String[] args) throws Exception
	{
		Workbook wb =new HSSFWorkbook();
		wb.createSheet("kalam");
		File f=new File("oranges.xls");
		FileOutputStream fo=new FileOutputStream(f);
		wb.write(fo);
		wb.close();
		fo.close();
		
	}

}
