package Product;

public class Produto {
    public String name;
    public double price;
    public int quantidade;

    public int entradaEmStock(int numUnidades) {
        quantidade = quantidade + numUnidades;
        return quantidade;
    }

    public int saidaEmStock(int numUnidades) {
        quantidade = quantidade - numUnidades;
        return quantidade;
    }
}
