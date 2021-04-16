package com.proyecto.farmagps.model;

import javax.persistence.*;

@Entity
public class Adyacency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "cost", nullable = true)
    private float cost;

    @ManyToOne
    @MapsId("id")
    private Farmacia from;

    @ManyToOne
    @MapsId("id")
    private Farmacia to;

    public Adyacency(int id, float cost){
        super();
        this.id = id;
        this.setCost(cost);
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
