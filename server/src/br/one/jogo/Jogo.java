package br.one.jogo;

import br.one.uteis.AbstractModelImpl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "jogo")
public class Jogo extends AbstractModelImpl{
    @Column(name = "clubecasa", nullable = false)
    private Integer clubecasa;

    @Column(name = "clubevisitante" , nullable = false)
    private Integer clubevisitante;

    public Integer getClubecasa() {
        return clubecasa;
    }

    public void setClubecasa(Integer clubecasa) {
        this.clubecasa = clubecasa;
    }

    public Integer getClubevisitante() {
        return clubevisitante;
    }

    public void setClubevisitante(Integer clubevisitante) {
        this.clubevisitante = clubevisitante;
    }
}
