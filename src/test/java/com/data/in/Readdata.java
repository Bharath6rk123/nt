package com.data.in;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Readdata {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\91912\\eclipse-workspace1\\Datadriven\\target\\sbk.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
	}

}
