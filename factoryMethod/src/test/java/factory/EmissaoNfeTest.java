package factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmissaoNfeTest {
    @Test
    void deveEmitirEcpf(){
        IEmissao emissao = EmissaoFactory.obterCertificado("Nfe");
        assertEquals("Nfe Emitido", emissao.emitir());
    }

    @Test
    void deveRevogarEcpf(){
        IEmissao emissao = EmissaoFactory.obterCertificado("Nfe");
        assertEquals("Nfe Revogado", emissao.revogar());
    }

}