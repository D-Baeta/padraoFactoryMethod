package factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmissaoCertificadoServidorTest {

    @Test
    void deveEmitirEcpf(){
        IEmissao emissao = EmissaoFactory.obterCertificado("CertificadoServidor");
        assertEquals("CertificadoServidor Emitido", emissao.emitir());
    }

    @Test
    void deveRevogarEcpf(){
        IEmissao emissao = EmissaoFactory.obterCertificado("CertificadoServidor");
        assertEquals("CertificadoServidor Revogado", emissao.revogar());
    }

}