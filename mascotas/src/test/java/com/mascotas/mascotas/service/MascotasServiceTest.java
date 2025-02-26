package com.mascotas.mascotas.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.mascotas.mascotas.model.Mascotas;
import com.mascotas.mascotas.repository.MascotasRepository;

@ExtendWith(MockitoExtension.class)
public class MascotasServiceTest {
    @InjectMocks
    private MascotasServiceImpl mascotasServicio;

    @Mock
    private MascotasRepository mascotasRepositoryMock;

    @Test
    public void guardarMascotasTest(){

        Mascotas mascotas = new Mascotas();
        mascotas.setTipoProducto("master Dog 20kg");

        when(mascotasRepositoryMock.save(any())).thenReturn(mascotas);

        Mascotas resultado = mascotasServicio.createMascotas(mascotas);

        assertEquals("master Dog 20kg", resultado.getTipoProducto());
    }

    
}
