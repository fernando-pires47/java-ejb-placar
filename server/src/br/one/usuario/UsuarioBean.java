package br.one.usuario;

import br.one.uteis.AbstractBean;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.Query;
import java.util.List;

@Stateless
@LocalBean
public class UsuarioBean extends AbstractBean<Usuario> {

    UsuarioBean(){
        super(Usuario.class);
    }

    public List<Usuario> sendUsuarioName(String name){
        String sql= "Select u from  Usuario u where u.nome like :nome";
        Query q = manager.createQuery(sql);
        q.setParameter("nome",'%' + name.trim() + '%');
        return q.getResultList();
    }
}
