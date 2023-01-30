package com.customer.reservation.system.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.customer.reservation.system.entity.Employee;

import io.swagger.annotations.ApiOperation;


@Controller
public class EmployeeController {
   
   @ApiOperation(value = "Testing Page")
   @RequestMapping(path={"/"},method=RequestMethod.GET)
   public String sayHello(Model model) {
      model.addAttribute("message","Hello Spring MVC!");
     
      //Java 8 LocalDate
      DateTimeFormatter formatter=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
      LocalDate date=LocalDate.now();
      model.addAttribute("date", date.format(formatter));
      
      return "index";
   }
   
   @ApiOperation(value = "Gets All Employees")
   @ResponseBody
   @RequestMapping(path={"/getAllEmployees"},method=RequestMethod.GET, produces = "application/json")
   public Employee getAllEmployeeso() {
	   
	   Employee emp = new Employee();
	   emp.setEmployeeId(123);
	   emp.setMailId("employee@email.com");
	   emp.setName("Darshan H K");
	   emp.setPhoneNo("1234567890");
	   emp.setProject("ING");
	   
      
      return emp;
   }
}
