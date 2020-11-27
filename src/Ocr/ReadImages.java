package Ocr;

import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class ReadImages {
	public static void main(String[] args) {
		ITesseract tess = new Tesseract();
		System.out.println("working...");
		
		try {
			String s= tess.doOCR(new File("C:\\Users\\Dell\\Desktop\\Office Stuff\\tess4J_Demo\\testImages\\img1.png"));
			System.out.println("Image Text is - \n"+s);
		} catch (TesseractException e) {
			System.out.println(e.getMessage());
		}
	}
}
