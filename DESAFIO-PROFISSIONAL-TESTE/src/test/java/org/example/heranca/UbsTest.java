package org.example.heranca;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UbsTest {

    @Test
    public void testGetLocal() {
        Ubs ubs = new Ubs("Hospital A", 1L, "UBS Central", "Rua Principal", "08:00 - 17:00");
        assertEquals("Hospital A", ubs.getLocal());
    }

    @Test
    public void testGetId() {
        Ubs ubs = new Ubs("Hospital A", 1L, "UBS Central", "Rua Principal", "08:00 - 17:00");
        assertEquals(1L, ubs.getId());
    }

    @Test
    public void testGetNome() {
        Ubs ubs = new Ubs("Hospital A", 1L, "UBS Central", "Rua Principal", "08:00 - 17:00");
        assertEquals("UBS Central", ubs.getNome());
    }

    @Test
    public void testGetEndereco() {
        Ubs ubs = new Ubs("Hospital A", 1L, "UBS Central", "Rua Principal", "08:00 - 17:00");
        assertEquals("Rua Principal", ubs.getEndereco());
    }

    @Test
    public void testGetHoraFuncionamento() {
        Ubs ubs = new Ubs("Hospital A", 1L, "UBS Central", "Rua Principal", "08:00 - 17:00");
        assertEquals("08:00 - 17:00", ubs.getHoraFuncionamento());
    }
}
