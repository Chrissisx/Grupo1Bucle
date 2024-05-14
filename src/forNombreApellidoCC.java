public class forNombreApellidoCC {
    public void inicialNombreApellido(int tamano, char caracter) {

        for(int i = 0; i < tamano; i++) {
            System.out.print(caracter);
        }
        System.out.print("  ");
        for (int i = 0; i < tamano; i++) {
            System.out.print(caracter);
        }
        System.out.println();

        int space = (tamano - 2);
        for (int i = 0; i < tamano - 2; i++) {
            System.out.print(caracter);
            for (int j = 0; j < space; j++) {
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
