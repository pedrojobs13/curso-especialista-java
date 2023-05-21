public class Principal {
    public static void main(String[] args){
        Calcula calcula = new Calcula();
        Valores valores = new Valores();

        valores.value = 5;

        Valores valores2 = new Valores();
        valores2.value = 8;

        Valores valores3 = new Valores();
        valores3.value = 12;
        calcula.calcMedia(valores, valores2, valores3);
    }
}
