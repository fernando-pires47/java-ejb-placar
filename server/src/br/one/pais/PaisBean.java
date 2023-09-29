package br.one.pais;

import br.one.uteis.AbstractBean;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.Query;
import java.util.List;

@Stateless
@LocalBean
public class PaisBean extends AbstractBean<Pais> {
    public PaisBean() {
        super(Pais.class);
    }

    public List<Pais> findByName(String name){
        String sql = "Select p From Pais p  where p.nome like :nome";
        Query q = manager.createQuery(sql,Pais.class);
        q.setParameter("nome", "%" + name.trim() + "%");
        List<Pais> list = q.getResultList();
        return list;
    }
}
