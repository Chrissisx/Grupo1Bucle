import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamano; 
        char caracter;

        //Declarar
        forInicialNombreC nf;
        forInicialApellidoC af;
        forInicialNombreApellidoCC naf;

        //Instanciar
        nf = new forInicialNombreC();
        af = new forInicialApellidoC();
        naf = new forInicialNombreApellidoCC();
        
        System.out.println("*********************************");
        System.out.println("*                               *");
        System.out.println("*            GRUPO 1            *");
        System.out.println("*                               *");
        System.out.println("*********************************");
        System.out.println("   Integrantes: "+"\n - Jairo Angulo"+"\n - Joan Bedon"+"\n - Camila Caicedo"+"\n - Estefano Condoy"+"\n - Christopher Criollo");
        System.out.println("\n*********************************");

        System.out.print("Ingrese el tamano de la letra: ");
        tamano = sc.nextInt();
        System.out.print("Ingrese el caracter: ");
        caracter = sc.next().charAt (0);
        System.out.println();

        //Llamar al metodo

        System.out.println("CHRISTOPHER CRIOLLO");
        System.out.println("CICLO FOR: ");
        nf.inicialNombreC(tamano, caracter);
        System.out.println();
        af.inicialApellidoC(tamano, caracter);
        System.out.println();
        naf.inicialNombreApellidoCC(tamano, caracter);
    }
}
