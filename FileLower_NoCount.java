import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileLower_NoCount {
	static String fileName = null;
	static String filePath;
	String line = null;
	int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		filePath = System.getProperty("user.dir");
		fileName = filePath + "\\" + args[0];
		FileLower_NoCount r = new FileLower_NoCount();
		r.replace();

	}

	//count the Interger value from a given String
	public void countValue(String input) {

		for (int i = 0; i < input.length(); i++) {
			if (Character.isDigit(input.charAt(i))) {
				count++;
			}
		}

	}
//replaceAll lower from the file
	public void replace() {
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter(filePath + "\\output.txt");
			BufferedWriter bw = new BufferedWriter(fw);

			while ((line = br.readLine()) != null) {
				String lower = line.toLowerCase();
				line = line.replace(line, lower);
				bw.write(line + "\n");

				countValue(line);

			}
			System.out.println("total number of count in file :: " + count);
			bw.flush();

		} catch (IOException ioe) {
		}

	}
}
