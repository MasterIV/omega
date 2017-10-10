package com.drawandupdate.omega.entities;

import javax.persistence.*;

@Entity
public class Fleet {
    @Id
    @GeneratedValue
    private long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Game game;
    @ManyToOne(fetch = FetchType.EAGER)
    private Player player;
    @ManyToOne(fetch = FetchType.EAGER)
    private Planet destination;
    private long ships;
    private long duration;
}
