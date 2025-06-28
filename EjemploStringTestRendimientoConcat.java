public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        //comparacion de velocidades de diferentes modos de concatenacion

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder();

        long inicio = System.currentTimeMillis();

        for (int i = 0 ; i < 10000; i++){
            //c += a + b + "\n"; 100 => 7ms
            //c = c.concat(a).concat(b).concat("\n"); 100 => 0 ms
            //sb.append(a).append(b).append("\n"); 100 => 0 ms
            //c += a + b + "\n"; 1000 => 9ms
            //c = c.concat(a).concat(b).concat("\n"); 1000 => 1 ms
            //sb.append(a).append(b).append("\n"); 1000 => 0 ms
            //c += a + b + "\n"; 10000 => 38 ms
            //c = c.concat(a).concat(b).concat("\n"); 10000 => 72 ms
            //sb.append(a).append(b).append("\n"); 10000 => 1 ms

        }

        long fin = System.currentTimeMillis();

        System.out.println(c);
        System.out.println(sb);
        System.out.println("Temporizador: "+(fin - inicio)+ "ms");

        /*
         * Como se puede observar, el método de concatenación más eficiente es StringBuilder.
         * Aunque concat() suele ser más rápido que '+' en ciclos pequeños,
         * en ciclos grandes concat() puede volverse más costoso,
         * mientras que StringBuilder mantiene un rendimiento estable y eficiente.
         */
    }
}
