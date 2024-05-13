public class forInicialNombreApellidoEC {
  public void inicialNombreApellidoEC(int tamano, char caracter) {
      // Parte superior de la E y la C
      for (int i = 0; i < tamano; i++) {
          System.out.print(caracter);
      }
      System.out.print("  ");
      for (int i = 0; i < tamano; i++) {
          System.out.print(caracter);
      }
      System.out.println();

      // Parte media superior de la E
      for (int i = 0; i < tamano / 2 - 1; i++) {
          System.out.print(caracter);
          for (int j = 0; j < tamano +1; j++) {
              System.out.print(" ");
          }
          System.out.println(caracter);
      }

      // Parte media de la E y la C
      for (int i = 0; i < tamano; i++) {
          System.out.print(caracter);
      }
      System.out.print("  ");
      System.out.println(caracter);

      // Parte inferior de la E
      for (int i = 0; i < tamano / 2 - 1; i++) {
          System.out.print(caracter);
          for (int j = 0; j < tamano +1; j++) {
              System.out.print(" ");
          }
          System.out.println(caracter);
      }

      // Parte inferior de la C
      for (int i = 0; i < tamano; i++) {
          System.out.print(caracter);
      }
      System.out.print("  ");
      for (int i = 0; i < tamano; i++) {
          System.out.print(caracter);
      }
      System.out.println();
  }

}
