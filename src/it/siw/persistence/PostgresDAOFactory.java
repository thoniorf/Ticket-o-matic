package it.siw.persistence;

import com.zaxxer.hikari.HikariDataSource;

import it.siw.persistence.dao.EventCategoryDAO;
import it.siw.persistence.dao.EventDAO;
import it.siw.persistence.dao.GuestDAO;
import it.siw.persistence.dao.OrderDAO;
import it.siw.persistence.dao.SellDAO;
import it.siw.persistence.dao.TicketCategoryDAO;
import it.siw.persistence.dao.TicketDAO;
import it.siw.persistence.dao.UserDAO;
import it.siw.persistence.dao.WishlistDAO;
import it.siw.persistence.dao.implementation.EventCategoryDaoJDBC;
import it.siw.persistence.dao.implementation.EventDaoJDBC;
import it.siw.persistence.dao.implementation.GuestDAOJDBC;
import it.siw.persistence.dao.implementation.OrderDAOJDBC;
import it.siw.persistence.dao.implementation.SellDAOJDBC;
import it.siw.persistence.dao.implementation.TicketCategoryDAOJDBC;
import it.siw.persistence.dao.implementation.TicketDAOJDBC;
import it.siw.persistence.dao.implementation.UserDaoJDBC;
import it.siw.persistence.dao.implementation.WishlistDAOJDBC;

/**
 * Concrete Postgres DAO factory implementation
 */
public class PostgresDAOFactory extends DAOFactory {

    public static final String DRIVER = "org.postgresql.Driver";

    private static PostgresDAOFactory postgres;

    private static String DBURL = "jdbc:postgresql://127.0.0.1/tom?ApplicationName=Ticket-o-Matic";
    private static String USERNAME = "postgres";
    private static String PASSWORD = "postgres";

    private static HikariDataSource datasource;

    public static PostgresDAOFactory getInstance() {
	if (postgres == null) {
	    postgres = new PostgresDAOFactory();
	}
	return postgres;
    }

    private PostgresDAOFactory() {
	try {
	    Class.forName(DRIVER).newInstance();
	    datasource = new HikariDataSource();
	    datasource.setJdbcUrl(DBURL);
	    datasource.setUsername(USERNAME);
	    datasource.setPassword(PASSWORD);
	    datasource.setMaximumPoolSize(10);
	    datasource.setIdleTimeout(600000);
	    datasource.setConnectionTimeout(30000);
	} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
	    System.err.println("PostgresDAOFactory.class: failed to load JDBC driver\n" + e);
	    e.printStackTrace();
	}
    }

    @Override
    public void destroyDataSource() {
	datasource.close();
    }

    @Override
    public EventDAO getEventDAO() {
	return new EventDaoJDBC(datasource);
    }

    @Override
    public UserDAO getUserDAO() {
	return new UserDaoJDBC(datasource);
    }

    @Override
    public EventCategoryDAO getEventCategoryDAO() {
	return new EventCategoryDaoJDBC(datasource);
    }

    @Override
    public WishlistDAO getWishlistDAO() {
	return new WishlistDAOJDBC(datasource);
    }

    @Override
    public OrderDAO getOrderDAO() {
	return new OrderDAOJDBC(datasource);
    }

    @Override
    public TicketDAO getTicketDAO() {
	return new TicketDAOJDBC(datasource);
    }

    @Override
    public SellDAO getSellDAO() {
	return new SellDAOJDBC(datasource);
    }

    @Override
    public TicketCategoryDAO getTicketCategoryDAO() {
	return new TicketCategoryDAOJDBC(datasource);
    }

    @Override
    public GuestDAO getGuestDAO() {
	return new GuestDAOJDBC(datasource);
    }
}
