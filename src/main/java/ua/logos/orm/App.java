package ua.logos.orm;

import java.math.BigDecimal;
import java.util.List;
import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import ua.logos.orm.entity.Car;
import ua.logos.orm.entity.Car_color;
import ua.logos.orm.entity.Car_engine_capacity;
import ua.logos.orm.entity.Car_fuel_type;
import ua.logos.orm.entity.Car_make;
import ua.logos.orm.entity.Car_model;
import ua.logos.orm.entity.Car_seller;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 EntityManagerFactory factory=Persistence.createEntityManagerFactory("mysql");
         EntityManager em=factory.createEntityManager();
         em.getTransaction().begin();
         
//         Car_make make_1=new Car_make("renault",new BigDecimal("2005"));
//         Car_make make_2=new Car_make("audi",new BigDecimal("2007"));
//         Car_make make_3=new Car_make("opel",new BigDecimal("2010"));
//         Car_make make_4=new Car_make("wv",new BigDecimal("2003"));
//         Car_make make_5=new Car_make("mercedes",new BigDecimal("2002"));
//         Car_make make_6=new Car_make("volvo",new BigDecimal("2010"));
//         
//         em.persist(make_1);
//         em.persist(make_2);
//         em.persist(make_3);
//         em.persist(make_4);
//         em.persist(make_5);
//         em.persist(make_6);
         
         
//         Car_model model_1=new Car_model("kangoo");
//         Car_model model_2=new Car_model("A6");
//         Car_model model_3=new Car_model("sprinter");
//         Car_model model_4=new Car_model("trafic");
//         Car_model model_5=new Car_model("vivaro");
//         Car_model model_6=new Car_model("golf");
//         Car_model model_7=new Car_model("pasat");
//         Car_model model_8=new Car_model("clio");
//         Car_model model_9=new Car_model("Q7");
//         Car_model model_10=new Car_model("xc60");
//         Car_model model_11=new Car_model("xc70");
//         
//         
//         em.persist(model_1);
//         em.persist(model_2); 
//         em.persist(model_3);
//         em.persist(model_4);
//         em.persist(model_5);
//         em.persist(model_6);
//         em.persist(model_7);
//         em.persist(model_8);
//         em.persist(model_9);
//         em.persist(model_10);
//         em.persist(model_11);
         
//         Car_color cl_blue=new Car_color("blue");         
//         Car_color cl_grey=new Car_color("grey");
//         Car_color cl_green=new Car_color("green");
//         Car_color cl_black=new Car_color("black");
//         Car_color cl_white=new Car_color("white");
//         
//         em.persist(cl_white);
//         em.persist(cl_blue); 
//         em.persist(cl_grey);
//         em.persist(cl_black);
//         em.persist(cl_green);
         
//         for(int i=1;i<=10;i++){
//        	 Car_seller seller=new Car_seller("Name №"+i,"Last name №"+i,i+22,i*1254790);
//        	 em.persist(seller);
//         }
         
//         Car_fuel_type type_1=new Car_fuel_type("gazoline");
//         Car_fuel_type type_2=new Car_fuel_type("diesel");
//         Car_fuel_type type_3=new Car_fuel_type("gas");
//         Car_fuel_type type_4=new Car_fuel_type("mixed");
//         
//         em.persist(type_1);
//         em.persist(type_2);
//         em.persist(type_3);
//         em.persist(type_4);
         
//        for(int i=1;i<=30;i++){
//        	Car car=new Car(new BigDecimal(i*300));
//        	em.persist(car);
//        }
        
//        Car_engine_capacity engine1=new Car_engine_capacity(new BigDecimal("1.4"));
//        Car_engine_capacity engine2=new Car_engine_capacity(new BigDecimal("1.5"));
//        Car_engine_capacity engine3=new Car_engine_capacity(new BigDecimal("1.9"));
//        Car_engine_capacity engine4=new Car_engine_capacity(new BigDecimal("2.0"));
//        Car_engine_capacity engine5=new Car_engine_capacity(new BigDecimal("2.5"));
//        Car_engine_capacity engine6=new Car_engine_capacity(new BigDecimal("1.3"));
//        Car_engine_capacity engine7=new Car_engine_capacity(new BigDecimal("2.2"));
//        
//        em.persist(engine1);
//        em.persist(engine2);
//        em.persist(engine3);
//        em.persist(engine4);
//        em.persist(engine5);
//        em.persist(engine6);
//        em.persist(engine7);
         
