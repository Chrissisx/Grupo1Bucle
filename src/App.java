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
        forInicialApellidoA bf;
        forInicialNombreJ bn;
        forInicialNombreApellidoJA ba;

        whileInicialNombreJ bv;
        whileInicialApellidoA bp;
        whileInicialNombreApellidoJA bpj;

        doWhileInicialNombreJ dwj;
        doWhileInicialApellidoA djr;
        doWhileInicialNombreApellidoJA dwa;
        //Parte Joan Bedon
        forInicialNombreJ2 jf;
        forInicialApellidoB b2f;
        forInicialNombreApellidoJB jbf;

        whileInicialNombreJ2 jw;
        whileInicialApellidoB bw;
        whileInicialNombreApellidoJB jbw;

        doWhileInicialNombreJ2 jdw;
        doWhileInicialApellidoB bdw;
        doWhileInicialNombreApellidoJB jbdw;

        //Parte Camila Caicedo
        forNombreC name;
        forApellidoC lastname;
        forNombreApellidoCC nal;

        whileNombreC nam;
        whileApellidoC lastnam;
        whileNombreApellidoCC namls;

        doWhileNombreC na;
        doWhileApellidoC lastna;
        doWhileNombreApellidoCC naln;

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
        bf = new forInicialApellidoA();
        bn = new forInicialNombreJ();
        ba = new forInicialNombreApellidoJA();

        bv = new whileInicialNombreJ();
        bp = new whileInicialApellidoA();
        bpj = new whileInicialNombreApellidoJA();

        dwj = new doWhileInicialNombreJ();
        djr = new doWhileInicialApellidoA();
        dwa = new doWhileInicialNombreApellidoJA();


        //Parte Joan Bedon
        jf = new forInicialNombreJ2();
        b2f = new forInicialApellidoB();
        jbf = new forInicialNombreApellidoJB();

        jw = new whileInicialNombreJ2();
        bw = new whileInicialApellidoB();
        jbw = new whileInicialNombreApellidoJB();

        jdw = new doWhileInicialNombreJ2();
        bdw = new doWhileInicialApellidoB();
        jbdw = new doWhileInicialNombreApellidoJB();

        //Parte Camila Caicedo
        name = new forNombreC();
        lastname = new forApellidoC();
        nal = new forNombreApellidoCC();

        nam = new whileNombreC();
        lastnam = new whileApellidoC();
        namls = new whileNombreApellidoCC();

        na = new doWhileNombreC();
        lastna = new doWhileApellidoC();
        naln = new doWhileNombreApellidoCC();

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

        name.inicialNombre(tamano, caracter);
        lastname.inicialApellido(tamano, caracter);
        nal.inicialNombreApellido(tamano, caracter);
        nam.inicialNombre(tamano, caracter);
        lastnam.inicialApellido(tamano, caracter);
        namls.inicialNombreApellido(tamano, caracter);
        na.inicialNombre(tamano, caracter);
        lastna.inicialApellido(tamano, caracter);
        naln.inicialNombreApellido(tamano, caracter);

        System.out.println("JAIRO ANGULO");
        System.out.println("CICLO FOR: "+"\n");
        bn.forNombre(tamano, caracter);
        bf.apellido(tamano, caracter);
        ba.forNombreApellido(tamano, caracter);
        System.out.println("\nCICLO WHILE: "+"\n");
        bv.whileNombre(tamano, caracter);
        bp.whileApellido(tamano, caracter);
        bpj.whileNombreApellido(tamano, caracter);
        System.out.println("\nCICLO DO WHILE: "+"\n");
        dwj.dowhileNombre(tamano, caracter);
        djr.dowhileApellido(tamano, caracter);
        dwa.whileNombreApellido(tamano, caracter);

        System.out.println("JOAN BEDON");
        System.out.println("CICLO FOR: "+"\n");
        jf.forNombre(tamano, caracter);
        System.out.println();
        b2f.inicialApellidoB(tamano, caracter);
        System.out.println();
        jbf.inicialNombreApellidoJB(tamano, caracter);
        System.out.println("\nCICLO WHILE: "+"\n");
        jw.whileInicialNombreJ2(tamano, caracter);
        System.out.println();
        bw.inicialApellidoB(tamano, caracter);
        System.out.println();
        jbw.inicialNombreApellidoJB(tamano, caracter);
        System.out.println("\nCICLO DO WHILE: "+"\n");
        jdw.inicialNombreJ2(tamano, caracter);
        System.out.println();
        bdw.inicialApellidoB(tamano, caracter);
        System.out.println();
        jbdw.inicialNombreApellidoJB(tamano, caracter);
        System.out.println();
    
    }
}
