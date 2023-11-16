package org.example.heranca;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PacienteTest {

    @Test
    public void testGetTelefone() {
        Paciente paciente = new Paciente("Maria", 30, "123456789", "Rua A", "12345678901", "Feminino");
        assertEquals("123456789", paciente.getTelefone());
    }

    @Test
    public void testGetEndereco() {
        Paciente paciente = new Paciente("Maria", 30, "123456789", "Rua A", "12345678901", "Feminino");
        assertEquals("Rua A", paciente.getEndereco());
    }

    @Test
    public void testGetCpf() {
        Paciente paciente = new Paciente("Maria", 30, "123456789", "Rua A", "12345678901", "Feminino");
        assertEquals("12345678901", paciente.getCpf());
    }

    @Test
    public void testGetSexo() {
        Paciente paciente = new Paciente("Maria", 30, "123456789", "Rua A", "12345678901", "Feminino");
        assertEquals("Feminino", paciente.getSexo());
    }
}
