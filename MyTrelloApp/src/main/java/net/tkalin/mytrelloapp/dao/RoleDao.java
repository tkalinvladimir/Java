package net.tkalin.mytrelloapp.dao;

import net.tkalin.mytrelloapp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {

}
