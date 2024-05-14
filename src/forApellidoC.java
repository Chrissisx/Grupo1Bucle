public class forApellidoC {
    public void inicialApellido(int tamano, char caracter){
        for (int f1 = 0; f1 < tamano; f1++){
            System.out.print(caracter);
        }
        System.out.println();

        for(int j =0; j < tamano - 2; j++){
            System.out.println(caracter + " ");
        }

        for(int f = 0; f < tamano; f++){
            System.out.print(caracter);
        }
        System.out.println();
    }

}
