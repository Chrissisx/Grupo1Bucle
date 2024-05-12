public class forInicialApellidoC {

    public void inicialApellidoC(int tamano, char caracter) {

        for(int i = 0; i < tamano; i++) {
            System.out.print(caracter);
        }
        System.out.println();

        for (int i = 0; i < tamano - 2; i++) {
            System.out.println(caracter);
        }

        for (int i = 0; i < tamano; i++) {
            System.out.print(caracter);
        }
        System.out.println();
    }
}
