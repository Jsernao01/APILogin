package com.example.APILogin.repositorios;

import com.example.APILogin.modelos.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonajesRepositorio extends JpaRepository<Personaje, Integer> {
}
