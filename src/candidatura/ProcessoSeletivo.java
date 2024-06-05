package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
imprimirSelecionados();
    }
    static void imprimirSelecionados (){
        String [] candidatos = {"Leonardo","Gustavo" ,"Crystiane", "Jonas","Miguel"};
        System.out.println("imprimindo a lsita de candidatos informando  o indice  do elemento");

        for (int indice = 0 ; indice < candidatos.length;indice++) {
            System.out.println("o candidato de n° "+ (indice+1) +" é " + candidatos[indice] );
        }
    }
    static void selecaoCandidatos (){
        String [] candidatos = {"Leonardo","Gustavo" ,"Crystiane", "Jonas","Miguel" , "Rafael", "Monica", "Augusto", "Fabricio"};

        int candidatosSelecionados = 0 ;
        int candidatoAtual = 0 ;
        double salarioBase = 2000.0 ;
        while (candidatosSelecionados < 5 && candidatoAtual <candidatos.length) {
            String candidato = candidatos [candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato"+ candidato + " solicitou : " + salarioPretendido);
            if (salarioBase>=salarioPretendido){
                System.out.println("O candidato"+ candidato + "foi selecionado para vaga ");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }
    static double valorPretendido (){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }
    static void analisarCandidato (double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("Ligar para Candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra-proposta");
        }else {
            System.out.println("Aguardadndo Demais Candidatos");
        }

    }
}
