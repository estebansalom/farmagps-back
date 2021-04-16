package com.proyecto.farmagps;

import com.proyecto.farmagps.model.HashNode;
import com.proyecto.farmagps.model.HashQueue;
import com.proyecto.farmagps.model.TablaHash;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FarmagpsApplication {
	private static TablaHash hash = new TablaHash(25);


	public static void main(String[] args) {
		SpringApplication.run(FarmagpsApplication.class, args);
		System.out.println("is ronin :)");
//		hash.add("La Bomba");
//		hash.add("Fischel San Pedro");
//		hash.add("Sucre La Sabana");
//		System.out.println(hash.find("La Bomba").toString());
	}

}
