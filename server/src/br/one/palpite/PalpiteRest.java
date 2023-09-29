package br.one.palpite;

import br.one.uteis.AbstractBean;
import br.one.uteis.AbstractRest;
import javax.ejb.EJB;
import javax.ws.rs.Path;

@Path("palpite")
public class PalpiteRest extends AbstractRest<Palpite> {
    @EJB
    private PalpiteBean palpiteBean;

    @Override
    public AbstractBean<Palpite> getBean() {
        return palpiteBean;
    }
}
