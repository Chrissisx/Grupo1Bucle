public class whileInicialNombreApellidoEC {
    public void inicialNombreApellidoEC(int tamano, char caracter) {
        // Parte superior de la E y la C
        int i = 0;
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

        // Parte media superior de la E
        i = 0;
        while (i < tamano / 2 - 1) {
            System.out.print(caracter);
            int j = 0;
            while (j < tamano + 1) {
                System.out.print(" ");
                j++;
            }
            System.out.println(caracter);
            i++;
        }

        // Parte media de la E y la C
        i = 0;
        while (i < tamano) {
            System.out.print(caracter);
            i++;
        }
        System.out.print("  ");
        System.out.println(caracter);

        // Parte inferior de la E
        i = 0;
        while (i < tamano / 2 - 1) {
            System.out.print(caracter);
            int j = 0;
            while (j < tamano + 1) {
                System.out.print(" ");
                j++;
            }
            System.out.println(caracter);
            i++;
        }

        // Parte inferior de la C
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
