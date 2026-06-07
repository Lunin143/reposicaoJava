package objeto;

public class Produto {

    public String nome;
    public double preco;
    public int qnt;

    public Produto(String nome, int qnt, double preco) {
        this.nome = nome;
        this.qnt = qnt;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }


    public String toString() {
        return "Nome: " + nome +
                ", Preço: R$ " + String.format("%.2f", preco) +
                ", Quantidade: " + qnt;
    }
}
