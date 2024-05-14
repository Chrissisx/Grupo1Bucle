public class doWhileNombreApellidoCC {
    public void inicialNombreApellido(int tamano, char caracter) {
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

        int space = (tamano - 2);
        i = 0;

        do {
            System.out.print(caracter);
            int j = 0;
            do {
                System.out.print("  ");
                j++;
            } while (j < space);
            System.out.println(caracter);
            i++;
        } while (i < tamano - 2);

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
