public class Principal {
    public static void main(String[] args) {
        imprimir();
        byte[] x = new byte[500 * 1024 * 1024];
        imprimir();
    }

    static void imprimir() {
        System.out.printf("Maxima: %s%n", emMegabytes(Runtime.getRuntime().maxMemory()));
        System.out.printf("Total emprenhada: %s%n", emMegabytes(Runtime.getRuntime().totalMemory()));
        System.out.printf("Disponível: %s%n", emMegabytes(Runtime.getRuntime().freeMemory()));
        System.out.printf("Usada: %s%n", emMegabytes(Runtime.getRuntime().totalMemory() -
                Runtime.getRuntime().freeMemory()));
        System.out.printf("----%n");
    }

    static String emMegabytes(long bytes) {
        return String.format("%.2fMB", bytes / 1024d / 1024d);
    }
}
