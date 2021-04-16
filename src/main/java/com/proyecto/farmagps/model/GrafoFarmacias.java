package com.proyecto.farmagps.model;

import java.util.List;

public class GrafoFarmacias {
    public boolean[][] adyacency;
    public int[][] costs;
    public List<Farmacia> items;

    public GrafoFarmacias(){

    }

    public boolean[][] getAdyacency() {
        return adyacency;
    }

    public int[][] getCosts(){
        return costs;
    }

    public List<Farmacia> getItems(){
        return items;
    }

    public void setItems(List<Farmacia> items) {
        this.items = items;
    }
}
