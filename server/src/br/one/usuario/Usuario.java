package br.one.usuario;

import br.one.clube.Clube;
import br.one.uteis.AbstractModelImpl;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario extends AbstractModelImpl{

    @Column(name = "nome",nullable = false,length = 50)
    private String nome;

    @JoinColumn(name = "clube",nullable = false,referencedColumnName = "id")
    @ManyToOne
    private Clube clube;

    @Column(name = "telefone", nullable = false, length = 25)
    private String telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Clube getClube() {
        return clube;
    }

    public void setClube(Clube clube) {
        this.clube = clube;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
