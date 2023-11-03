import java.util.Scanner;

public class CalculadoraTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de Perímetro y Área de Triángulo");
        System.out.print("Ingresa la longitud del primer lado: ");
        double lado1 = scanner.nextDouble();
        System.out.print("Ingresa la longitud del segundo lado: ");
        double lado2 = scanner.nextDouble();
        System.out.print("Ingresa la longitud del tercer lado: ");
        double lado3 = scanner.nextDouble();

        // Calcula el perímetro
        double perimetro = calcularPerimetro(lado1, lado2, lado3);

        // Calcula el área
        double area = calcularArea(lado1, lado2, lado3);

        System.out.println("El perímetro del triángulo es: " + perimetro);
        System.out.println("El área del triángulo es: " + area);

        scanner.close();
    }

    // Función para calcular el perímetro de un triángulo
    public static double calcularPerimetro(double lado1, double lado2, double lado3) {
        return lado1 + lado2 + lado3;
    }

    // Función para calcular el área de un triángulo usando la fórmula de Herón
    public static double calcularArea(double lado1, double lado2, double lado3) {
        double semiperimetro = calcularPerimetro(lado1, lado2, lado3) / 2;
        double area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
        return area;
    }
}
