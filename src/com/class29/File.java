package com.class29;

public abstract class File {

abstract void open();

void edit(){
	System.out.println("edit method");
}

void close(){
	System.out.println("Close methode");
}

}
class JavaFile extends File{
	
	void open() {
		System.out.println("open methode for Java File");
	}
}
class WordFile extends File{
	void open() {
		System.out.println("open methode for word File");
	}
}

class PdfFile extends File{
	void open() {
		System.out.println("open methode PDF File");
	}
}



