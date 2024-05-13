public class doWhileInicialNombreApellidoEC {
    public void inicialNombreApellidoEC(int tamano, char caracter) {
        // Parte superior de la E y la C
        int i = 0;
        do {
            System.out.print(caracter);
            i++;
        } while (i < tamano);
        System.out.print("  ");
        
        i = 0;
        do {
            System.out.print(caracter);
            i++;
        } while (i < tamano);
        System.out.println();

        // Parte media superior de la E
        i = 0;
        do {
            System.out.print(caracter);
            int j = 0;
            do {
                System.out.print(" ");
                j++;
            } while (j < tamano + 1);
            System.out.println(caracter);
            i++;
        } while (i < tamano / 2 - 1);

        // Parte media de la E y la C
        i = 0;
        do {
            System.out.print(caracter);
            i++;
        } while (i < tamano);
        System.out.print("  ");
        System.out.println(caracter);

        // Parte inferior de la E
        i = 0;
        do {
            System.out.print(caracter);
            int j = 0;
            do {
                System.out.print(" ");
                j++;
            } while (j < tamano + 1);
            System.out.println(caracter);
            i++;
        } while (i < tamano / 2 - 1);

        // Parte inferior de la C
        i = 0;
        do {
            System.out.print(caracter);
            i++;
        } while (i < tamano);
        System.out.print("  ");

        i = 0;
        do {
            System.out.print(caracter);
            i++;
        } while (i < tamano);
        System.out.println();
    }
}
