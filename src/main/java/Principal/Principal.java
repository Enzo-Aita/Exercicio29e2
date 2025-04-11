package Principal;
import model.Tempo;
import java.util.Scanner;


public class Principal {

    public static void main(String args[]) {

        //Objeto para a entrada de dados
        Scanner scanner = new Scanner(System.in);

        //Declara e instância um objeto chamado t1 da classe Tempo
        Tempo t1 = new Tempo();

        //Realiza a leitura da hora, minuto e segundo para o objeto t1
        System.out.println("Digite a hora:");
        t1.setHora(scanner.nextInt());
        System.out.println("Digite o minuto:");
        t1.setMinuto(scanner.nextInt());
        System.out.println("Digite o segundo:");
        t1.setSegundo(scanner.nextInt());

        //Mostrando as saídas
        System.out.println("Tempo atual:" + t1.mostrarTempo());
        System.out.println("Tempo em segundos:" + t1.getTempoSegundos());

        System.out.println("Incrementando o segundo:");
        t1.incrementaSegundo();
        System.out.println("Tempo atual:" + t1.mostrarTempo());

        System.out.println("Decrementando o segundo:");
        t1.decrementaSegundo();
        System.out.println("Tempo atual:" + t1.mostrarTempo());

        System.out.println("Incrementando o minuto:");
        t1.incrementaMinuto();
        System.out.println("Tempo atual:" + t1.mostrarTempo());

        System.out.println("Decrementando o minuto:");
        t1.decrementaMinuto();
        System.out.println("Tempo atual:" + t1.mostrarTempo());

        System.out.println("Incrementando a hora:");
        t1.incrementaHora();
        System.out.println("Tempo atual:" + t1.mostrarTempo());

        System.out.println("Decrementando a hora:");
        t1.decrementaHora();
        System.out.println("Tempo atual:" + t1.mostrarTempo());
    }
}