
package model;


public class Tempo {
    private int hora;
    private int minuto;
    private int segundo;

    public Tempo() {
        this(0, 0, 0);
    }

    //construtor com valores
    public Tempo(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
 
    //sets
    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    //gets
    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    //Retorna o tempo como um string do tipo hh:mm:ss
    public String mostrarTempo() {
        String saida = "";
        int hora = getHora();
        int minuto = getMinuto();
        int segundo = getSegundo();
        if (hora < 10) {
            saida += "0";
        }
        saida += hora + ":";
        if (minuto < 10) {
            saida += "0";
        }
        saida += minuto + ":";
        if (segundo < 10) {
            saida += "0";
        }
        saida += segundo;
        return saida;
    }

    public int getTempoSegundos() {
        return getHora() * 3600 + getMinuto() * 60 + getSegundo();
    }

    //incrementos
    public void incrementaHora() {
        int hora = getHora() + 1;
        if (hora > 23) {
            hora = 0;
        }
        setHora(hora);
    }

    public void incrementaMinuto() {
        int min = getMinuto() + 1;
        if (min > 59) {
            incrementaHora();
            min = 0;
        }
        setMinuto(min);
    }

    public void incrementaSegundo() {
        int seg = getSegundo() + 1;
        if (seg > 59) {
            seg = 0;
            incrementaMinuto();
        }
        setSegundo(seg);
    }

    //decrementos
    public void decrementaHora() {
        int hora = getHora() - 1;
        if (hora < 0) {
            hora = 23;
        }
        setHora(hora);
    }

    public void decrementaMinuto() {
        int min = getMinuto() - 1;
        if (min < 0) {
            min = 59;
            decrementaHora();
        }
        setMinuto(min);
    }

    public void decrementaSegundo() {
        int seg = getSegundo() - 1;
        if (seg < 0) {
            seg = 59;
            decrementaMinuto();
        }
        setSegundo(seg);
    }
}
    

