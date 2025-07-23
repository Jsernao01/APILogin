package com.example.APILogin.servicios;

import com.example.APILogin.modelos.Personaje;
import com.example.APILogin.repositorios.IPersonajesRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonajeServicio {

    //El servicio llama al repositorio
    @Autowired //Inyección de dependencia
    IPersonajesRepositorio repositorio;

    //ACTIVO LOS MÉTODOS DE GUARDADO

    public boolean guardarPersonaje(Personaje datosDelPersonaje)throws Exception{
        try {
            repositorio.save(datosDelPersonaje);
            return true;
        }catch(Exception error){
            throw new Exception(error.getMessage());


        }

    }
}
