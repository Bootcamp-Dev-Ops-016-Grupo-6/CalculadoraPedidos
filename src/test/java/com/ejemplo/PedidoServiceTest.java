package com.ejemplo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class PedidoServiceTest {

    @Mock
    private DescuentoRepository descuentoRepository;

    private PedidoService service;

    @BeforeEach
    void setUp() {
        service = new PedidoService(descuentoRepository);
    }

    @Test
    void testSinDescuentoYEnvioNormal() {
        when(descuentoRepository.obtenerPorcentaje(null)).thenReturn(0.0);
        double total = service.calcularTotal(100, null, false);
        assertEquals(110.0, total); // (100 * 1) + 10 = 110
    }

    @Test
    void testConDescuentoYEnvioExpress() {
        when(descuentoRepository.obtenerPorcentaje("DESC10")).thenReturn(0.10);
        double total = service.calcularTotal(100, "DESC10", true);
        assertEquals(110.0, total); // (100 * 0.9) + 20 = 110
    }

    @Test
    void testConDescuentoYEnvioNormal() {
        when(descuentoRepository.obtenerPorcentaje("DESC10")).thenReturn(0.10);
        double total = service.calcularTotal(200, "DESC10", false);
        assertEquals(190.0, total); // (200 * 0.9) + 10 = 190
    }

    @Test
    void testSinDescuentoYEnvioExpress() {
        when(descuentoRepository.obtenerPorcentaje(null)).thenReturn(0.0);
        double total = service.calcularTotal(150, null, true);
        assertEquals(170.0, total); // (150 * 1) + 20 = 170
    }
}