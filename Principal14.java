package Aula14;

public class Principal14 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador(11, "Carol", true, true);
        Jogador jogador2 = new Jogador(666, "Nicolas", false, true);

        Equipe equipe = new Equipe("Lindos");

        equipe.addJogador(jogador1);
        equipe.addJogador(jogador2);

        equipe.mostrarJogadoresTitulares();

        System.out.println(equipe.getQuantidadeJogadoresLesionados());
    }
}
