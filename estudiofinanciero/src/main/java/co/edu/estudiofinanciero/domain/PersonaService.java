package co.edu.estudiofinanciero.domain;

import java.util.List;

public interface PersonaService {

    List<Persona> listar();

    Persona listarId(int id);

    Persona add(Persona p);

    Persona edit(Persona p);

    Persona delete(int id);
}
