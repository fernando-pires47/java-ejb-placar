package br.one.placarjogo;

import br.one.uteis.AbstractBean;
import br.one.uteis.AbstractRest;
import javax.ejb.EJB;
import javax.ws.rs.Path;

@Path("placarjogo")
public class PlacarJogoRest extends AbstractRest<PlacarJogo> {

    @EJB
    private PlacarJogoBean placarJogoBean;

    @Override
    public AbstractBean<PlacarJogo> getBean() {
        return placarJogoBean;
    }
}
