public class whileApellidoC {
    public void inicialApellido(int tamano, char caracter){
        int fila = 0;
        while (fila < tamano){
            System.out.print("*");
            fila ++;    
        }
        System.out.println();

        fila = 0;
        while (fila < tamano - 2) {
            System.out.println("*");
            fila++;
        }

        fila = 0;
        while (fila < tamano) {
            System.out.print("*");
            fila++;
        }
        System.out.println();
    }
}
