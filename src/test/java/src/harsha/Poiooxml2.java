package harsha;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Poiooxml2 
{

	public static void main(String[] args) throws Exception
	{
		File f=new File("myexcel.xlsx");
		FileOutputStream fo=new FileOutputStream(f);
		Workbook wb=new XSSFWorkbook();
	//sheet creation
		Sheet sh=wb.createSheet("Nukasani");
	//column width
		sh.setColumnWidth(0,10000);
	//define font
		Font fn=wb.createFont();
		fn.setFontHeightInPoints((short)11);
		fn.setFontName("Courier New");
		fn.setColor(IndexedColors.DARK_RED.index);
	//alignment of text in cell
		CellStyle cs=wb.createCellStyle();
		cs.setAlignment(HorizontalAlignment.CENTER);
		cs.setVerticalAlignment(VerticalAlignment.CENTER);
	//go to first row of first column
		Row r=sh.createRow(0);//1st row
		r.setHeight((short)1000);//set row height
		Cell c=r.createCell(0);//1st column
	//enter data n given style
		c.setCellStyle(cs);
		c.setCellValue("AbdulKalam");
		wb.write(fo);
		wb.close();
		fo.close();
		
		
		
		
		

	}

}
