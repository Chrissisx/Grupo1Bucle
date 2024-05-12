public class whileInicialNombreApellidoCC {
    public void inicialNombreApellidoCC (int tamano, char caracter) {

        int i = 0; 
        int espacio = (tamano - 2);

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

        i = 0;
        while (i < tamano - 2) {
            System.out.print(caracter);
            int j = 0;
            while (j < espacio) {
                System.out.print("  ");
                j++;
            }
            System.out.println(caracter);
            i++;
        }

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
