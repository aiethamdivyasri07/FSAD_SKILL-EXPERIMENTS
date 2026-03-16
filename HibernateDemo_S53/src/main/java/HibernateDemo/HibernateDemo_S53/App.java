package HibernateDemo.HibernateDemo_S53;



import java.util.List; 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;


public class App {
    public static void main(String[] args) {
    	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
    	Metadata md = new MetadataSources(ssr).getMetadataBuilder().build();
    	SessionFactory sf = md.getSessionFactoryBuilder().build();
    	Session s= sf.openSession();
    	Transaction t;
    	System.out.println("Example related to sorting");
    
    	Query q=s.createQuery("FROM Employee e order by e.fname DESC");
    	List <Employee> l=q.list();
    	for(Employee i:l) {
    		System.out.println(i.getRegno()+" "+i.getFname()+" "+i.getLname());
    		
    	}
    }    
}
