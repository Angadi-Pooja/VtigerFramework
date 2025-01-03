package DDT;
import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
public class FetchingDatafromPdf {

	
	//pushing back this script
	public static void main(String[] args) throws Throwable {
		File file = new File("./src/test/resources/Manual Testing - Part 3(YT).pdf");
		
		PDDocument doc = PDDocument.load(file);
		int pages=doc.getNumberOfPages(); //fetch total no of pages
//		System.out.println(pages);
		
		PDFTextStripper pdfdata = new PDFTextStripper();
//		String readdata = pdfdata.getText(doc);
//		System.out.println(readdata);
		
		pdfdata.setStartPage(2);
		String page = pdfdata.getText(doc);
		System.out.println(page);
		
//		pdfdata.setStartPage(11);
//		pdfdata.setEndPage(11);
//		String page = pdfdata.getText(doc);
//		System.out.println(page);
	}

}
