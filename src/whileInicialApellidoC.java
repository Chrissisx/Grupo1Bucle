public class whileInicialApellidoC {
    public void inicialApellidoC (int tamano, char caracter) {

        int i = 0;
        
        while (i < tamano) {
            System.out.print(caracter);
            i++;
        }
        System.out.println();
        
        i = 0;
        while ( i < tamano - 2) {
            System.out.println(caracter);
            i++;
        }

        i = 0;
        while (i < tamano) {
            System.out.print(caracter);
            i++;
        }
        System.out.println();
    }
}