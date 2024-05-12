public class doWhileInicialNombreApellidoCC {
    public void inicialNombreApellidoCC(int tamano, char caracter) {

        int i = 0;
        int espacio = (tamano - 2);

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
