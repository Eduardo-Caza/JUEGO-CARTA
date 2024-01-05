

public class Main2 {
    public static void main(String[] args) {            //Se crean objetos los cuales contendran la carta aleatoria que dispusimos antes.
        CartaNumerica carta1 = new CartaNumerica();
        CartaNumerica carta2 = new CartaNumerica();
        CartaNumerica carta3 = new CartaNumerica();
        CartaNumerica carta4 = new CartaNumerica();
        System.out.println("Persona 1: " + carta1.getNombre() + "-"+ carta2.getNombre());             //Imprimo como dos personas ya que son 4 cartas randomicas y pongo dos para cada persona
        System.out.println("Persona 2: " + carta3.getNombre() + "-"+ carta4.getNombre());
        int valorCarta1 = obtenerValorCarta(carta1.getNombre());
        int valorCarta2 = obtenerValorCarta(carta2.getNombre());      //Encierro el valor de la carta en valorcarta con la funcion valor carta ya que de esta convertimos las letras en valores.
        int valorCarta3 = obtenerValorCarta(carta3.getNombre());
        int valorCarta4 = obtenerValorCarta(carta4.getNombre());

        int total1 = valorCarta1 + valorCarta2;      //los valores obtenidos anterirmente se usan para hacer una sumatoria
        int total2 = valorCarta3 + valorCarta4;
        System.out.println("Suma persona 1 es " + total1);
        System.out.println("Suma persona 2 es " + total2);
        if(total1>total2){                                //con el if decidimos el ganador por el total de la suma
            System.out.println("Persona 1 Gana!!");
        }
        if(total1<total2){                                //con el if decidimos el ganador por el total de la suma
            System.out.println("Persona 2 Gana!!");
        }
        if(total1==total2){                                //con el if decidimos el ganador por el total de la suma
            System.out.println("Empate!!");
        }
    }

    public static int obtenerValorCarta(String nombreCarta) {       //la funcion obtiene los valores de la carta randomica separando mediante el case que cuando el valor es una Letra(A-J-Q-K) REALICE UNA CONVERION DEVOLVIENDO EL VALOR QUE SE PONE EN EL RETURN
        switch (nombreCarta) {
            case "A":
                return 11;
            case "K":
            case "Q":
            case "J":
                return 10;
            default:
                return Integer.parseInt(nombreCarta);       //si el valor que recoge de la carta es un valor numerico lo devuelve como un entero.
        }
    }
}
