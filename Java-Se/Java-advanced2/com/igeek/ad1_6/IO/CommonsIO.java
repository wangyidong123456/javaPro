package com.igeek.ad1_6.IO;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.*;

public class CommonsIO {
	//* �༶�ļ��и���:
	//* copyDirectoryToDirectory(File srcDir,File destDir);�ļ��и���

	public static void main(String[] args) {
		File srcDir= new File("D:/KGMusic");
		File destDir= new File("e:/");
		try {
			FileUtils.copyDirectoryToDirectory(srcDir, destDir);
//			FilenameUtils.getName("");
//			FilenameUtils fu=new FilenameUtils();
//			fu.getExtension(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
