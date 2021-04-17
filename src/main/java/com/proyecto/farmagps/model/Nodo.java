package com.proyecto.farmagps.model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Nodo {

    private String nombre;

    private LinkedList<Nodo> caminoMasCorto = new LinkedList<>();

    private Integer distancia = Integer.MAX_VALUE;

    private Map<Nodo, Integer> nodosAdyacentes = new HashMap<>();

    public Nodo(String nombre) {
        this.nombre = nombre;
    }

    public void agregarDestino(Nodo destino, int distancia) {
        nodosAdyacentes.put(destino, distancia);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Map<Nodo, Integer> getNodosAdyacentes() {
        return nodosAdyacentes;
    }

    public void setNodosAdyacentes(Map<Nodo, Integer> adjacentNodes) {
        this.nodosAdyacentes = adjacentNodes;
    }

    public Integer getDistancia() {
        return distancia;
    }

    public void setDistancia(Integer distance) {
        this.distancia = distance;
    }

    public List<Nodo> getCaminoMasCorto() {
        return caminoMasCorto;
    }

    public void setCaminoMasCorto(LinkedList<Nodo> shortestPath) {
        this.caminoMasCorto = shortestPath;
    }

    @Override
    public String toString() {
        Iterator<Nodo> it = this.getNodosAdyacentes().keySet().iterator();
        StringBuilder sb = new StringBuilder();
        sb.append("Lista de adyacencia de la farmacia ");
        sb.append(this.getNombre());
        sb.append(":\n");
        while (it.hasNext()) {
            Nodo data = it.next();
            sb.append("\n");
            sb.append(data.getNombre());
            sb.append(" se encuentra a ");
            sb.append(data.getDistancia());
            sb.append(" metros de distancia");
        }
        return sb.toString();
    }
}
