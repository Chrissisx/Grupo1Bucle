public class forInicialNombreE {

        public void inicialNombreE(int tamano, char caracter) {
            // Parte superior de la E
            for(int i = 0; i < tamano; i++) {
                System.out.print(caracter);
            }
            System.out.println();
    
            // Parte media de la E
            for (int i = 0; i < tamano / 2-1; i++) {
                System.out.println(caracter);
            }

            for(int i = 0; i < tamano; i++) {
                System.out.print(caracter);
            }
            System.out.println();
    
            // Parte inferior de la E
            for (int i = 0; i < tamano / 2-1; i++) {
                System.out.println(caracter);
            }
    
            for(int i = 0; i < tamano; i++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    

}
