package kg.itrun.cashregister.cashregister.repository;

import kg.itrun.cashregister.cashregister.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
