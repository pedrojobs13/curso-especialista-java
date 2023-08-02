import java.util.Objects;

public class Estado implements Comparable<Estado>{
    private String sigla;
    private String nome;

    public Estado(String sigla, String nome){
        Objects.requireNonNull(sigla);
        Objects.requireNonNull(nome);
        this.nome = nome;
        this.sigla = sigla;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getSigla(){
        return sigla;
    }
    public void setSigla(String sigla){
        this.sigla = sigla;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estado estado = (Estado) o;
        return Objects.equals(nome, estado.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
    @Override
    public int compareTo(Estado o){
        return getNome().compareTo(o.nome);
    }
}
