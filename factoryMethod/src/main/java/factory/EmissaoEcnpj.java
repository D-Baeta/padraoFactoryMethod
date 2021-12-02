package factory;

public class EmissaoEcnpj implements IEmissao{
    public String emitir() { return "Ecnpj Emitido";}

    public String revogar() { return "Ecnpj Revogado";}
}