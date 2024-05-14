public class doWhileInicialApellidoB {
    public void inicialApellidoB(int tamano, char caracter) {
           // Parte superior de la letra B
        int i = 0;
        do {
            System.out.print(caracter);
            i++;
        } while (i < tamano);
        System.out.println();

        // Parte superior media de la letra B
        i = 0;
        do {
            if (i == 0 || i == tamano / 2 - 1) {
                System.out.print(caracter);
            } else {
                System.out.print(" ");
            }
            int j = 0;
            do {
                System.out.print(" ");
                j++;
            } while (j < tamano - 2);
            System.out.println(caracter);
            i++;
        } while (i < tamano / 2 - 1);

        // Parte media de la letra B
        i = 0;
        do {
            System.out.print(caracter);
            i++;
        } while (i < tamano);
        System.out.println();

        // Parte inferior media de la letra B
        i = 0;
        do {
            if (i == 0 || i == tamano / 2 - 1) {
                System.out.print(caracter);
            } else {
                System.out.print(" ");
            }
            int j = 0;
            do {
                System.out.print(" ");
                j++;
            } while (j < tamano - 2);
            System.out.println(caracter);
            i++;
        } while (i < tamano / 2 - 1);

        // Parte inferior de la letra B
        i = 0;
        do {
            System.out.print(caracter);
            i++;
        } while (i < tamano);
        System.out.println();
    }
}
