public class whileInicialApellidoB {
    public void inicialApellidoB(int tamano, char caracter) {
        // Parte superior de la letra B
        int i = 0;
        while (i < tamano) {
            System.out.print(caracter);
            i++;
        }
        System.out.println();

        // Parte superior media de la letra B
        i = 0;
        while (i < tamano / 2 - 1) {
            int j = 0;
            while (j < tamano - 2) {
                if (j == 0 || j == tamano / 2 - 1) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println(caracter);
            i++;
        }

        // Parte media de la letra B
        i = 0;
        while (i < tamano) {
            System.out.print(caracter);
            i++;
        }
        System.out.println();

        // Parte inferior media de la letra B
        i = 0;
        while (i < tamano / 2 - 1) {
            int j = 0;
            while (j < tamano - 2) {
                if (j == 0 || j == tamano / 2 - 1) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println(caracter);
            i++;
        }

        // Parte inferior de la letra B
        i = 0;
        while (i < tamano) {
            System.out.print(caracter);
            i++;
        }
        System.out.println();
    }
}

