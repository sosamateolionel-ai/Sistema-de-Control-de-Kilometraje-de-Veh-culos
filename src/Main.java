
void main() {

    Vehiculo auto = new Vehiculo("AB123CD", "Fiat Cronos");

    System.out.println("Kilometraje inicial: " + auto.getKilometraje() + " km");

    System.out.println("\n--- Trayectos válidos ---");
    auto.avanzar(120.5);
    auto.avanzar(80);

    System.out.println("\n--- Trayectos inválidos ---");
    auto.avanzar(-50);   // intentar retroceder
    auto.avanzar(0);     // no avanza nada

    System.out.println("\nKilometraje total: " + auto.getKilometraje() + " km");

}
