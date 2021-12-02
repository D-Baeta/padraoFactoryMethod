package factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmissaoEcnpjTest {

    @Test
    void deveEmitirEcpf(){
        IEmissao emissao = EmissaoFactory.obterCertificado("Ecnpj");
        assertEquals("Ecnpj Emitido", emissao.emitir());
    }

    @Test
    void deveRevogarEcpf(){
        IEmissao emissao = EmissaoFactory.obterCertificado("Ecnpj");
        assertEquals("Ecnpj Revogado", emissao.revogar());
    }

}