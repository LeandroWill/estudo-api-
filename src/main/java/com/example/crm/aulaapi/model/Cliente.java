package com.example.crm.aulaapi.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Data
@Entity
public class Cliente {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;

        @Column(nullable = false)
        private String nome;


}
