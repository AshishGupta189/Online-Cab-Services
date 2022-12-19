package com.masai.Service.Admin;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.masai.Entities.Admin;
import com.masai.Entities.Booking;
import com.masai.Entities.Cab;
import com.masai.Entities.Customer;
import com.masai.Entities.Driver;
import com.masai.Exception.AdminException;
import com.masai.Exception.DriverException;



public interface AdminService {

	
	public List<Booking> findByBookingStatus(Boolean bookingstatus);
	
	public Admin createAdmin(Admin admin);
	
	public Driver addDriverbyAdmin(Driver driver,String sessionid); // in driver
	
	public Driver deleteDriver(Integer id) throws DriverException; // in driver
	
	public Admin deleteAdmin(String sessionid) throws AdminException;
	
	public Admin updateAdmin(Admin admin,String sessionid);
	
	public String updatePassword(String email,String phone,String password);
	
	public Admin viewAdminDetails(String sessionid);
	
	public List<Admin> viewAdmins(String sessionid);
	
	public List<Booking> viewBookings(String sessionid); // in booking
	
	public List<Booking> viewBookingsByDate(String date,String sessionid); // in booking
	
	public List<Booking> viewBookingsByDateSpan(String startdate,String enddate,String sessionid); // in booking
}