//        Car_make car_make_1=em.find(Car_make.class, new Long(1));
//        car_make_1.setCarModel(em.find(Car_model.class, new Long(1)));
//        em.merge(car_make_1);
        
//        Car_make car_make_2=em.find(Car_make.class, new Long(2));
//        car_make_2.setCarModel(em.find(Car_model.class, new Long(2)));
//        em.merge(car_make_2);
//        
//        Car_make car_make_3=em.find(Car_make.class, new Long(3));
//        car_make_3.setCarModel(em.find(Car_model.class, new Long(5)));
//        em.merge(car_make_3);
//        
//        Car_make car_make_4=em.find(Car_make.class, new Long(4));
//        car_make_4.setCarModel(em.find(Car_model.class, new Long(7)));
//        em.merge(car_make_4);
//        
//        Car_make car_make_5=em.find(Car_make.class, new Long(5));
//        car_make_5.setCarModel(em.find(Car_model.class, new Long(3)));
//        em.merge(car_make_5);
//        
//        Car_make car_make_6=em.find(Car_make.class, new Long(6));
//        car_make_6.setCarModel(em.find(Car_model.class, new Long(10)));
//        em.merge(car_make_6);
         
//         Car_model car_model_1=em.find(Car_model.class, new Long(1));
//         car_model_1.setCarColor(em.find(Car_color.class, new Long(3)));
//         em.merge(car_model_1);
//         
//         Car_model car_model_2=em.find(Car_model.class, new Long(7));
//         car_model_2.setCarColor(em.find(Car_color.class, new Long(2)));
//         em.merge(car_model_2);
//         
//         Car_model car_model_3=em.find(Car_model.class, new Long(8));
//         car_model_3.setCarColor(em.find(Car_color.class, new Long(1)));
//         em.merge(car_model_3);
//         
//         Car_model car_model_4=em.find(Car_model.class, new Long(3));
//         car_model_4.setCarColor(em.find(Car_color.class, new Long(5)));
//         em.merge(car_model_4);
//         
//         Car_model car_model_5=em.find(Car_model.class, new Long(10));
//         car_model_5.setCarColor(em.find(Car_color.class, new Long(4)));
//         em.merge(car_model_5);
//         
//         Car_model car_model_6=em.find(Car_model.class, new Long(5));
//         car_model_6.setCarColor(em.find(Car_color.class, new Long(2)));
//         em.merge(car_model_6);
//         
//         Car_model car_model_7=em.find(Car_model.class, new Long(2));
//         car_model_7.setCarColor(em.find(Car_color.class, new Long(3)));
//         em.merge(car_model_7);
         
//         Car_model car_model_1=em.find(Car_model.class, new Long(1));
//         car_model_1.setEngineCapacity(em.find(Car_engine_capacity.class, new Long(2)));
//         car_model_1.setFuel_type(em.find(Car_fuel_type.class, new Long(3)));
//         em.merge(car_model_1);
//         
//         Car_model car_model_2=em.find(Car_model.class, new Long(5));
//         car_model_2.setEngineCapacity(em.find(Car_engine_capacity.class, new Long(7)));
//         car_model_2.setFuel_type(em.find(Car_fuel_type.class, new Long(2)));
//         em.merge(car_model_2);
//         
//         Car_model car_model_3=em.find(Car_model.class, new Long(6));
//         car_model_3.setEngineCapacity(em.find(Car_engine_capacity.class, new Long(2)));
//         car_model_3.setFuel_type(em.find(Car_fuel_type.class, new Long(1)));
//         em.merge(car_model_3);
//         
//         Car_model car_model_4=em.find(Car_model.class, new Long(10));
//         car_model_4.setEngineCapacity(em.find(Car_engine_capacity.class, new Long(5)));
//         car_model_4.setFuel_type(em.find(Car_fuel_type.class, new Long(2)));
//         em.merge(car_model_4);
//         
//         Car_model car_model_5=em.find(Car_model.class, new Long(3));
//         car_model_5.setEngineCapacity(em.find(Car_engine_capacity.class, new Long(3)));
//         car_model_5.setFuel_type(em.find(Car_fuel_type.class, new Long(4)));
//         em.merge(car_model_5);
//         
//         Car_model car_model_6=em.find(Car_model.class, new Long(9));
//         car_model_6.setEngineCapacity(em.find(Car_engine_capacity.class, new Long(1)));
//         car_model_6.setFuel_type(em.find(Car_fuel_type.class, new Long(1)));
//         em.merge(car_model_6);
         
