import java.util.Comparator;
import java.util.Objects;

public class Cidade implements Comparable<Cidade> {
    private int codigoIbge;
    private String nome;
    private double totalHabitantes;

    public Cidade(int codigoIbge, String nome, double totalHabitantes) {

        Objects.requireNonNull(nome);

        this.codigoIbge = codigoIbge;
        this.nome = nome;
        this.totalHabitantes = totalHabitantes;
    }

    public int getCodigoIbge() {
        return codigoIbge;
    }

    public void setCodigoIbge(int codigoIbge) {
        this.codigoIbge = codigoIbge;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTotalHabitantes() {
        return totalHabitantes;
    }

    public void setTotalHabitantes(double totalHabitantes) {
        this.totalHabitantes = totalHabitantes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cidade cidade = (Cidade) o;
        return codigoIbge == cidade.codigoIbge;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoIbge);
    }

    @Override
    public int compareTo(Cidade o){
        return Integer.compare(codigoIbge, o.codigoIbge);
    }
}
