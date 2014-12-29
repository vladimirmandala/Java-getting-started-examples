package General;

import java.io.IOException;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfReaderContentParser;
import com.itextpdf.text.pdf.parser.SimpleTextExtractionStrategy;
import com.itextpdf.text.pdf.parser.TextExtractionStrategy;

//Jars Used: itextpdf-5.1.0.jar

public class SearchInPdfFile {

	public static void main(String args[]) throws IOException {
		String texttosearch = "Account";
		boolean searchResult = false;
		PdfReader reader = new PdfReader("D:\\Bill.pdf");
		PdfReaderContentParser parser = new PdfReaderContentParser(reader);
		TextExtractionStrategy strategy;

		for (int i = 1; i <= reader.getNumberOfPages(); i++){		
			strategy = parser.processContent(i,	new SimpleTextExtractionStrategy());
			if (strategy.getResultantText().indexOf(texttosearch) > -1) {
				searchResult = true;
				break;
			}
		}
		if (searchResult) {
			System.out.println("Search SuccessFull!!!");
		} else {
			System.out.println("Search SuccessFull!!!");
		}
	}
}