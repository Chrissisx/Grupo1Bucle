public class doWhileInicialNombreJ {
    public void dowhileNombre(int tamano, char caracter){
        int i = 0;
        do {
            int j = 0; 
            do {
                if (i == 0 || j == (tamano / 2) || (i > (tamano / 2) && j == 0)) 
                    System.out.print(caracter + " ");
                else 
                    System.out.print("  ");
                j++;
            } while (j < tamano);
            System.out.println();
            i++;
        } while (i < tamano - 1);

        i = 0;
        do {
            System.out.print(caracter + " ");
            i++;
        } while (i < tamano - 2);
        System.out.println();
        System.out.println();

    }
}
