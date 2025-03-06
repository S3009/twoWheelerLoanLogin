package in.shriram.dreambiketwowheelerloan.login.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.shriram.dreambiketwowheelerloan.login.model.Customer;

@Repository
public interface LoginRepository extends JpaRepository<Customer, Integer> {

}
