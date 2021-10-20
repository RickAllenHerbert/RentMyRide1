/* ICarRepository.java
   Repository interface for Car
   Author: Rick Allen Herbert (219014337)
   Date: 24 July 2021
*/
package za.ac.cput.repository.car;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.Car;
import za.ac.cput.repository.IRepository;

import java.util.Set;


@Repository
public interface ICarRepository extends JpaRepository<Car, String> {
}
