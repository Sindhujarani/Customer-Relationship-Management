package com.example.CMR_Project.controller;
import ch.qos.logback.core.model.Model;
import com.example.CMR_Project.entity.Employee;
import com.example.CMR_Project.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        super();
        this.employeeService = employeeService;
    }

    //handler method to handle list Employee and return mode and view
    @GetMapping("/employees")
    public String listEmployees(Model model) {
//          model.addAttribute("employees",employeeService.getAllEmployees());
        return "employees";
    }
    @GetMapping("/Employees/new")

 public String  createEmployeeForm(Model model){
        //Create client browser to holdclient form data
        Employee employee = new Employee();
//        model.addAllAttriute("employee",employee);
        return "create_employee";
 }
 @PostMapping("/employees")
 public String saveEmployee(@ModelAttribute("Employee")Employee employee){
        employeeService.saveEmployee(employee);
        return "redirect:/employees";
 }

    //updating/Editing
 @GetMapping("/employees/edit/{id}")
    public  String editEmployeeForm(@PathVariable Long id,Model model){
//        model.addAttribute("employee",employeeService.getEmployeeById(id));
        return "edit_employee";

 }

 @PostMapping("/employees/{id}")
 public String updateEmployee(@PathVariable Long id ,@ModelAttribute("employee") Employee employee,Model model){

        //get employee from database by id
     Employee existingEmployee = employeeService.getEmployeeById(id);
     existingEmployee.setID(employee.getID());
     existingEmployee.setName(employee.getName());
     existingEmployee.setEmail(employee.getEmail());
     existingEmployee.setRoleName(employee.getRoleName());
     existingEmployee.setCity(employee.getCity());

     //save Edited employee object
     employeeService.updateEmployee(existingEmployee);
     return "redirect:/employees";
 }

 //hansler method to handle delete student request
    @GetMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable Long id){
        employeeService.deleteEmployeeById(id);
         return "redirect:/employees";
    }
}
