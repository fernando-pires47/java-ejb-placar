package br.one.uteis;

import br.one.clube.ClubeRest;
import br.one.jogo.JogoRest;
import br.one.pais.PaisRest;
import br.one.palpite.PalpiteRest;
import br.one.placar.Placar;
import br.one.placarjogo.PlacarJogoRest;
import br.one.usuario.UsuarioRest;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("rest")
public class ApplicationRest extends Application{
    @Override
    public Set<Class<?>> getClasses() {
            Set<Class<?>> sets = new HashSet<>();
            sets.add(JogoRest.class);
            sets.add(ClubeRest.class);
            sets.add(PalpiteRest.class);
            sets.add(PaisRest.class);
            sets.add(UsuarioRest.class);
            sets.add(PlacarJogoRest.class);
            sets.add(Placar.class);
            return sets;
    }
}
