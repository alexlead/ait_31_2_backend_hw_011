package de.aittr.g_31_2_homework011.repositories;

import de.aittr.g_31_2_homework011.domain.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {

    @Query(value = "SELECT * FROM ticket WHERE destination LIKE CONCAT('%',:country,'%')", nativeQuery = true)
    List<Ticket> getByCountry(@Param("country") String country);
}
