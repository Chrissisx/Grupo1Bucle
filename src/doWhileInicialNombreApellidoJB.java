public class doWhileInicialNombreApellidoJB {
    public void inicialNombreApellidoJB(int tamano, char caracter) {
        int i = 0;
        int espacio = (tamano - 2);

        // Parte superior de la J
        do {
            System.out.print(caracter);
            i++;
        } while (i < tamano);
        System.out.print("  ");

        // Parte superior de la B
        i = 0;
        do {
            System.out.print(caracter);
            i++;
        } while (i < tamano);
        System.out.println();

        // Parte media de la J y la B
        i = 0;
        do {
            System.out.print(caracter);
            int j = 0;
            do {
                System.out.print("  ");
                j++;
            } while (j < espacio);
            System.out.println(caracter);
            i++;
        } while (i < tamano - 2);

        // Parte inferior de la J
        i = 0;
        do {
            System.out.print(caracter);
            i++;
        } while (i < tamano);
        System.out.print("  ");

        // Parte inferior de la B
        i = 0;
        do {
            System.out.print(caracter);
            i++;
        } while (i < tamano);
        System.out.println();
    }
}
