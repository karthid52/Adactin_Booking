package com.stepdefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import com.Adactin.Runner.Test_Runner;
import com.Baseclass.Base_Class;
import com.PageObjectManager.Page_Object_Manager;
import com.Properties.Sdp.File_Reader_Manger;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_def extends Base_Class {
	public static WebDriver driver = Test_Runner.driver;
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	@Given("user Launch the Application")
	public void user_launch_the_application() throws Throwable {

		String url = File_Reader_Manger.getInstanceFRM().getInstanceCR().getUrl();
		getUrl(url);
	}
	@When("user Enter the Valid {string} in Username Field")
	public void user_enter_the_valid_in_username_field(String username) {
	    sentvalue(pom.getInstanceLp().getUsername(), username);
	}
	@When("user Enter The Valid {string} in Password Field")
	public void user_enter_the_valid_in_password_field(String password) {
	    sentvalue(pom.getInstanceLp().getPassword(), password);
	}


	@Then("user Click On Login Button And It Navigetes To The Search Hotel Page")
	public void user_click_on_login_button_and_it_navigetes_to_the_search_hotel_page() throws Throwable {
		clickonElement(pom.getInstanceLp().getLogin());
	}

	@When("user Select The Hotel Location")
	public void user_select_the_hotel_location() {
		dropdown(pom.getInstanceHs().getLocation(), "byindex", "2");
	}

	@When("user Select The Hotel")
	public void user_select_the_hotel() {
		dropdown(pom.getInstanceHs().getHotels(), "byindex", "2");
	}

	@When("user Select The Room Type")
	public void user_select_the_room_type() {
		dropdown(pom.getInstanceHs().getRoomtype(), "byindex", "2");
	}

	@When("user Select The Number of Rooms")
	public void user_select_the_number_of_rooms() {
		dropdown(pom.getInstanceHs().getRoom_nos(), "byindex", "1");
	}

	@When("user Enter The Check In Date")
	public void user_enter_the_check_in_date() {
		sentvalue(pom.getInstanceHs().getDatepick_in(), "05/03/2022");
	}

	@When("user Enter The Check Out Date")
	public void user_enter_the_check_out_date() {
		sentvalue(pom.getInstanceHs().getDatepick_out(), "06/03/2022");
	}

	@When("user Select The Adults Per Room")
	public void user_select_the_adults_per_room() {
		dropdown(pom.getInstanceHs().getAdult_room(), "byindex", "1");
	}

	@When("user Select The children per Room")
	public void user_select_the_children_per_room() {
		dropdown(pom.getInstanceHs().getChild_room(), "byindex", "1");
	}

	@Then("user click On Search Button And It Navigates To The Select Hotel Page")
	public void user_click_on_search_button_and_it_navigates_to_the_select_hotel_page() {
		clickonElement(pom.getInstanceHs().getSubmit());
	}

	@When("user Select The Hotel Name")
	public void user_select_the_hotel_name() {
		clickonElement(pom.getInstanceSh().getRadiobutton());
	}

	@Then("user Click On Continue Button And It Navigates To The Book A Hotel Page")
	public void user_click_on_continue_button_and_it_navigates_to_the_book_a_hotel_page() {
		clickonElement(pom.getInstanceSh().getContinues());
	}

	@When("user Enter The First Name In First Name Field")
	public void user_enter_the_first_name_in_first_name_field() throws Throwable {
		String name = File_Reader_Manger.getInstanceFRM().getInstanceCR().getFirstname();
		sentvalue(pom.getInstanceBh().getFirst_name(), name);
		
	}

	@When("user Enter The Last Name In Last Name Field")
	public void user_enter_the_last_name_in_last_name_field() throws Throwable {
		String name = File_Reader_Manger.getInstanceFRM().getInstanceCR().getLirstname();
		sentvalue(pom.getInstanceBh().getLast_name(), name);
	}

	@When("user Enter The Billing Address In Address Field")
	public void user_enter_the_billing_address_in_address_field() throws Throwable {
		String address = File_Reader_Manger.getInstanceFRM().getInstanceCR().getAddress();
		sentvalue(pom.getInstanceBh().getAddress(), address);
		
	}	

	@When("user Enter Credit Card No In Credit Card No Field")
	public void user_enter_credit_card_no_in_credit_card_no_field() throws Throwable {
		String cc_num = File_Reader_Manger.getInstanceFRM().getInstanceCR().getCc_num();
		sentvalue(pom.getInstanceBh().getCc_num(), cc_num);
		
	}

	@When("user Select The Credit Card Type")
	public void user_select_the_credit_card_type() {
		dropdown(pom.getInstanceBh().getCc_type(), "byindex", "2");
	}

	@When("user Select Expiry Date And Month")
	public void user_select_expiry_date_and_month() {
		dropdown(pom.getInstanceBh().getCc_exp_month(), "byvalue", "12");
		dropdown(pom.getInstanceBh().getCc_exp_year(), "byvalue", "2022");
	}

	@When("user Enter The Cvv Number")
	public void user_enter_the_cvv_number() throws Throwable {
		String cvv_num = File_Reader_Manger.getInstanceFRM().getInstanceCR().getCvv_num();
		sentvalue(pom.getInstanceBh().getCc_cvv(),cvv_num);
	}

	@Then("User Click On Book Now Button And It Will Navigate To Booking Confirmation Page")
	public void user_click_on_book_now_button_and_it_will_navigate_to_booking_confirmation_page() throws InterruptedException {
		clickonElement(pom.getInstanceBh().getBook_now());
		Thread.sleep(5000);
	}

	@When("user Take Screenshot of The Order Number")
	public void user_take_screenshot_of_the_order_number() throws IOException {
		ScrollonElement(pom.getInstanceBc().getSearch_hotel());
		Takescreenshot("pic1");
	}

	@When("user Click On The Logout Button And It Will Navigate To LogOut Page")
	public void user_click_on_the_logout_button_and_it_will_navigate_to_log_out_page() {
		clickonElement(pom.getInstanceBc().getLog_out());
	}

	@Then("user Take Screenshot of The Logout Page")
	public void user_take_screenshot_of_the_logout_page() throws IOException {
		Takescreenshot("pic2");
	}

}
