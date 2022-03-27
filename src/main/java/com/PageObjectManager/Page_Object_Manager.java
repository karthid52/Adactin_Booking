package com.PageObjectManager;

import org.openqa.selenium.WebDriver;

import com.PomClass.Book_hotel;
import com.PomClass.Booking_confirmation;
import com.PomClass.Hotel_Search;
import com.PomClass.Login_Page;
import com.PomClass.Select_hotel;

public class Page_Object_Manager {

	
	
	
	
	public WebDriver driver;
	private Login_Page lp;
	private Hotel_Search hs;
	private Book_hotel bh;
	private Select_hotel sh;
	private Booking_confirmation bc;
	
	public Page_Object_Manager(WebDriver driver2) {
		this.driver=driver2;
	}



	public Login_Page getInstanceLp() {
		 lp=new Login_Page(driver);
		 return lp;
	}
	
	public Hotel_Search getInstanceHs() {
		hs=new Hotel_Search(driver);
		return hs;

	}
		public Book_hotel getInstanceBh() {
			bh=new Book_hotel(driver);
			return bh;

		}
		public Select_hotel getInstanceSh() {
			sh=new Select_hotel(driver);
			return sh;			
		}
	
		public Booking_confirmation getInstanceBc() {
			bc=new Booking_confirmation(driver);
			return bc;
		}
	
	}




