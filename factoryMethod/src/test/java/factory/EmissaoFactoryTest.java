package factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmissaoFactoryTest {

    @Test
    void deveRetornarExcecaoParaCertificadoInexistente() {
        try {
            IEmissao emissao = EmissaoFactory.obterCertificado("Protecweb");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Certificado Inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaCertificadoInvalido() {
        try {
            IEmissao emissao = EmissaoFactory.obterCertificado("Nfe");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Certificado Inválido", e.getMessage());
        }
    }



}