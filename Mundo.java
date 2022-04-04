import java.util.Scanner;
class Mundo{

    private Scanner entrada = new Scanner(System.in);
    private Habitacion habitacion;
    private Gato gato;
    private Aspiradora aspiradora;

    public Mundo(){
        habitacion = new Habitacion(10,20);
        gato = new Gato(habitacion);
        aspiradora = new Aspiradora(habitacion);
    }

    public void empezar(){
        do {
            this.gato.mover(this.habitacion);
            this.gato.ensuciar(this.habitacion);
            this.aspiradora.mover(this.habitacion);
            this.aspiradora.limpiar(this.habitacion);
            this.habitacion.imprimir(this.gato, this.aspiradora);
        } while (!entrada.nextLine().equalsIgnoreCase("f")); 
    }

    public static void main(String[] args){
        new Mundo().empezar();
    }

}