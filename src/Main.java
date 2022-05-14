public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = 25;
        int resultado;
        Coche miCoche = new Coche();

        resultado = sumar(a,b,c);
        miCoche.AgregarPuerta();
        System.out.println("La sumatoria de los numeros ( " + a + " + " + b + " + " + c + " )  =  " + resultado );
        System.out.println("El Coche tiene ( " + miCoche.puerta + " ) Puerta");
    }

    public static int sumar(int Valor1, int Valor2, int Valor3) {
        return Valor1+Valor2+Valor3;
    }
}

class Coche {
    public int puerta = 0;

    public void AgregarPuerta() {
        this.puerta++;
    }
}