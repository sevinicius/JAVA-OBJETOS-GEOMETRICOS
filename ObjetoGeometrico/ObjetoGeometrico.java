package ObjetoGeometrico;


import ObjetoGeometrico.interfaceGeometria;

public abstract class ObjetoGeometrico implements interfaceGeometria {

    protected double area;
    protected double perimetro;
    protected String cor;

    // Método abstrato para calcular a área
    public abstract double getArea();

    // Método abstrato para calcular o perímetro
    public abstract double getPerimetro();

    // Getter e Setter para a cor
    public String getCor() {
        return cor;
    }

    public void setCor(String c) {
        cor = c;
    }
}