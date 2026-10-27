# Sistema de Control de Kilometraje de Vehículos

## Descripción

Este proyecto desarrolla una clase `Vehiculo` en Java que permite registrar los trayectos realizados por un vehículo y mantener un kilometraje acumulado. Se utiliza el encapsulamiento para proteger el odómetro y evitar modificaciones directas que alteren el registro de kilómetros recorridos.

## Funcionamiento

El programa crea un vehículo con una patente y un modelo, inicializando su kilometraje en cero. Luego registra distintos trayectos para comprobar el funcionamiento del sistema.

* **Creación de vehículos:** almacena la patente y el modelo, e inicializa el kilometraje acumulado en cero.
* **Consulta de información:** permite obtener la patente, el modelo y el kilometraje mediante métodos públicos.
* **Registro de trayectos:** el método `avanzar()` suma los kilómetros recorridos al total acumulado.
* **Validación de recorridos:** rechaza los valores iguales o inferiores a cero para evitar modificaciones inválidas.
* **Protección del odómetro:** no existe un método setter para modificar directamente el kilometraje.

## Clases principales

### `Vehiculo`

Representa un vehículo y controla el registro de su kilometraje acumulado.

**Atributos:**

* `patente`: identifica al vehículo mediante su patente.
* `modelo`: almacena el modelo del vehículo.
* `kilometrajeAcumulado`: registra la distancia total recorrida.

**Métodos principales:**

* `getPatente()`: devuelve la patente del vehículo.
* `getModelo()`: devuelve el modelo.
* `getKilometraje()`: devuelve el kilometraje acumulado.
* `avanzar(double kilometros)`: registra un trayecto si la cantidad de kilómetros es mayor que cero y devuelve `true`; de lo contrario, devuelve `false`.

### `Main`

Contiene el método `main`, crea un vehículo y prueba trayectos válidos e inválidos para comprobar que el kilometraje se actualice correctamente.

## Conceptos de programación utilizados

* **Programación orientada a objetos (POO):** representación de un vehículo mediante una clase.
* **Encapsulamiento:** utilización de atributos privados para proteger los datos.
* **Métodos de acceso (getters):** permiten consultar información sin modificarla directamente.
* **Validación de datos:** impide registrar trayectos de cero o menos kilómetros.
* **Métodos con retorno booleano:** indican si una operación se realizó correctamente.
* **Acumulación de valores:** suma progresiva de los kilómetros recorridos.
* **Protección de la integridad de los datos:** evita que el kilometraje se modifique directamente desde otras clases.

## Tecnologías utilizadas

* Java
* IntelliJ IDEA
* Git y GitHub

## Ejecución

<img width="706" height="370" alt="image" src="https://github.com/user-attachments/assets/41023983-3946-429a-a2ec-abbc875dc252" />

## Resultado esperado

El vehículo comienza con un kilometraje de `0 km`. Después de registrar trayectos de `120.5 km` y `80 km`, el kilometraje acumulado alcanza los `200.5 km`.

Los intentos de registrar `-50 km` y `0 km` son rechazados, por lo que el kilometraje final permanece en `200.5 km`.

## Objetivo del ejercicio

Aplicar los principios de encapsulamiento y validación en Java mediante una clase que permita acumular kilómetros recorridos sin permitir modificaciones directas o trayectos inválidos.
