package pt.com.restarante.Domain.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private String telephone;
    private String endereco;

    @OneToMany(mappedBy = "cliente")
    private List<Cardapio> cardapios;

    public Cliente(){}

    public Cliente(long id, String name, String telephone, String endereco, List<Cardapio> cardapios) {
        this.id = id;
        this.name = name;
        this.telephone = telephone;
        this.endereco = endereco;
        this.cardapios = cardapios;
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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Cardapio> getCardapios() {
        return cardapios;
    }

    public void setCardapios(List<Cardapio> cardapios) {
        this.cardapios = cardapios;
    }
}
