package br.one.clube;

import br.one.uteis.AbstractBean;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class ClubeBean extends AbstractBean<Clube>{
    public ClubeBean() {
        super(Clube.class);
    }
}
