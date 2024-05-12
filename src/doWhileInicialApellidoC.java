public class doWhileInicialApellidoC {
    public void inicialApellidoC(int tamano, char caracter) {

        int i = 0;

        do {
            System.out.print(caracter);
            i++;
        } while (i < tamano);
        System.out.println();
        
        i = 0;
        do {
            System.out.println(caracter);
            i++;         
        } while (i < tamano - 2);

        i = 0;
        do {
            System.out.print(caracter);
            i++;
        } while (i < tamano);
        System.out.println();
    }
}