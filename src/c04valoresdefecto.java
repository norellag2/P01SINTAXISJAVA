public class c04valoresdefecto {
    //para variables de clases o instancia
    //Java establece valores por defecto
    //numéricos será 0 segun el tipo
    //Boolean será false
    //Char será carácter vacío
    static byte variable1;
    static float variable3;
    static boolean variable4;
    static char variable5;

    public static void main(String[] args) {
        System.out.println(variable1);
        System.out.println(variable3);
        System.out.println(variable4);
        System.out.println(variable5);
        //si la variable es local a un método o estructura no tiene valor por defecto
        byte variable2;
       // System.out.println(variable2); error
    }
}
