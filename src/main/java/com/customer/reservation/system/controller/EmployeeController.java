package com.customer.reservation.system.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.customer.reservation.system.entity.Employee;

import io.swagger.annotations.ApiOperation;


@RestController
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
   @GetMapping(path={"/getAllEmployees/{id}"}, produces = "application/json")
   public Employee getAllEmployeeso(@PathVariable("id") Integer id ) {
	   
	   Employee emp = new Employee();
	   
	   emp.setEmployeeId(id);
	   emp.setAddress("Bangalore");
	   emp.setName("ABC");
	   emp.setPhoneNo("0987654321");
	   emp.setDepartmentId(1);
      
      return emp;
   }
   
   @PostMapping(value = "/employees")
   @ResponseBody
   public Employee addEmployees(@RequestBody Employee e){
       
	   Employee emp = new Employee();
	   
	   emp.setEmployeeId(e.getEmployeeId());
	   emp.setAddress(e.getAddress());
	   emp.setName(e.getName());
	   emp.setPhoneNo(e.getPhoneNo());
	   emp.setDepartmentId(e.getDepartmentId());
      
      return emp;
		
	}

}
