package pt.com.restarante.Domain.Entity;

import jakarta.persistence.*;

@Entity
public class Cardapio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private double preco;
    private boolean disponivel;
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    public Cardapio(){}

    public Cardapio(long id, String name, double preco, boolean disponivel, Cliente cliente) {
        this.id = id;
        this.name = name;
        this.preco = preco;
        this.disponivel = disponivel;
        this.cliente = cliente;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
