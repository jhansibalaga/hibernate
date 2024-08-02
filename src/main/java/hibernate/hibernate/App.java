package hibernate.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;


/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("deprecation")
	public static void main( String[] args )
    {
    	
      Configuration conn = new Configuration().configure("hibernate.cfg.xml");
//	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//	
//	Metadata mt = new MetadataSources(ssr).getMetadataBuilder().build();
			
      SessionFactory sf = conn.buildSessionFactory(); // we use sessionfactory because all properties are present in that
      
      Session s = sf.openSession();
      
      Transaction t = s.beginTransaction();
      
      hibernate hb = new hibernate(); //for accessing the getters and setters
      
      hb.setName("jhansi");
      
      hb.setEmail("jhansi@gmail.com");
      
      hb.setPassword("123@!#");
      
      hb.setPhoneno(991232567);
      
      s.save(hb);
      
      t.commit(); // printing
      
      System.out.println("successfully inserted");
      
      sf.close();
      
      s.close();
      
      
      
    }
}
