public class whileInicialApellidoA {
    public void whileApellido(int tamano, char caracter){
            int i = 0;
    while (i<tamano) {
        int j = 0; 
        while (j < tamano) {
            if (i == 0 && j < tamano - 1 || i == tamano / 2 || j == 0 || j == tamano - 1) 
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
