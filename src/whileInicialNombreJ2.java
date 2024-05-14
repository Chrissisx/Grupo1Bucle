public class whileInicialNombreJ2 {
    public void whileInicialNombreJ2(int tamano, char caracter){
        int i = 0;
while (i < tamano - 1) {
    int j = 0; 
    while (j < tamano) {
        if (i == 0 || j == (tamano / 2) || (i > (tamano / 2) && j == 0)) 
            System.out.print(caracter + " ");
        else 
            System.out.print("  ");
        j++;
    }
    System.out.println();
    i++;
}
    i = 0;
    while (i < tamano - 2) {
        System.out.print(caracter + " ");
        i++;
    }
    System.out.println();
    System.out.println();
}
}
