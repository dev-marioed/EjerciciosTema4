public class Main {
    public static void main(String[] args) {


        /**
         * Usando un if, crear una condición que compare
         * si la variable numeroIf es positivo, negativo, o 0.
         * */
//Ejercicio 1)
        var numeroIf =-500;
        String mensaje;
        System.out.print("el numeroIF ");
        if (numeroIf>0){
            mensaje="es positivo";
        } else if (numeroIf<0) {
            mensaje="es negativo";
        }else{
            mensaje="es cero";
        }//else
        //bloque if-else



        System.out.println(mensaje);
        //Cannot infer type: 'var' on variable without initializer. ponle string y ya
        System.out.println("Fin bloque if-else");
        System.out.println("");

//Ejercicio 2)

        int numeroWhile=-10;

        while(numeroWhile<3){
            numeroWhile=numeroWhile+1;
            System.out.println("El numero while es "+numeroWhile);
        }

        System.out.println("Fin bloque WHILE");
        System.out.println("");

//Ejercicio 3)

        numeroWhile=3;

        do{
            numeroWhile=numeroWhile+1;
            System.out.println("el numero while es "+numeroWhile);
        } while(numeroWhile<3);

        System.out.println("Fin bloque DO");
        System.out.println("");

// ejercicio 4) for
        int numeroFor=0;

        //¿es n menor o igual a 3?
        // 1)¿1<3? true
        // 2:true
        //¿3<=3? true? se puede dividir en 2 condiciones
        //¿es 3 menor que 3? no
        //¿es 3 igual a 3?si
        //¿Se cumple al menos una de las condiciones? Si
        //entonces es verdadero

        for(;numeroFor<=3;numeroFor=numeroFor+1) {
            System.out.println("el numero for es"+numeroFor);
        }

        System.out.println("Fin bloque FOR");
        System.out.println("");

        //5) ejecicio Case

        var estacion="OTOÑO";
        switch(estacion){
            case "PRIMAVERA":
                System.out.println("Es primavera");
                break;
            case "VERANO":
                System.out.println("es verano");
                break;
            case "OTOÑO":
                System.out.println("Es otoño");
                break;
            case "INVIERNO":
                System.out.println("es invierno");
                break;
            default:
                System.out.println("Esa no es una estacion");
                break;

                //EJECUTA DESDE EL CASE HASTA QUE ENCUENTRA UN BREAK, aún en el default se sigue de largo.
        }


    }//método Main
}//clase