package com.mascotas.mascotas.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mascotas.mascotas.model.Mascotas;

public class MascotasRepositoryTest {

    @Autowired
    private MascotasRepository mascotasRepository;

    @Test
    public void guardarMascotasTest(){

        Mascotas mascotas = new Mascotas();
        mascotas.setTipoProducto("Master Cat 10kg");

        Mascotas resultado = mascotasRepository.save(mascotas);

        assertNotNull(resultado.getId());
        assertEquals("Master Cat 10kg", resultado.getTipoProducto());
    }
    
}
