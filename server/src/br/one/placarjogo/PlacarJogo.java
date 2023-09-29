package br.one.placarjogo;

import br.one.jogo.Jogo;
import br.one.uteis.AbstractModelImpl;
import br.one.placar.Placar;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "placar_jogo")
public class PlacarJogo extends AbstractModelImpl {

    @JoinColumn(name = "placar", nullable = false,referencedColumnName = "id")
    @ManyToOne
    private Placar placar;

    @JoinColumn(name = "jogo", nullable = false, referencedColumnName = "id")
    @ManyToOne
    private Jogo jogo;

    public Placar getPlacar() {
        return placar;
    }

    public void setPlacar(Placar placar) {
        this.placar = placar;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }
}
