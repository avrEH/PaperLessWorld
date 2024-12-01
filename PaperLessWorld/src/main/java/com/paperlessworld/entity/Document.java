package com.paperlessworld.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fileName;

    @Lob
    private byte[] fileData;

    @ManyToOne
    private User user;
}

