package InputsFiles;

public class InputFile {
	/**
	 *  Counts the number of special characters in s.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputFile file=new InputFile();
		file.getSpecialCharacterCount("//string");
	}
	/**
	 *  Counts the number of special characters in s.
	 */

	 public int getSpecialCharacterCount(String s) {
	     if (s == null || s.trim().isEmpty()) {
	         return 0;
	     }
	     //read the line
	     int theCount = 0;
	     String specialChars = null;
	     for (int i = 0; i < s.length(); i++) {
	         if (specialChars.contains(s.substring(i, 1))) {
	             theCount++;
	         }
	     }
	     return theCount;
	 }//end of method
}
//dont see the code it just dum