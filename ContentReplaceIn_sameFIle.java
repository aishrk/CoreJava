
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.apache.commons.io.FileUtils;

public class ContentReplaceIn_sameFIle {

	public static void readFlatFile(String fileNAme) {
		try {

			
			String path = System.getProperty("user.dir");
			String fileNameLoc=path+"\\"+fileNAme;
			File tmpDir = new File(fileNameLoc);
			BufferedReader br = new BufferedReader(new FileReader(tmpDir));
			System.out.println("file location :: "+fileNameLoc);
			System.out.println("Taking FlatFile : " + fileNAme);

			String strLine = null;
			int i = 1;
			// Read File Line By Line
			while ((strLine = br.readLine()) != null && strLine.contains("|")) {
				// not include 1st line of file
				// include remaining content of index 18 from file
				if (i != 1) {
					String[] line = null;
					line = strLine.split(Pattern.quote("|"));

					String filePath = line[18];
					System.out.println("line 18:  " + filePath);
					line[18]=  filePath.replace(filePath,"C:\\WS\\STS ws\\Corejava");
					
					
					
					System.out.println("file is present :: " + tmpDir);
					
					List<String> lines = FileUtils.readLines(tmpDir);
					
					
					FileUtils.writeStringToFile(tmpDir, line[18], false);
					

				} // outer if
				
				i++;
			} // while
			
			System.out.println("done : ");

			br.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String fileName = args[0];
		System.out.println("Started  reading file : " + fileName);
		System.out.println("");
		readFlatFile(fileName);

		System.out.println("End of Execution");
	}

}