package com.sharmaxz.model;

import javax.persistence.*;

@Entity
@Table(name = "Client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "name")
    String name;
    @Column(name = "surname")
    String surname;
    @Column(name = "email", unique = true)
    String email;
    @Column(name = "password")
    String password;

    public Client(){}

    public Client(String name, String surname, String email, String password) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {return name; }

    public void setName(String name) { this.name = name; }

    public String getSurname() {return surname; }

    public void setSurname(String name) { this.surname = surname; }

    public String getEmail() {return email; }

    public void setEmail(String name) { this.email = email; }

    public String getPassword() {return password; }

    public void setPassword(String name) { this.password = password; }

}
