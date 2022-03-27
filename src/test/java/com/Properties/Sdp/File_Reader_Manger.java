package com.Properties.Sdp;

public class File_Reader_Manger {

	
	public Configuration_Reader getInstanceCR() throws Throwable {

		Configuration_Reader cr=new Configuration_Reader();
		return cr;
	}
	
	public static File_Reader_Manger getInstanceFRM() {
		File_Reader_Manger frm=new File_Reader_Manger();
		return frm;
	}
	private File_Reader_Manger() {
	
	}
	
	
	
}
