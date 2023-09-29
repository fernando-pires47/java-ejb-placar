package br.one.jogo;

import br.one.uteis.AbstractBean;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class JogoBean extends AbstractBean<Jogo> {
    public JogoBean() {
        super(Jogo.class);
    }
}
