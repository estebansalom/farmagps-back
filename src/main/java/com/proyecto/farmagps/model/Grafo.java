package com.proyecto.farmagps.model;

import java.util.HashSet;
import java.util.Set;

public class Grafo {
    private Set<Nodo> farmacias = new HashSet<>();

    public void addNode(Nodo farmacia) {
        farmacias.add(farmacia);
    }

    public Set<Nodo> getFarmacias() {
        return this.farmacias;
    }
}
