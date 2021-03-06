package com.projects.entity;

import com.projects.entity.enumerations.Role;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String email;
    private String password;
    private String name;
    private Role role;
    @ManyToMany
    @JoinTable(name="collaborate")
    private Collection<Project> projects;
    @OneToMany(mappedBy="writer")
    private Collection<Ticket> myTickets;
    @OneToMany(mappedBy="assigned")
    private Collection<Ticket> assignedTickets;

    public User() {
    }

    public User(Long id, String email, String password, String name, Role role) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.name = name;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
