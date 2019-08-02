package printInDifferentFormate;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class PrintIn_DifferentFormate {
	static String say = "hello word";

	public static void main(String[] args) throws IOException, DocumentException {

		// print on concole
		System.out.println(say);
		printINExcel(); // excel
		printINFile();// file
		printINImage();// image
		printInPDF();// pdf

	}

	public static void printInPDF() throws FileNotFoundException, DocumentException {

		// print data in Pdf formate

		Document document = new Document();

		PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("HelloWorld.pdf"));
		document.open();
		document.add(new Paragraph(say));
		document.close();
		writer.close();
		document.close();
	}

	public static void printINExcel() throws IOException {
		// print in excel
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Java Books");
		Row row = sheet.createRow(1);
		Cell cell = row.createCell(1);
		cell.setCellValue(say);
		FileOutputStream outputStream = new FileOutputStream("JavaBooks.xlsx");

		workbook.write(outputStream);
	}

	public static void printINFile() throws IOException {
		// print in file
		FileWriter f = new FileWriter("two.txt");
		f.write(say);
		f.close();
	}

	public static void printINImage() throws IOException {
		// print data in image
		int width = 250;
		int height = 250;

		// Constructs a BufferedImage of one of the predefined image types.
		BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

		// Create a graphics which can be used to draw into the buffered image
		Graphics2D g2d = bufferedImage.createGraphics();

		// fill all the image with white
		g2d.setColor(Color.white);
		g2d.fillRect(0, 0, width, height);

		// create a string with yellow
		g2d.setColor(Color.BLACK);
		g2d.drawString(say, 50, 120);

		// Disposes of this graphics context and releases any system resources that it
		// is using.
		g2d.dispose();

		// Save as PNG
		File file = new File("myimage.png");
		ImageIO.write(bufferedImage, "png", file);

	}

}
