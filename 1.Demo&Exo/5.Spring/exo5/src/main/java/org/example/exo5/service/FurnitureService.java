package org.example.exo5.service;

import org.example.exo5.dao.FurnitureRepository;
import org.example.exo5.entity.CartItem;
import org.example.exo5.entity.Furniture;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FurnitureService {
    private final FurnitureRepository furnitureRepository;

    public FurnitureService(FurnitureRepository furnitureRepository) {
        this.furnitureRepository = furnitureRepository;
    }

    public List<Furniture> getAllFurniture() {
        return furnitureRepository.findAll();
    }


    public Furniture saveFurniture(Furniture furniture) {
        return furnitureRepository.save(furniture);
    }

    public Furniture getFurnitureById(Long id) {
        return furnitureRepository.findById(id).orElse(null);
    }
    public void delete(Long id){
        furnitureRepository.deleteById(id);
    }
}