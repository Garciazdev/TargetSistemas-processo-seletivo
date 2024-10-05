package faturamentoDiario;

public class FaturamentoDados {
    private String data;
    private double valor;

    public FaturamentoDados(String data, double valor) {
        this.data = data;
        this.valor = valor;
    }
    public String getData() {
        return data;
    }

    public double getValor() {
        return valor;
    }
    public String toString() {
        return "Data " + data + ", Faturamento R$ " + String.format("%.2f", valor);
    }
}
