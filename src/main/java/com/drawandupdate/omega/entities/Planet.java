package com.drawandupdate.omega.entities;

import javax.persistence.*;

@Entity
public class Planet {
    @Id
    @GeneratedValue
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Game game;
    @ManyToOne(fetch = FetchType.EAGER)
    private Player owner;
    private long ships;
}
