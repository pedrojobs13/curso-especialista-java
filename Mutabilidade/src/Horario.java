public class Horario {
    private final int minutos;
    private final int horas;

    public Horario(int hora, int minuto) {
        if (hora < 0 || hora > 23) {
            throw new IllegalArgumentException("hora inválida: " + hora);
        }
        if (minuto < 0 || minuto > 60) {
            throw new IllegalArgumentException("Minutos inválidos: " + minuto);
        }
        this.minutos = minuto;
        this.horas = hora;
    }

    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }


}
