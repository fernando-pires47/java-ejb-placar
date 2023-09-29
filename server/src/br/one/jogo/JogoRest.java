package br.one.jogo;

import br.one.uteis.AbstractBean;
import br.one.uteis.AbstractRest;

import javax.ejb.EJB;
import javax.ws.rs.Path;

@Path("jogo")
public class JogoRest extends AbstractRest<Jogo> {
    @EJB
    private JogoBean jogoBean;

    @Override
    public AbstractBean<Jogo> getBean() {
        return jogoBean;
    }
}
