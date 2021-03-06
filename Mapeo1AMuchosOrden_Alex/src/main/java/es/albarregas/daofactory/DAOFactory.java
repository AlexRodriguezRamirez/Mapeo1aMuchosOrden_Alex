package es.albarregas.daofactory;

import es.albarregas.dao.ILibroDAO;
import es.albarregas.dao.IPersonaDAO;



public abstract class DAOFactory {

    public abstract IPersonaDAO getPersonaDAO();
    public abstract ILibroDAO getLibroDAO();
    

    public static DAOFactory getDAOFactory() {
        DAOFactory daof = null;

        daof = new MySQLDAOFactory();

        return daof;
    }

}
