package com.example.services;

import com.example.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save( Vet vet);
    Set< Vet> findAll();
}
