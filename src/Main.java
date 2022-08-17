public class Main {
    public static void main(String[] args) {

        compararNum(1);
        numWhile(0);
        numDowhile(2);
        numFor();
        estacionesDelAño("Invierno");

    }

    public static int compararNum(int numeroif) {
        if (numeroif > 0) {
            System.out.println("El numero es positivo");
        } else if (numeroif < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es igual a 0");
        }
        return numeroif;
    }

    public static int numWhile(int numerowhile ) {

        while (numerowhile < 3) {
            System.out.println(numerowhile);
           numerowhile = numerowhile +1;
        }

        return numerowhile;
    }

    public static int numDowhile(int numDo) {
        do {
            System.out.println(numDo);
            numDo = numDo + 1;
        }while (numDo < 3) ;

        return numDo;
    }

    public static void numFor(){

        for (int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor + 1){
            System.out.println(numeroFor);
        }

    }

    public static String estacionesDelAño(String estacion) {
        switch (estacion) {
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            case "Primavera":
                System.out.println("Es Primavera");
                break;
            default:
                System.out.println("Estacion invalida");
        }
        return estacion;
    }
}
