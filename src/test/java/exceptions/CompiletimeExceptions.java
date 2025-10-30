package exceptions;

import java.io.FileInputStream;
import java.io.IOException;

import java.net.URL;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//throws InterruptedException, EncryptedDocumentException, IOException


public class CompiletimeExceptions {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException   {
		
		Thread.sleep(2000); //InterruptedException
		
	FileInputStream fis =new FileInputStream("dsdsd");//FileNotFoundException
		
         WorkbookFactory.create(fis); //IOException
		
       URL url=new URL("https://www.google.com");//MalfromedURLException
      
       int a=10/0;
       System.out.println(a);
         
	}

}
