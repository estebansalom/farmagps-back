package com.proyecto.farmagps;

import java.util.Iterator;

import com.proyecto.farmagps.model.Dijkstra;
import com.proyecto.farmagps.model.Grafo;
import com.proyecto.farmagps.model.HashNode;
import com.proyecto.farmagps.model.HashQueue;
import com.proyecto.farmagps.model.Nodo;
import com.proyecto.farmagps.model.TablaHash;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FarmagpsApplication {
	private static TablaHash hash = new TablaHash(25);

	public static void main(String[] args) {
		SpringApplication.run(FarmagpsApplication.class, args);
		System.out.println("is ronin :)");
		pruebaGrafo();
		// hash.add("La Bomba");
		// hash.add("Fischel San Pedro");
		// hash.add("Sucre La Sabana");
		// System.out.println(hash.find("La Bomba").toString());
	}

	private static void pruebaGrafo() {
		Nodo nodeA = new Nodo("Sucre");
		Nodo nodeB = new Nodo("Bomba");
		Nodo nodeC = new Nodo("AutoMercado");

		nodeA.agregarDestino(nodeB, 2);
		nodeA.agregarDestino(nodeC, 3);
		
		nodeB.agregarDestino(nodeC, 9);
		// Nodo nodeD = new Nodo("D");
		// Nodo nodeE = new Nodo("E");
		// Nodo nodeF = new Nodo("F");

		// nodeA.agregarDestino(nodeB, 10);
		// nodeA.agregarDestino(nodeC, 15);

		// nodeB.agregarDestino(nodeD, 12);
		// nodeB.agregarDestino(nodeF, 15);

		// nodeC.agregarDestino(nodeE, 10);

		// nodeD.agregarDestino(nodeE, 2);
		// nodeD.agregarDestino(nodeF, 1);

		// nodeF.agregarDestino(nodeE, 5);

		Grafo graph = new Grafo();

		graph.addNode(nodeA);
		graph.addNode(nodeB);
		graph.addNode(nodeC);
		// graph.addNode(nodeD);
		// graph.addNode(nodeE);
		// graph.addNode(nodeF);

		graph = Dijkstra.calcularCaminoMasCortoDesdeOrigen(graph, nodeA);
		Iterator<Nodo> it = graph.getFarmacias().iterator();
		while (it.hasNext()) {
			Nodo n = it.next();
			System.out.println(n.toString());
			System.out.println();
		}
	}
}
