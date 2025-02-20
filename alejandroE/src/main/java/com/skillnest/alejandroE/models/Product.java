package com.skillnest.alejandroE.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
@Table(name = "products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id // PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String  name;

    private double price;

    @Column(columnDefinition = "TEXT") // cambiar el tipo de dato de la columna, name , length
    private String description;

    @DateTimeFormat (pattern = "yyyy-MM-dd")
    private Date createdAt;

    @PrePersist     // Antes de generar el registro se ejecuta
    protected void generateDate(){
        this.createdAt = new Date();
    }

//    @PreUpdate
//    protected void generateDate(){
//        this.update = new Date();
//    }

}
