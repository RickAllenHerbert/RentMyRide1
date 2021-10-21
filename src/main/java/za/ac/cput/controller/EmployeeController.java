package za.ac.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.entity.Car;
import za.ac.cput.entity.Employee;
import za.ac.cput.entity.MultiPurposeUser;
import za.ac.cput.factory.CarFactory;
import za.ac.cput.factory.MultiPurposeUserFactory;
import za.ac.cput.service.CarService;
import za.ac.cput.service.EmployeeService;
import za.ac.cput.service.MultiPurposeUserService;

import java.util.Set;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private MultiPurposeUserService multiService;

    @RequestMapping(value = "/create")
    public Employee create(@RequestBody Employee employee) {
        MultiPurposeUser multiPurposeUser = MultiPurposeUserFactory.createMultiLogin(employee.getEmployeeNumber(),
                employee.getUsername(), employee.getPassword(), employee.getUserType());
        multiService.create(multiPurposeUser);
        return employeeService.create(employee);
    }
    @GetMapping("/read/{id}")
    public Employee read(@PathVariable String id) {
        return employeeService.read(id);
    }

    @RequestMapping("/update")
    public Employee update(@RequestBody Employee employee) {
        Employee employeeUpdate = employeeService.update(employee);
        return employeeUpdate;
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable String id)
    {
        return employeeService.delete(id);
    }


    @RequestMapping(value = "/getall", method = RequestMethod.GET)
    public ResponseEntity<Set<Employee>> getAll(){
        Set<Employee> employees = employeeService.getAll();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

}
