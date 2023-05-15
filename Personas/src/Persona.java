public class Persona {
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;
    private static final char SEXO_POR_DEFECTO = 'H';

    public Persona() {
        this("", 0, SEXO_POR_DEFECTO, 0, 0);
    }

    public Persona(String nombre, int edad, char sexo) {
        this(nombre, edad, sexo, 0, 0);
    }

    public Persona(String nombre, int edad, String DNI, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }
    
    private char comprobarSexo(char sexo) {
        if (sexo == 'H' || sexo == 'M') {
            return sexo;
        } else {
            return SEXO_POR_DEFECTO;
        }
    }


    public double calcularIMC() {
        double alturaEnMetros = altura / 100; // Convertir altura de cm a m
        return peso / (alturaEnMetros * alturaEnMetros);
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
                "Edad: " + edad + "\n" +
                "DNI: " + DNI + "\n" +
                "Sexo: " + sexo + "\n" +
                "Peso: " + peso + "\n" +
                "Altura: " + altura;
    }
}




En cuanto a tu segunda pregunta, si hubiera varios tipos de personas de naturaleza similar, 
como estudiante y profesor, con pequeñas variaciones entre ellas, se podría crear una clase base 
llamada "Persona" de la cual heredarían las clases "Estudiante" y "Profesor". La clase base "Persona" 
contendría los atributos y métodos comunes a todas las personas, mientras que las clases "Estudiante" y 
"Profesor" podrían agregar atributos y métodos específicos para cada tipo.

En el caso de utilizar la palabra reservada "super", se utilizaría para llamar a los constructores o métodos 
de la clase base desde las clases hijas. Por ejemplo, si la clase "Estudiante" hereda de "Persona" y tiene un 
constructor adicional que recibe el parámetro "curso", podríamos llamar al constructor de la clase base utilizando 
"super(nombre, edad, sexo)" y luego inicializar el atributo "curso" de la clase "Estudiante".

Finalmente, en el enunciado actual no se requieren getters y setters explícitos debido a que los atributos se 
acceden y se modifican directamente dentro de la clase. Sin embargo, en un escenario real, es buena práctica 
çutilizar getters y setters para controlar el acceso a los atributos y mantener la encapsulación. Los getters 
y setters permiten validar y modificar los valores de los atributos antes de ser accedidos o asignados, lo cual 
brinda mayor flexibilidad y seguridad en el código
