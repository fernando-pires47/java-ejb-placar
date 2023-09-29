package br.one.placar;

import br.one.uteis.AbstractBean;
import br.one.uteis.AbstractRest;

import javax.ejb.EJB;
import javax.ws.rs.Path;

@Path("placar")
public class PlacarRest extends AbstractRest<Placar>{
    @EJB
    private PlacarBean placarBean;

    @Override
    public AbstractBean<Placar> getBean() {
        return placarBean;
    }
}
