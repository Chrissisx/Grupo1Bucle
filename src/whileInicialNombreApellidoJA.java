public class whileInicialNombreApellidoJA {
    public void whileNombreApellido(int tamano, char caracter){
            int i = 0;
    while (i < tamano) {
        int j = 0;
        while (j < tamano) {
            if (i == 0 || j == tamano / 2 || (i == tamano - 1 && j < tamano - 2) || (i > tamano / 2 && j == 0)) 
                System.out.print(caracter + " ");
            else 
                System.out.print("  ");
            j++;
        }
        System.out.print("  "); 

        while (j < tamano * 2) {
            if (i == 0 || i == tamano / 2 || j == tamano || j == tamano * 2 - 1) 
                System.out.print(caracter + " ");
            else 
                System.out.print("  ");
            j++;
        }
        System.out.println(); 
        i++;
    }
        System.out.println();
    }
}
