public class forInicialApellidoB {
    public void inicialApellidoB(int tamano, char caracter) {
        // Parte superior de la letra B
        for (int i = 0; i < tamano; i++) {
            System.out.print(caracter);
        }
        System.out.println();
        
        // Parte superior media de la letra B
        for (int i = 0; i < tamano / 2 - 1; i++) {
            for (int j = 0; j < tamano - 2; j++) {
                if (j == 0 || j == tamano / 2 - 1) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(caracter);
        }
        
        // Parte media de la letra B
        for (int i = 0; i < tamano; i++) {
            System.out.print(caracter);
        }
        System.out.println();
        
        // Parte inferior media de la letra B
        for (int i = 0; i < tamano / 2 - 1; i++) {
            for (int j = 0; j < tamano - 2; j++) {
                if (j == 0 || j == tamano / 2 - 1) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(caracter);
        }
        
        // Parte inferior de la letra B
        for (int i = 0; i < tamano; i++) {
            System.out.print(caracter);
        }
        System.out.println();
        }
        }
        
