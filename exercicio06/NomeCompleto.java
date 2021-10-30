package exercicio06;

public class NomeCompleto {
    private String nomeProprio;
    private String nomedoMeio;
    private String nomedaFamilia;

    public NomeCompleto(String nomeProprio, String nomedoMeio, String nomedaFamilia) {
        this.nomeProprio = nomeProprio;
        this.nomedoMeio = nomedoMeio;
        this.nomedaFamilia = nomedaFamilia;
    }

    public String getNomeProprio() {
        return nomeProprio;
    }

    public void setNomeProprio(String nomeProprio) {
        this.nomeProprio = nomeProprio;
    }

    public String getNomedoMeio() {
        return nomedoMeio;
    }

    public void setNomedoMeio(String nomedoMeio) {
        this.nomedoMeio = nomedoMeio;
    }

    public String getNomedaFamilia() {
        return nomedaFamilia;
    }

    public void setNomedaFamilia(String nomedaFamilia) {
        this.nomedaFamilia = nomedaFamilia;
    }

    public String rubrica() {
        return this.getNomeProprio().toLowerCase().charAt(0) + "" +
                this.getNomedoMeio().toLowerCase().charAt(0) + "" +
                this.getNomedaFamilia().toLowerCase().charAt(0);
    }

    public String assinatura() {
        return this.getNomeProprio().toUpperCase().charAt(0) + "." +
                this.getNomedoMeio().toUpperCase().charAt(0) + "." +
                this.getNomedaFamilia();

    }

}
