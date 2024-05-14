public class forInicialNombreApellidoJA {
    public void forNombreApellido(int tamano, char caracter){
    
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                if (i == 0 || j == tamano / 2 || (i == tamano - 1 && j < tamano - 2) || (i > tamano / 2 && j == 0)) 
                    System.out.print(caracter+" ");
                else 
                    System.out.print("  ");
            }
            System.out.print("  "); 
            for (int j = 0; j < tamano; j++) {
                if (i == 0 || i == tamano / 2 || j == 0 || j == tamano - 1) 
                    System.out.print(caracter+" ");
                else 
                    System.out.print("  ");
            }
            System.out.println();
        }
    
        System.out.println();
}
}
