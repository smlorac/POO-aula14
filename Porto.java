package Aula14;

import java.util.ArrayList;
import java.util.Collections;

public class Porto {

    private String cidade;
    private ArrayList<Conteiner> listaCont = new ArrayList<>();

    public Porto(String cidade) {
        this.cidade = cidade;
    }

    public void entrada(Conteiner conteiner){
        listaCont.add(conteiner);
    }

    public void listar(){
        Collections.sort(listaCont);

        for (Conteiner conteiner: listaCont){
            System.out.println("Número: " + conteiner.getNumero() + " Descrição: " + conteiner.getDescricao()
            + " País: " + conteiner.getPais() + " Perigoso: " + conteiner.isPerigoso());
        }
    }

    public void qntPerigosoDesconhecido(){
        Collections.sort(listaCont);

        int contador = 0;

        for (Conteiner conteiner: listaCont){
            if (conteiner.isPerigoso() && conteiner.getPais().equals("Desconhecido")){
                contador++;
            }
        }
        System.out.println("A quantidade de conteiners perigosos de origem desconhecida é " + contador);
    }
}
