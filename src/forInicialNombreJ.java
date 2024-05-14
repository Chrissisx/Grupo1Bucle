public class forInicialNombreJ {

    public void forNombre(int tamano, char caracter){
        for (int i = 0; i < tamano-1; i++) {
            for (int j = 0; j < tamano; j++) {
                if (i == 0 || j == (tamano / 2)|| (i > (tamano / 2) && j == 0))
                    System.out.print(caracter+" ");
                else 
                    System.out.print("  ");
                
            }
            System.out.println();
        }
        for(int i=0; i<tamano-2; i++)
            System.out.print(caracter+" ");
        System.out.println();
        System.out.println();
    }
}
