public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente ();
        cliente.edad = 42;
        cliente.nombre = "Juanma";
        cliente.telefono = "954372548";
        cliente.credito = 2500.50f;
        System.out.println("El Cliente "+ cliente.nombre + " tiene "+ cliente.edad + " años y su teléfono es "
                +cliente.telefono + " tiene un crédito máximo de "+ cliente.credito + "€" );

        Trabajador trabajador = new Trabajador();
        trabajador.edad = 40;
        trabajador.nombre = "Manuel";
        trabajador.telefono = "954383600";
        trabajador.salario = 1000.00f;
        System.out.println("El Trabajador "+ trabajador.nombre + " tiene "+ trabajador.edad + " años y su teléfono es "
                +trabajador.telefono + " tiene un salario de "+ trabajador.salario + "€" );

    }
}
class Persona{
    public int edad;
    public String nombre;
    public String telefono;

}
class Cliente extends Persona{
    public float credito;
}
class Trabajador extends Persona{
    public float salario;
}