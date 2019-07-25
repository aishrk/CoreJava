package com.counts;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class CommentCountsForJavaFile {

	public static void main(String[] args) throws IOException {
		String property = System.getProperty("user.dir");
		String path = property + "\\src\\InputsFiles\\InputFile.java";
		BufferedReader br = new BufferedReader(new FileReader(path));
		System.out.println("java file Path : " + path);
		String strLine = null;
		int multipleComment = 0;
		int singleComment = 0;
		int codeCOunt = 0;
		int fileCount = 0;
		while ((strLine = br.readLine()) != null) {

			if (strLine.startsWith("\t/**")) {
				while ((strLine = br.readLine()) != null) {

					if (strLine.endsWith("*/")) {
						multipleComment++;

						break;
					}
					fileCount++;
				}

			} // if
			else if (strLine.contains("//")) {

				singleComment++;
			} // else if
			else {

				codeCOunt++;
			}
			fileCount++;

		} // while

		System.out.println("single comment count :: " + singleComment);
		System.out.println("multiple commet " + multipleComment);
		System.out.println("code :: " + codeCOunt);
		System.out.println("total file count :: " + fileCount);

	}

}
