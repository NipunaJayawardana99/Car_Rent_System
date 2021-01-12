package lk.ijse.car_rent.repo;

import lk.ijse.car_rent.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String> {
}
