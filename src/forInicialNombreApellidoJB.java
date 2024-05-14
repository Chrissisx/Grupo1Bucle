public class forInicialNombreApellidoJB {
    public void inicialNombreApellidoJB(int tamano, char caracter) {
        // Parte superior de la J
        for (int i = 0; i < tamano; i++) {
            System.out.print(caracter);
        }
        System.out.print("  ");
        // Parte superior de la B
        for (int i = 0; i < tamano; i++) {
            System.out.print(caracter);
        }
        System.out.println();

        // Parte media superior de la J
        for (int i = 0; i < tamano / 2; i++) {
            for (int j = 0; j < tamano; j++) {
                if (j == tamano / 2) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("  ");
            // Espacio entre las letras J y B
            for (int j = 0; j < tamano - 1; j++) {
                System.out.print(" ");
            }
            System.out.println(caracter);
        }

        // Parte media inferior de la J
        for (int i = 0; i < tamano / 2; i++) {
            System.out.print(caracter);
        }
        System.out.print("  ");
        // Espacio entre las letras J y B
        for (int j = 0; j < tamano - 1; j++) {
            System.out.print(" ");
        }
        System.out.println(caracter);

        // Parte inferior de la B
        for (int i = 0; i < tamano; i++) {
            System.out.print(caracter);
        }
        System.out.print("  ");
        for (int i = 0; i < tamano; i++) {
            System.out.print(caracter);
        }
        System.out.println();
    }
}

