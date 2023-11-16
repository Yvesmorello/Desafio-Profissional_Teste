package org.example.heranca;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedicoTest {

    @Test
    public void testGetCrm() {
        Medico medico = new Medico("Dr. João", 40, "12345", "Cardiologia", "UBS A");
        assertEquals("12345", medico.getCrm());
    }

    @Test
    public void testGetEspecialidade() {
        Medico medico = new Medico("Dr. João", 40, "12345", "Cardiologia", "UBS A");
        assertEquals("Cardiologia", medico.getEspecialidade());
    }

    @Test
    public void testGetUbsAtua() {
        Medico medico = new Medico("Dr. João", 40, "12345", "Cardiologia", "UBS A");
        assertEquals("UBS A", medico.getUbsAtua());
    }
}