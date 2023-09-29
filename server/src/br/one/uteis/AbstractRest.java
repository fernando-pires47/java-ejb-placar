package br.one.uteis;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public abstract class AbstractRest <T extends AbstractModel>{
    public abstract AbstractBean<T> getBean();

    @POST
    @Path("salvar")
    @Produces(MediaType.APPLICATION_JSON)
    public Response save(T object) throws Exception {
        return Response.ok(this.getBean().salvar(object)).build();
    }

    @POST
    @Path("/delete/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response delete(@PathParam("id") long id) throws Exception {
        this.getBean().deletar(id);
        return Response.ok("ok").build();
    }

    @POST
    @Path("editar")
    @Produces(MediaType.APPLICATION_JSON)
    public Response edit(T object) throws Exception {
        return Response.ok(this.getBean().alterar(object)).build();
    }

    @POST
    @Path("inserir")
    @Produces(MediaType.APPLICATION_JSON)
    public Response insert(T object) throws Exception {
        return Response.ok(this.getBean().inserir(object)).build();
    }

    @GET
    @Path("getById")
    @Produces(MediaType.APPLICATION_JSON)
    public T getById(T object) throws Exception {
        return this.getBean().buscarPorId(object.getId());
    }
}
