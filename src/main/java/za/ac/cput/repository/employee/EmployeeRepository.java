/*
package za.ac.cput.repository.employee;

    @Description:Repository ->
    @Author: Tyronne Lloyd Hendricks
    @Student Number: 215141210
    @Date: 19 July 2021

import za.ac.cput.entity.Employee;

import java.util.HashSet;
import java.util.Set;
@Deprecated
public class EmployeeRepository implements IEmployeeRepository {

    private static EmployeeRepository repository = null;
    private Set<Employee> employeeDS = null;

    private EmployeeRepository(){
        employeeDS = new HashSet<Employee>();
    }

    public static EmployeeRepository getRepository(){
        if(repository == null){
            repository = new EmployeeRepository();
        }
        return repository;
    }

    @Override
    public Employee create(Employee employee) {
        boolean success = employeeDS.add(employee);
        if(!success)
            return null;
        return employee;
    }

    @Override
    public Employee read(String employeeId) {
        for (Employee e: employeeDS)
            if(e.getEmployeeNumber().equalsIgnoreCase(employeeId)){
                return e;
            }
        return null;
    }

    @Override
    public Employee update(Employee employee) {
        Employee oldEmployee = read(employee.getEmployeeNumber());
        if(oldEmployee != null){
            employeeDS.remove(oldEmployee);
            employeeDS.add(employee);
            return employee;
        }
        return null;
    }

    @Override
    public boolean delete(String employeeId) {
        Employee employeeRemoved = read(employeeId);
        if(employeeRemoved == null)
            return false;
        employeeDS.remove(employeeRemoved);
        return true ;
    }

    @Override
    public Set<Employee> getAll() {
        return employeeDS;
    }
}

 */
