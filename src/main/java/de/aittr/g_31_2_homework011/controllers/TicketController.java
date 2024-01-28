package de.aittr.g_31_2_homework011.controllers;

import de.aittr.g_31_2_homework011.domain.Ticket;
import de.aittr.g_31_2_homework011.services.TicketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    private TicketService service;

    public TicketController(TicketService service) {
        this.service = service;
    }

    @GetMapping
    public List<Ticket> getAll() {
        return service.getAll();
    }

    @GetMapping("/{country}")
    public List<Ticket> getByCountry(@PathVariable String country) {
        return service.getByCountry(country);
    }

}
