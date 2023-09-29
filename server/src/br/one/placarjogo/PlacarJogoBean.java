package br.one.placarjogo;

import br.one.uteis.AbstractBean;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class PlacarJogoBean extends AbstractBean<PlacarJogo> {
    public PlacarJogoBean() {
        super(PlacarJogo.class);
    }
}
