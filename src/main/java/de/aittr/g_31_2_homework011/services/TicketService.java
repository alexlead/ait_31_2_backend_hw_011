package de.aittr.g_31_2_homework011.services;

import de.aittr.g_31_2_homework011.domain.Ticket;
import de.aittr.g_31_2_homework011.repositories.TicketRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {

    private TicketRepository repository;

    public TicketService(TicketRepository repository) {
        this.repository = repository;
    }

    public List<Ticket> getAll() {
        return repository.findAll();
    }

    public List<Ticket> getByCountry(String country) {
        return repository.getByCountry(country);
    }

}
