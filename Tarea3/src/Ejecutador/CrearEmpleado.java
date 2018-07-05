package Ejecutador;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import trabajo.Empleado;

public class CrearEmpleado {

	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "Eclipselink_JPA" );
	      EntityManager entitymanager = emfactory.createEntityManager( );
	      entitymanager.getTransaction( ).begin( );

	      Empleado empleado = new Empleado( ); 
	      empleado.setId( 1201 );
	      empleado.setNombre( "Manuel" );
	      empleado.setSalario( 40000 );
	      empleado.setOcupacion( "Oficinista" );
	      
	      entitymanager.persist( empleado );
	      entitymanager.getTransaction( ).commit( );

	      entitymanager.close( );
	      emfactory.close( );

	}

}
