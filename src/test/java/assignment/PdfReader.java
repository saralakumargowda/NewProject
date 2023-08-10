package assignment;

//import java.io.BufferedWriter;
//import java.io.File;

//import org.apache.pdfbox.pdmodel.PDDocument;
//import org.apache.pdfbox.text.PDFTextStripper;

//public class PdfReader {
//	String readPdf(String Filepath) {
//
//		String pdfText = null;
//		PDDocument pd;
//		try {
//			File input = new File(Filepath); // The
//			pd = PDDocument.load(input);
//			PDFTextStripper stripper = new PDFTextStripper();
//			pdfText = stripper.getText(pd);
//			if (pd != null) {
//				pd.close();
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return pdfText;
//	}
//
//	public static void main(String[] args) {
//		PDDocument pd;
//		BufferedWriter wr;
//		try {
//			File input = new File("C:\\Users\\Admin\\Desktop\\Manual Project\\Requirements Document Example.pdf"); // The
//			pd = PDDocument.load(input);
//			System.out.println(pd.getNumberOfPages());
//			System.out.println(pd.isEncrypted());
//			PDFTextStripper stripper = new PDFTextStripper();
//			System.out.println(stripper.getText(pd));
//			if (pd != null) {
//				pd.close();
//			}
//			// I use close() to flush the stream.
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//}
