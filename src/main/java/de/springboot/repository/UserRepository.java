package de.springboot.repository;


import org.springframework.data.repository.CrudRepository;
import de.springboot.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
