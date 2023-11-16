package org.example.heranca;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemedioTest {

    @Test
    public void testGetNome() {
        Remedio remedio = new Remedio("Paracetamol", "2023-12-31", 50);
        assertEquals("Paracetamol", remedio.getNome());
    }

    @Test
    public void testGetDataValidade() {
        Remedio remedio = new Remedio("Paracetamol", "2023-12-31", 50);
        assertEquals("2023-12-31", remedio.getDataValidade());
    }

    @Test
    public void testGetQuantidade() {
        Remedio remedio = new Remedio("Paracetamol", "2023-12-31", 50);
        assertEquals(50, remedio.getQuantidade());
    }
}
