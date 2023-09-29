package br.one.palpite;

import br.one.uteis.AbstractBean;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class PalpiteBean extends AbstractBean<Palpite>{
    public PalpiteBean() {
        super(Palpite.class);
    }
}
