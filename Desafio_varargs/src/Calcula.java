import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Calcula {
    void calcMedia(Valores valor1, Valores valor2, Valores... valoresAdicionais) {
        Objects.requireNonNull(valor1, "informe o valor");
        Objects.requireNonNull(valor2, "Informe o valor2");
        ArrayList<Double> valor = new ArrayList<>();

        valor.add(valor1.value);
        valor.add(valor2.value);

        for (Valores number : valoresAdicionais) {
            valor.add(number.value);
        }

        calculaMediaAdicionais(valor);

    }

    private void calculaMediaAdicionais(ArrayList<Double> values) {
        double media = 0;
        for (Double value : values) {
            media += value;
        }
        media = media / values.size();
        System.out.printf("A media é %.2f", media);
    }
}


