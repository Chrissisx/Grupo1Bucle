public class forInicialNombreApellidoCC {
    public void inicialNombreApellidoCC(int tamano, char caracter) {

        for(int i = 0; i < tamano; i++) {
            System.out.print(caracter);
        }
        System.out.print("  ");
        for (int i = 0; i < tamano; i++) {
            System.out.print(caracter);
        }
        System.out.println();

        int espacio = (tamano - 2);
        for (int i = 0; i < tamano - 2; i++) {
            System.out.print(caracter);
            for (int j = 0; j < espacio; j++) {
                System.out.print("  ");
            }
            System.out.println(caracter);
        }

        for(int i = 0; i < tamano; i++) {
            System.out.print(caracter);
        }
        System.out.print("  ");
        for (int i = 0; i < tamano; i++) {
            System.out.print(caracter);
        }
        System.out.println();
    }
}