package com.algaworks.agenda;

import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        Horario horario = new Horario(10, 20);
        System.out.println(horario.formatar());
    }
}
