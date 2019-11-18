package ug.hibernate.Guerrero;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class DaoMusico{
	
	
protected SessionFactory sessionFactory;
	
	public void setup(){
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure()  //lee los settings del archivo hibernate.cfg.xml
				.build();
		try{
			sessionFactory = new MetadataSources(registry)
					.buildMetadata().buildSessionFactory();			
		} catch (Exception e){
			StandardServiceRegistryBuilder.destroy(registry);
		}
		
	}
	
	
	
	public void crear(Musico  musico){
		Session s = sessionFactory.openSession();
		s.beginTransaction();
		s.save(musico);
		s.getTransaction().commit();
		s.close();
	}
	
	
	
	public Musico read(long productoId){
		Session s =  sessionFactory.openSession();
		Musico producto = s.get(Musico.class,productoId);
		s.close();
		return producto;
		
	}
	
	
	
	public void update(Musico musico){
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.update(musico);
		s.getTransaction().commit();
		s.close();
	}
	

	
	
	//le mando el id del producto a eliminar
	public void delete(int musicoID){
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		Musico musico =read(musicoID);
		s.delete(musico);
		s.getTransaction().commit();
		s.close();
	}
	
	

}
