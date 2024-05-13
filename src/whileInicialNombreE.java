public class whileInicialNombreE {

        public void inicialNombreE(int tamano, char caracter) {
           // Parte superior de la E
           int i = 0;
           while (i < tamano) {
               System.out.print(caracter);
               i++;
           }
           System.out.println();
   
           // Parte media de la E
           i = 0;
           while (i < tamano / 2 - 1) {
               System.out.println(caracter);
               i++;
           }
           // Parte inferior de la E
           i = 0;
           while (i < tamano) {
               System.out.print(caracter);
               i++;
           }
           System.out.println();
           i = 0;
           while (i<tamano/ 2-1){
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

