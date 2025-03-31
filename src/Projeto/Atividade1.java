package Projeto;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Atividade1 {
    public static void main(String[] args) {
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy 'e agora são' HH 'horas e' mm 'minutos'.", new Locale("pt", "BR"));
        System.out.println("Hoje é " + agora.format(formatter));
    }
}


