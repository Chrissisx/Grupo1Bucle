public class whileInicialNombreApellidoJB {
    public void inicialNombreApellidoJB(int tamano, char caracter) {
        // Parte superior de la J
        int i = 0;
        while (i < tamano) {
            System.out.print(caracter);
            i++;
        }
        System.out.print("  ");

        // Parte superior de la B
        i = 0;
        while (i < tamano) {
            System.out.print(caracter);
            i++;
        }
        System.out.println();

        // Parte media superior de la J
        i = 0;
        while (i < tamano / 2) {
            int j = 0;
            while (j < tamano) {
                if (j == tamano / 2) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.print("  ");
            // Espacio entre las letras J y B
            int k = 0;
             while (k < tamano - 1) {
                System.out.print(" ");
                k++;
            }
            System.out.println(caracter);
            i++;
        }

        // Parte media inferior de la J
        i = 0;
             while (i < tamano / 2) {
                System.out.print(caracter);
                     i++;
        }
        System.out.print("  ");
        // Espacio entre las letras J y B
             int k = 0;
                while (k < tamano - 1) {
                     System.out.print(" ");
                             k++;
        }
        System.out.println(caracter);

        // Parte inferior de la B
        i = 0;
            while (i < tamano) {
                System.out.print(caracter);
                     i++;
        }
        System.out.print("  ");

        i = 0;
            while (i < tamano) {
            System.out.print(caracter);
                 i++;
        }
        System.out.println();
    }
}

