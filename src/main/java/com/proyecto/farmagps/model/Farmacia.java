package com.proyecto.farmagps.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Farmacia {
    @Id
    @Column(name="id", nullable = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "latitude", nullable = false)
    private float latitude;
    @Column(name = "longitude", nullable = false)
    private float longitude;
//    @OneToMany(cascade = CascadeType.MERGE )
//    @JoinTable(name = "connection_id", referencedColumnName = "id")
//    private List<Adyacency> connections;

    public Farmacia(){

    }

    public Farmacia(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public List<FarmaciaAdyacente> getConnections() {
//        return connections;
//    }
//
//    public void setConnections(List<FarmaciaAdyacente> connections) {
//        this.connections = connections;
//    }
//
//    public void addConnection(Farmacia f, int cost){
//        this.connections.add(new FarmaciaAdyacente(f, cost));
//    }
}
