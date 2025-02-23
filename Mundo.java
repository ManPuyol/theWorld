import java.util.Scanner;

class Mundo {

    private Habitacion habitacion;

    public Mundo() {
        habitacion = new Habitacion(15, 20, 4);
    }

    void empezar() {
        do {
            habitacion.pasarCiclo();
        } while (quiereSeguir());
    }

    boolean quiereSeguir(){
        Scanner entrada = new Scanner(System.in);
        return !entrada.nextLine().equalsIgnoreCase("f");
    }

    public static void main(String[] args) {
        new Mundo().empezar();
    }
}