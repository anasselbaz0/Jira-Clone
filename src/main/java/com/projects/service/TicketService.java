package com.projects.service;

import com.projects.entity.Ticket;
import com.projects.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    public List<Ticket> getAll() {
        return ticketRepository.findAll();
    }

    public Ticket addOrUpdate(Ticket u) {
        return ticketRepository.save(u);
    }

    public void delete(Long id) {
        ticketRepository.deleteById(id);
    }

}
