public class doWhileInicialNombreApellidoJA {
    public void whileNombreApellido(int tamano, char caracter){
        int i = 0;
    do {
        int j = 0;
        do {
            if (i == 0 || j == tamano / 2 || (i == tamano - 1 && j < tamano - 2) || (i > tamano / 2 && j == 0)) 
                System.out.print(caracter + " ");
            else 
                System.out.print("  ");
            j++;
        } while (j < tamano);
        System.out.print("  ");
        j = 0;
        do {
            if (i == 0 || i == tamano / 2 || j == 0 || j == tamano - 1) 
                System.out.print(caracter + " ");
            else 
                System.out.print("  ");
            j++;
        } while (j < tamano);
        System.out.println();
        i++;
    }while (i < tamano);
    System.out.println();

    }
}
