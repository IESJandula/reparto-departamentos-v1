package com.example.Reparto_Departamentos.service;

import com.example.Reparto_Departamentos.repository.AsignaturasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AsignaturaService {
    // Inyección automática de la dependencia PistaRepository
    @Autowired
    private AsignaturasRepository repositorioAsignaturas;

}
