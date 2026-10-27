public class Vehiculo {

    private String patente;
    private String modelo;
    private double kilometrajeAcumulado;

    public Vehiculo(String patente, String modelo) {
        this.patente = patente;
        this.modelo = modelo;
        this.kilometrajeAcumulado = 0;
    }

    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

    public double getKilometraje() {
        return kilometrajeAcumulado;
    }

    public boolean avanzar(double kilometros) {

        if (kilometros <= 0) {
            System.out.println("Trayecto rechazado: los kilómetros deben ser mayores a cero (" + kilometros + ").");
            return false;
        }

        kilometrajeAcumulado = kilometrajeAcumulado + kilometros;
        System.out.println("Trayecto de " + kilometros + " km registrado.");
        return true;
    }
}