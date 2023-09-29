package br.one.pais;

import br.one.uteis.AbstractModelImpl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pais")
public class Pais extends AbstractModelImpl {

    @Column(name = "siglapais",nullable = false,length = 2 )
    private String siglapais;

    @Column(name = "nome",nullable = false,length = 50)
    private String nome;

    public String getNome() {
        return nome;
    }

    public String getSiglapais() {
        return siglapais;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSiglapais(String siglapais) {
        this.siglapais = siglapais;
    }
}
