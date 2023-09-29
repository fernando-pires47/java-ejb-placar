package br.one.clube;

import br.one.uteis.AbstractBean;
import br.one.uteis.AbstractRest;

import javax.ejb.EJB;
import javax.ws.rs.Path;

@Path("clube")
public class ClubeRest extends AbstractRest<Clube> {

    @EJB
    private ClubeBean clubesBean;

    @Override
    public AbstractBean<Clube> getBean() {
        return clubesBean;
    }
}
