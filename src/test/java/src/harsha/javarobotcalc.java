package harsha;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class javarobotcalc 
{
	public static void main(String[] args) throws Exception
	{
	//launch calculator
		Runtime.getRuntime().exec("calc.exe");
		Thread.sleep(5000);
	//send value to clip board
		StringSelection x=new StringSelection("5");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(x,null);
	//paste in calc window
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
	//click +
		r.keyPress(KeyEvent.VK_ADD);
		r.keyRelease(KeyEvent.VK_ADD);
	//send value to clipboard
		StringSelection y=new StringSelection("10");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(y,null);
	//paste in calc window
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
	//click equals
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_EQUALS);
	Thread.sleep(5000);
		
		
		
	
		
		
		
		
	}

}
