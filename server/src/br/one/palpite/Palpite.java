package br.one.palpite;

import br.one.jogo.Jogo;
import br.one.uteis.AbstractModelImpl;
import br.one.usuario.Usuario;

import javax.persistence.*;

@Entity
@Table(name = "palpite")
public class Palpite extends AbstractModelImpl{
    @JoinColumn(name = "usuario",referencedColumnName = "id" , nullable = false)
    @ManyToOne
    private Usuario usuario;

    @JoinColumn(name = "jogo", referencedColumnName = "id" , nullable = false)
    @ManyToOne
    private Jogo jogo;

    @Column(name = "palpitecasa" , nullable = false)
    private int palpitecasa;

    @Column(name = "palpitefora" , nullable = false)
    private int palpitefora;

    public int getPalpitecasa() {
        return palpitecasa;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    public int getPalpitefora() {
        return palpitefora;
    }

    public void setPalpitecasa(int palpitecasa) {
        this.palpitecasa = palpitecasa;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setPalpitefora(int palpitefora) {
        this.palpitefora = palpitefora;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
