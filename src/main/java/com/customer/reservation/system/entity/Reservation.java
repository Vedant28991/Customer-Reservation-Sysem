package com.customer.reservation.system.entity;

import java.time.LocalDate;
import java.time.LocalTime;

public class Reservation {
	
	private Integer reservationId;
	private LocalTime startTime;
	private String day;
	private LocalDate date;
	private Integer duration; 
	private String retired; 
	private String status; 
	private Integer employeeId;

}
