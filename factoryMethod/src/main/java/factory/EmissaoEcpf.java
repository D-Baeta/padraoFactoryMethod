package factory;

public class EmissaoEcpf implements IEmissao{
    public String emitir() { return "Ecpf Emitido";}

    public String revogar() { return "Ecpf Revogado";}
}