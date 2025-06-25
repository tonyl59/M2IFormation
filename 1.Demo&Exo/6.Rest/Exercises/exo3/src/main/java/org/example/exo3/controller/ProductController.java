package org.example.exo3.controller;

import org.example.exo3.dto.ProductReceiveDto;
import org.example.exo3.dto.ProductResponseDto;
import org.example.exo3.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/product")
public class ProductController {

    private ProductService service;

    public ProductController(ProductService service){
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<ProductResponseDto>> getAll(){
        return ResponseEntity.ok(service.get());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductResponseDto> get (@PathVariable long id){
        return ResponseEntity.ok(service.get(id));
    }

    @PostMapping
    public ResponseEntity<ProductResponseDto> create ( @RequestBody ProductReceiveDto productReceiveDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(productReceiveDto));
    }

    @PutMapping("/{id}") //put met une nouvelle donnée
    public ResponseEntity<ProductResponseDto> update (@PathVariable long id, @RequestBody ProductReceiveDto productReceiveDto){
        return ResponseEntity.ok(service.update(id, productReceiveDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable long id){
        service.delete(id);
        return ResponseEntity.ok(String.format("product at id : %s is deleted", id));

    }

}
