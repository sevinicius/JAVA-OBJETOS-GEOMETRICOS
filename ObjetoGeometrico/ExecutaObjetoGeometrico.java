package ObjetoGeometrico;

public class ExecutaObjetoGeometrico {

    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(5);
        quadrado.setCor("Azul");

        System.out.println("Quadrado:");
        System.out.println("Cor: " + quadrado.getCor());
        System.out.println("Lado: " + quadrado.getLado());
        System.out.println("Área: " + quadrado.getArea());
        System.out.println("Perímetro: " + quadrado.getPerimetro());

        quadrado.setLado(10);

        System.out.println("\nApós alterar o lado para 10:");
        System.out.println("Lado: " + quadrado.getLado());
        System.out.println("Área: " + quadrado.getArea());
        System.out.println("Perímetro: " + quadrado.getPerimetro());
    }
}