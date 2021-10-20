package za.ac.cput.repository.login;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.MultiPurposeUser;

@Repository
public interface IMultiPurposeUserRepository extends JpaRepository<MultiPurposeUser, String> {
}