//         Car car_1=em.find(Car.class, new Long(1));
//         car_1.setCarMake(em.find(Car_make.class, new Long(5)));
//         car_1.setCarSeller(em.find(Car_seller.class, new Long(8)));
//         em.merge(car_1);
//         
//         Car car_2=em.find(Car.class, new Long(12));
//         car_2.setCarMake(em.find(Car_make.class, new Long(2)));
//         car_2.setCarSeller(em.find(Car_seller.class, new Long(2)));
//         em.merge(car_2);
//         
//         Car car_3=em.find(Car.class, new Long(9));
//         car_3.setCarMake(em.find(Car_make.class, new Long(4)));
//         car_3.setCarSeller(em.find(Car_seller.class, new Long(5)));
//         em.merge(car_3);
//         
//         Car car_4=em.find(Car.class, new Long(5));
//         car_4.setCarMake(em.find(Car_make.class, new Long(3)));
//         car_4.setCarSeller(em.find(Car_seller.class, new Long(1)));
//         em.merge(car_4);
//         
//         Car car_5=em.find(Car.class, new Long(22));
//         car_5.setCarMake(em.find(Car_make.class, new Long(1)));
//         car_5.setCarSeller(em.find(Car_seller.class, new Long(6)));
//         em.merge(car_5);
//         
//         Car car_6=em.find(Car.class, new Long(7));
//         car_6.setCarMake(em.find(Car_make.class, new Long(6)));
//         car_6.setCarSeller(em.find(Car_seller.class, new Long(10)));
//         em.merge(car_6);
//         
//         Car car_7=em.find(Car.class, new Long(6));
//         car_7.setCarMake(em.find(Car_make.class, new Long(2)));
//         car_7.setCarSeller(em.find(Car_seller.class, new Long(4)));
//         em.merge(car_7);
         
//         Car car=em.createQuery("SELECT c FROM Car c WHERE id=:id",Car.class).setParameter("id", new Long(4)).getSingleResult();
//         System.out.println(car);
         
         //_______________________Помилка, не хоче виводити рядки в яких заповнені всі поля____________
//         Car car=em.createQuery("SELECT c FROM Car c WHERE id=:id",Car.class).setParameter("id", new Long(1)).getSingleResult();
//         System.out.println(car);
         
//         Car_color color=em.createQuery("SELECT c FROM Car_color c WHERE c.color LIKE '%te'",Car_color.class).getSingleResult();
//         System.out.println(color);
         
//         Car_engine_capacity capacity=em.createQuery("SELECT e FROM Car_engine_capacity e WHERE e.engine_capacity>2.3",Car_engine_capacity.class).getSingleResult();
//         System.out.println(capacity);
         
//         Car_engine_capacity capacity=em.createQuery("SELECT e FROM Car_engine_capacity e WHERE e.engine_capacity BETWEEN :start and :finish",Car_engine_capacity.class)
//        .setParameter("start", new BigDecimal(2.1)).setParameter("finish", new BigDecimal(2.4)).getSingleResult();
//         System.out.println(capacity);
         
         //____________________________________ERROR______________________________
//         List<Car_model> models=em.createQuery("SELECT m FROM Car_model m WHERE m.id BETWEEN :start and :finish",Car_model.class)
//        		 .setParameter("start", new Long(2)).setParameter("finish", new Long(6)).getResultList();
//         models.forEach(t->System.out.println(models));
        

         
         CriteriaBuilder cb=em.getCriteriaBuilder();
         CriteriaQuery<Car_model> query=cb.createQuery(Car_model.class);
         Root<Car_model> root=query.from(Car_model.class);
         query.select(root);
         
         em.getTransaction().commit();
         em.close();
         factory.close();
    }
}
