package factory;

public class EmissaoCertificadoServidor implements IEmissao{
    public String emitir() { return "CertificadoServidor Emitido";}

    public String revogar() { return "CertificadoServidor Revogado";}
}