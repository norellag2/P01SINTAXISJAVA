public class c03objetos {
    Object variableObjeto = new Object();
    public static void main(String[] args) {
        // hay un tipo de objetos muy utilizados que son los de la clase String
        // Declaración: 
        String mensaje = new String();
        mensaje = "¡Hola Mundo!";
        String mensaje2 = "¡Hola Universo!";
        System.out.println(mensaje);

        //ARRAYS en Java (una de las múltiples formas)
        //Sintaxis
        String[] frutas = new String[4]; //forma clásica

        frutas[0] = "peras";
        frutas[1] = "manzanas";
        frutas[3] = "plátanos";
        System.out.println(frutas[1]);
        System.out.println(frutas[2]); // si no tiene valor devuelve null

        String[] marcas = {"Audi", "W", "Dacia"}; // con llaves podemos asignar un literal
        System.out.println(marcas[1]);

    }
}
