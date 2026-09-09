public class Barberia {
    public static void main(String[] args) {
        System.out.println("Bienvenido al Sistema de Barbería");
        registrarCliente("Carlos");
        agendarCita("Carlos", "10:00 a. m.");
    }

    public static void registrarCliente(String nombre) {
        System.out.println("Cliente registrado: " + nombre);
    }

    public static void agendarCita(String cliente, String hora) {
        System.out.println("Cita agendada para " + cliente + " a las " + hora);
    }
}