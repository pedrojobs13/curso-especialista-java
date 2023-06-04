public record Horario(int hora, int minuto) {
    public Horario {
        if (hora < 0 || hora > 23) {
            throw new IllegalArgumentException("hora inválida");
        }
        if (minuto < 0 || minuto > 60) {
            throw new IllegalArgumentException("minuto inválido");
        }


    }

    public String formatar() {
        return String.format("%dh%dm", hora, minuto);
    }
}
