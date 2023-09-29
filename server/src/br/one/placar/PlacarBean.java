package br.one.placar;

import br.one.uteis.AbstractBean;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class PlacarBean extends AbstractBean<Placar> {
    public PlacarBean() {
        super(Placar.class);
    }
}
