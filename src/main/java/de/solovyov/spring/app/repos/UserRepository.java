package de.solovyov.spring.app.repos;

import de.solovyov.spring.app.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}
