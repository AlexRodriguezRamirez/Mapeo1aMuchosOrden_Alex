package es.albarregas.daofactory;

import es.albarregas.dao.ILibroDAO;
import es.albarregas.dao.IPersonaDAO;
import es.albarregas.dao.LibroDAO;
import es.albarregas.dao.PersonaDAO;

public class MySQLDAOFactory extends DAOFactory{

    @Override
    public IPersonaDAO getPersonaDAO() {
        return new PersonaDAO();
    }

    @Override
    public ILibroDAO getLibroDAO() {
        return new LibroDAO();
    }
}
