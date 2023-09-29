package br.one.usuario;

import br.one.uteis.AbstractBean;
import br.one.uteis.AbstractRest;

import javax.ejb.EJB;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("usuario")
public class UsuarioRest  extends AbstractRest<Usuario> {
    @EJB
    private UsuarioBean usuarioBean;

    @Override
    public AbstractBean<Usuario> getBean() {
        return usuarioBean;
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("findUsuarioName")
    public Response findUsuarioName(String name) {

        try {
            return Response.ok(usuarioBean.sendUsuarioName(name)).build();
        } catch (Exception e) {
            return Response.serverError().entity(e.getLocalizedMessage()).build();
        }
    }
}
