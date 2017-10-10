package com.drawandupdate.omega.entities;

import javax.persistence.*;

@Entity
public class Player {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String color;

    @ManyToOne(fetch = FetchType.LAZY)
    private Game game;
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
}
