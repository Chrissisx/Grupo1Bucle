public class whileNombreC {
    public void inicialNombre(int tamano, char caracter){
        System.out.println("WHILE: ");
        int i = 0;
        while (i < tamano){
            System.out.print("*");
            i ++;    
        }
        System.out.println();

        i = 0;
        while (i < tamano - 2) {
            System.out.println(caracter);
            i++;
        }

        i = 0;
        while (i < tamano) {
            System.out.print("*");
            i++;
        }
        System.out.println();
    }
}
