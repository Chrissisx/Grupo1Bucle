public class whileNombreApellidoCC {
    public void inicialNombreApellido(int tamano, char caracter) {
        // Primer conjunto de caracteres 'caracter' separados por espacio
        int fila = 0;
        while (fila < tamano) {
            System.out.print(caracter);
            fila++;
        }
        System.out.print("  ");
        int f2 = 0;
        while (f2 < tamano) {
            System.out.print(caracter);
            f2++;
        }
        System.out.println();

        // Cuerpo vertical de la letra 'caracter'
        int space = (tamano - 2);
        int column = 0;
        while (column < tamano - 2) {
            System.out.print(caracter);
            int j = 0;
            while (j < space) {
                System.out.print("  ");
                j++;
            }
            System.out.println(caracter);
            column++;
        }

        int f = 0;
        while (f < tamano) {
            System.out.print(caracter);
            f++;
        }
        System.out.print("  ");
        int k = 0;
        while (k < tamano) {
            System.out.print(caracter);
            k++;
        }
        System.out.println();
    }
}