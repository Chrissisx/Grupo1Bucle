public class doWhileNombreC {
    public void inicialNombre(int tamano, char caracter) {
        System.out.println("DO-WHILE: ");
        int i = 0;
        do {
            System.out.print(caracter);
            i++;
        } while (i < tamano);
        System.out.println();

        int j = 0;
        do {
            System.out.println(caracter + " ");
            j++;
        } while (j < tamano - 2);

        int k = 0;
        do {
            System.out.print(caracter);
            k++;
        } while (k < tamano);
        System.out.println();
    }
}