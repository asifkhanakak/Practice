package com.class29;

public class TestFile {

	public static void main(String[] args) {

		File obj = new WordFile();
		File obj1 = new JavaFile();
		File obj2 = new PdfFile();

		obj.open();
		obj1.open();
		obj2.open();

	}
}
