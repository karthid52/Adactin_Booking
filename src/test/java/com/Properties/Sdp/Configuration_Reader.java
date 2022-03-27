package com.Properties.Sdp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;
	
	public Configuration_Reader() throws Throwable {
		File f=new File("C:\\Users\\Baskar\\eclipse-workspace\\AdactinCucumber\\Adactin.properties");
		FileInputStream fis=new FileInputStream(f);
		p=new Properties();
		p.load(fis);
		
	}
	
	public String getUrl() {
		String url = p.getProperty("url");
		return url;	

	}
	public String getUsername() {
		String username = p.getProperty("username");
		return username;
	}
	public String getPassword() {
		String password = p.getProperty("password");
		return password;
	}
	
	public String getIn_date() {
		String date = p.getProperty("in_date");
		return date;
	}
	
	public String getOut_date() {
		String date = p.getProperty("out_date");
		return date;
	}
	
	public String getFirstname() {
		String name = p.getProperty("firstname");
		return name;
	}
	
	public String getLirstname() {
		String name = p.getProperty("lastname");
		return name;
	}
	
	public String getAddress() {
		String address = p.getProperty("address");
		return address;
	}
	public String getCc_num() {
		String cc = p.getProperty("cc_num");
		return cc;
	}
	
	public String getCvv_num() {
		String cc = p.getProperty("cvv_num");
		return cc;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
