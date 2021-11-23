package Aula14;

public class Conteiner implements Comparable<Conteiner>{

    private int numero;
    private String descricao;
    private String pais;
    private boolean perigoso;

    public Conteiner(int numero, String descricao, String pais, boolean perigoso) {
        this.numero = numero;
        this.descricao = descricao;
        this.pais = pais;
        this.perigoso = perigoso;
    }

    @Override
    public int compareTo(Conteiner o) {
        if (o.numero == this.numero){
            return 0;
        } else if (o.numero < this.numero){
            return 1;
        } else {
            return -1;
        }
    }

    public int getNumero() {
        return numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getPais() {
        return pais;
    }

    public boolean isPerigoso() {
        return perigoso;
    }

}
