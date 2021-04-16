package com.proyecto.farmagps.service;

import com.proyecto.farmagps.model.Farmacia;
import com.proyecto.farmagps.model.GrafoFarmacias;
import com.proyecto.farmagps.model.HashNode;
import com.proyecto.farmagps.model.TablaHash;
import com.proyecto.farmagps.repository.FarmaciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FarmaciaServiceImpl implements FarmaciaService {

    private TablaHash hash = new TablaHash(25);
    private GrafoFarmacias grafo = new GrafoFarmacias();


    @Autowired
    FarmaciaRepository farmaRepo;

    public void addFarma(Farmacia f){
        Farmacia res = farmaRepo.save(f);
        this.hash.add(res.getName());
        updateGrafo();
    }

    public List<Farmacia> getFarmas(){
        return farmaRepo.findAll();
    }

    public Farmacia findOneByName(String name){
        HashNode n = hash.find(name);
        if(n!=null){
            return farmaRepo.findOneByName(name);
        }else{
            return null;
        }

    }

    public void updateGrafo(){
        this.grafo.setItems(getFarmas());
    }

    public void addConnection(int idFrom, int idTo){

    }

}
