package de.solovyov.spring.app.repos;

import de.solovyov.spring.app.domain.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
