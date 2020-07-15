package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JavaIO {
	public static void listAllFiles(File file) {
		if(!file.exists()) {
			return;
		}
		if(file.isFile()) {
			System.out.println(file.getName());
			return;
		}
		for(File f:file.listFiles()) {
			listAllFiles(f);
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String src="abc";
		FileInputStream f=new FileInputStream(src);
		FileReader fr=new FileReader(src);
	}

}
