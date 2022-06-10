public class c02tiposdatos {
    
  public static void main(String[] args) {
      boolean mayorEdad = true;
      byte importe1 = 127;
      short importe2 = 11111;
      int importe3 = 1111111111;
      long importe4 = 1111111111111111111L;
      float importe5 = 2.34f;
      double importe6 = 1.1 * 10e300;
      // respecto a los numéricos permite otros formatos numéricos
      double exponencial = 2e3;
      int octal = 023;
      int hexadecimales = 0x54A;
      int binario = 0b11;
      System.out.println(binario);
      // para literales de números grandes se puede separar visualmente con underscore intermedio
      int cantidad = 1_000_000;
      char caracter1 = 'a';
      char caracter2 = '*';
      char caracter3 = '\u2192';
      System.out.println(caracter3);
  }
}
