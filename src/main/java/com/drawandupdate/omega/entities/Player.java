package com.drawandupdate.omega.entities;

import org.hibernate.annotations.Fetch;

import javax.persistence.*;

@Entity
public class Player {
    @Id
    @GeneratedValue
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Game game;
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
}
