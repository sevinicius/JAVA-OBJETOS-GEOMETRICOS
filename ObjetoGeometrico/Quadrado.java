package ObjetoGeometrico;

public class Quadrado extends ObjetoGeometrico {

    private double lado;

    // Construtor para o Quadrado
    Quadrado(double l) {
        lado = l;
    }

    // Implementação do método para calcular a área
    public double getArea() {
        area = lado * lado;
        return area;
    }

    // Implementação do método para calcular o perímetro
    public double getPerimetro() {
        perimetro = 4 * lado;
        return perimetro;
    }

    // Getter para o lado do quadrado
    public double getLado() {
        return lado;
    }

    // Setter para o lado do quadrado
    public void setLado(double lado) {
        this.lado = lado;
    }
}
