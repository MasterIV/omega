package com.drawandupdate.omega.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Game {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String password;
    private long turn;
}
