package factory;

public class EmissaoFactory {

    public static IEmissao obterCertificado(String certificado) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("factory.Emissao" + certificado);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw  new IllegalArgumentException("Certificado Inexistente");
        }

        if(!(objeto instanceof IEmissao)){
            throw new IllegalArgumentException("Certificado Inválido");
        }

        return (IEmissao) objeto;
    }
}
