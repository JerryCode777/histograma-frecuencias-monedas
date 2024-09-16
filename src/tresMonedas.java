public class tresMonedas {
    public static void main(String[] args) {
        int[] frecuencias = new int[4];
        for (int i = 0; i < 1000000; i++) {
            switch (lanzarMonedas()) {
                case 0:
                    frecuencias[0]++;
                    break;
                case 1:
                    frecuencias[1]++;
                    break;
                case 2:
                    frecuencias[2]++;
                    break;
                case 3:
                    frecuencias[3]++;
                    break;
            }
        }
        mostrarFrecuencias(frecuencias);
    }

    public static int lanzarMonedas() {
        int moneda1 = (int) (Math.random() * 2);
        int moneda2 = (int) (Math.random() * 2);
        int moneda3 = (int) (Math.random() * 2);
        return moneda1 + moneda2 + moneda3;
    }

    public static void mostrarFrecuencias(int[] nFrecuencia) {
        System.out.println("nCaras \tfrec \thistograma");
        for (int i = 0; i < nFrecuencia.length; i++) {
            System.out.print(i + "\t");
            System.out.print(nFrecuencia[i] + "\t");
            int numAsteriscos = (int) (nFrecuencia[i] / 10000.0); // Dividido por un número adecuado para la escala
            for (int j = 0; j < numAsteriscos; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
