package br.one.placar;

import br.one.uteis.AbstractModelImpl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "placar")
public class Placar extends AbstractModelImpl{

    @Column(name = "golscasa", nullable = false)
    private int golscasa;

    @Column(name = "golsvisitante" , nullable = false)
    private int golsvisitante;

    @Column(name = "status", length = 1 , nullable = false)
    private String status;

    public int getGolscasa() {
        return golscasa;
    }

    public void setGolscasa(int golscasa) {
        this.golscasa = golscasa;
    }

    public int getGolsvisitante() {
        return golsvisitante;
    }

    public void setGolsvisitante(int golsvisitante) {
        this.golsvisitante = golsvisitante;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
