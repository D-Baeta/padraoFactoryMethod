package factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmissaoEcpfTest {

    @Test
    void deveEmitirEcpf(){
        IEmissao emissao = EmissaoFactory.obterCertificado("Ecpf");
        assertEquals("Ecpf Emitido", emissao.emitir());
    }

    @Test
    void deveRevogarEcpf(){
        IEmissao emissao = EmissaoFactory.obterCertificado("Ecpf");
        assertEquals("Ecpf Revogado", emissao.revogar());
    }
}