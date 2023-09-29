package br.one.uteis;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class AbstractBean<T extends AbstractModel>{

    private Class<T> clazz;
    public AbstractBean(Class<T> clazz){
        this.clazz = clazz;
    }

    @PersistenceContext(unitName="project")
    protected EntityManager manager;

    public T inserir(T obj)throws Exception{
        manager.persist(obj);
        manager.flush();
        return obj;
    }

    public T alterar(T obj) throws Exception {
        T old = manager.find(this.clazz, obj.getId());
        manager.merge(obj);
        manager.flush();
        return obj;
    }

    public T salvar(T obj) throws Exception {
        if (obj.getId() == null) {
            return inserir(obj);
        }else {
            return alterar(obj);
        }
    }

    public T buscarPorId(Long id)throws Exception {
        return manager.find(this.clazz, id);
    }

    public void deletar(Long id) throws Exception {
        T old = buscarPorId(id);
        manager.remove(old);
        manager.flush();
    }
}
