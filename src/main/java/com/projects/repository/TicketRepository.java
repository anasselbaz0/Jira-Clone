package com.projects.repository;

import com.projects.entity.Ticket;
import com.projects.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
