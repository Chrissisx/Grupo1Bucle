import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamano; 
        char caracter;

        //Declarar

        //Parte Christopher Criollo
        forInicialNombreC nf;
        forInicialApellidoC af;
        forInicialNombreApellidoCC naf;

        whileInicialNombreC nw;
        whileInicialApellidoC aw;
        whileInicialNombreApellidoCC naw;

        doWhileInicialNombreC ndw;
        doWhileInicialApellidoC adw;
        doWhileInicialNombreApellidoCC nadw;
        //Parte Jairo Angulo

        //Parte Joan Bedon

        //Parte Camila Caicedo

        //Parte Estefano Condoy
        forInicialNombreE ef ;
        forInicialApellidoC2 df;
        forInicialNombreApellidoEC ecf;

        whileInicialNombreE ew;
        whileInicialApellidoC2 dw;
        whileInicialNombreApellidoEC ecw;

        doWhileInicialNombreE edw;
        doWhileInicialApellidoC2 ddw;
        doWhileInicialNombreApellidoEC ecdw;

        //Instanciar

        //Parte Christopher Criollo
        nf = new forInicialNombreC();
        af = new forInicialApellidoC();
        naf = new forInicialNombreApellidoCC();

        nw = new whileInicialNombreC();
        aw = new whileInicialApellidoC();
        naw = new whileInicialNombreApellidoCC();

        ndw = new doWhileInicialNombreC();
        adw = new doWhileInicialApellidoC();
        nadw = new doWhileInicialNombreApellidoCC();
        //Parte Jairo Angulo

        //Parte Joan Bedon

        //Parte Camila Caicedo

        //Parte Estefano Condoy
        ef = new forInicialNombreE();
        df = new forInicialApellidoC2();
        ecf = new forInicialNombreApellidoEC();

        ew = new whileInicialNombreE();
        dw = new whileInicialApellidoC2();
        ecw = new whileInicialNombreApellidoEC();

        edw = new doWhileInicialNombreE();
        ddw = new doWhileInicialApellidoC2();
        ecdw = new doWhileInicialNombreApellidoEC();

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
        System.out.println("CICLO FOR: "+"\n");
        nf.inicialNombreC(tamano, caracter);
        System.out.println();
        af.inicialApellidoC(tamano, caracter);
        System.out.println();
        naf.inicialNombreApellidoCC(tamano, caracter);
        System.out.println("\nCICLO WHILE: "+"\n");
        nw.inicialNombreC(tamano, caracter);
        System.out.println();
        aw.inicialApellidoC(tamano, caracter);
        System.out.println();
        naw.inicialNombreApellidoCC(tamano, caracter);
        System.out.println("\nCICLO DO WHILE: "+"\n");
        ndw.inicialNombreC(tamano, caracter);
        System.out.println();
        adw.inicialApellidoC(tamano, caracter);
        System.out.println();
        nadw.inicialNombreApellidoCC(tamano, caracter);
        System.out.println();

        System.out.println("ESTEFANO CONDOY");
        System.out.println("CICLO FOR: "+"\n");
        ef.inicialNombreE(tamano, caracter);
        System.out.println();
        df.inicialApellidoC2(tamano, caracter);
        System.out.println();
        ecf.inicialNombreApellidoEC(tamano, caracter);
        System.out.println("\nCICLO WHILE: "+"\n");
        ew.inicialNombreE(tamano, caracter);
        System.out.println();
        dw.inicialApellidoC2(tamano, caracter);
        System.out.println();
        ecw.inicialNombreApellidoEC(tamano, caracter);
        System.out.println("\nCICLO DO WHILE: "+"\n");
        edw.inicialNombreE(tamano, caracter);
        System.out.println();
        ddw.inicialApellidoC2(tamano, caracter);
        System.out.println();
        ecdw.inicialNombreApellidoEC(tamano, caracter);
        System.out.println();
    
    }
}
