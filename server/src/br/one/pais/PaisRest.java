package br.one.pais;


import br.one.uteis.AbstractBean;
import br.one.uteis.AbstractRest;

import javax.ejb.EJB;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("pais")
public class PaisRest extends AbstractRest<Pais>{

    @EJB
    private PaisBean paisBean;


    @Override
    public AbstractBean<Pais> getBean() {
        return paisBean;
    }

    @POST
    @Path("findpaisname")
    public Response findPaisName(String name){
        try{
            List<Pais> paises= paisBean.findByName(name);
            return Response.ok(paises).build();
        }catch (Exception e){
            return Response.serverError().entity(e.getLocalizedMessage()).build();
        }
    }
}
