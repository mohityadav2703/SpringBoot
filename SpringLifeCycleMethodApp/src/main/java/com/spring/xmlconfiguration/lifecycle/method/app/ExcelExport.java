package com.spring.xmlconfiguration.lifecycle.method.app;

public class ExcelExport {
	
	private String fileName;
	private String fileExt;
	
	public ExcelExport() {
		super();
		System.out.println("FROM CONSTRUCTOR");
	}


	public String getFileName() {
		return fileName;
	}
	
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileExt() {
		return fileExt;
	}

	public void setFileExt(String fileExt) {
		this.fileExt = fileExt;
	}


	@Override
	public String toString() {
		return "ExcelExport [fileName=" + fileName + ", fileExt=" + fileExt + "]";
	}
	
	public void setup() {
		System.out.println("FROM INIT METHOD");
	}
	
	public void clear() {
		System.out.println("FROM DESTROY METHOD");
	}

}
