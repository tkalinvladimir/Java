package net.tkalin.mytrelloapp.dao;

import net.tkalin.mytrelloapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
    User findByUserName(String username);
}
