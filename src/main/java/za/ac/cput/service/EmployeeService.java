package za.ac.cput.service;

import org.springframework.stereotype.Service;
import za.ac.cput.entity.Employee;
import za.ac.cput.repository.employee.IEmployeeRepository;
import za.ac.cput.service.employee.IEmployeeService;

import javax.persistence.EntityNotFoundException;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class EmployeeService implements IEmployeeService{
    private IEmployeeRepository repository;

    private EmployeeService(IEmployeeRepository repository){this.repository = repository;}


    @Override
    public Employee create(Employee employee){return this.repository.save(employee);}

    @Override
    public Employee read(String employeeID){
        return this.repository.findById(employeeID).orElseThrow(() -> new EntityNotFoundException("employee with id " + employeeID + " was not found" ));
    }

    @Override
    public Employee update(Employee employee){
        if(this.repository.existsById(employee.getEmployeeNumber()))
            return this.repository.save(employee);
        return null;
    }

    @Override
    public boolean delete(String employeeID){
        this.repository.deleteById(employeeID);
        if(this.repository.existsById(employeeID))
            return false;
        else
            return true;
    }

    @Override
    public Set<Employee> getAll(){
        return this.repository.findAll().stream().collect(Collectors.toSet());
    }


}
