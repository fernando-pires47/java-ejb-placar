package br.one.clube;

import br.one.uteis.AbstractModelImpl;
import br.one.pais.Pais;
import javax.persistence.*;

@Entity
@Table(name = "clube")
public class Clube extends AbstractModelImpl {

    @Column(name = "nome", length = 50)
    private String nome;

    @JoinColumn(name = "pais", referencedColumnName = "id")
    @ManyToOne
    private Pais pais;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
