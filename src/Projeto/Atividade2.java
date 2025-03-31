package Projeto;

import java.time.LocalDate;
import java.time.Period;

public class Atividade2 {
    public static void contaTempo(int dia, int mes, int ano) {
        LocalDate dataFutura = LocalDate.of(ano, mes, dia);
        LocalDate hoje = LocalDate.now();
        Period periodo = Period.between(hoje, dataFutura);
        System.out.println("Faltam " + periodo.getYears() + " anos, " + periodo.getMonths() + " meses e " + periodo.getDays() + " dias.");
    }

    public static void main(String[] args) {
        contaTempo(25, 12, 2025);
    }
}
