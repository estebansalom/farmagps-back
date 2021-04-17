package com.proyecto.farmagps.model;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;

public class Dijkstra {
    public static Grafo calcularCaminoMasCortoDesdeOrigen(Grafo grafo, Nodo origen) {

        origen.setDistancia(0);

        Set<Nodo> settledNodes = new HashSet<>();
        Set<Nodo> unsettledNodes = new HashSet<>();
        unsettledNodes.add(origen);

        while (unsettledNodes.size() != 0) {
            Nodo currentNode = getDistanciaMasCorta(unsettledNodes);
            unsettledNodes.remove(currentNode);
            for (Entry<Nodo, Integer> adjacencyPair : currentNode.getNodosAdyacentes().entrySet()) {
                Nodo adjacentNode = adjacencyPair.getKey();
                Integer edgeWeigh = adjacencyPair.getValue();

                if (!settledNodes.contains(adjacentNode)) {
                    CalcularDistanciaMinima(adjacentNode, edgeWeigh, currentNode);
                    unsettledNodes.add(adjacentNode);
                }
            }
            settledNodes.add(currentNode);
        }
        return grafo;
    }

    private static void CalcularDistanciaMinima(Nodo evaluationNode, Integer edgeWeigh, Nodo sourceNode) {
        Integer sourceDistance = sourceNode.getDistancia();
        if (sourceDistance + edgeWeigh < evaluationNode.getDistancia()) {
            evaluationNode.setDistancia(sourceDistance + edgeWeigh);
            LinkedList<Nodo> shortestPath = new LinkedList<>(sourceNode.getCaminoMasCorto());
            shortestPath.add(sourceNode);
            evaluationNode.setCaminoMasCorto(shortestPath);
        }
    }

    private static Nodo getDistanciaMasCorta(Set<Nodo> unsettledNodes) {
        Nodo lowestDistanceNode = null;
        int lowestDistance = Integer.MAX_VALUE;
        for (Nodo node : unsettledNodes) {
            int nodeDistance = node.getDistancia();
            if (nodeDistance < lowestDistance) {
                lowestDistance = nodeDistance;
                lowestDistanceNode = node;
            }
        }
        return lowestDistanceNode;
    }
}
