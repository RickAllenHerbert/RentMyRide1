package za.ac.cput.repository.employee;
/*
    @Description:Repository ->
    @Author: Tyronne Lloyd Hendricks
    @Student Number: 215141210
    @Date: 19 July 2021
*/
import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.entity.Employee;
import za.ac.cput.repository.IRepository;
import java.util.Set;

public interface IEmployeeRepository extends JpaRepository<Employee, String> {
}
