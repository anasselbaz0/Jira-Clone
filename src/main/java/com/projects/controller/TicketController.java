package com.projects.controller;

import com.projects.entity.Ticket;
import com.projects.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @GetMapping("/tickets")
    public List<Ticket> getAll() {
        return  ticketService.getAll();
    }

    @PostMapping("/tickets")
    public Ticket addOrUpdate(@Valid @RequestBody Ticket p) {
        return  ticketService.addOrUpdate(p);
    }

    @DeleteMapping("/tickets/delete/{id}")
    public void delete(@PathVariable("id") Long id) {
        ticketService.delete(id);
    }

}
