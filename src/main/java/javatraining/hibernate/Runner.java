package javatraining.hibernate;
import org.hibernate.Session;
import javax.persistence.*;
import java.util.Iterator;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        EntityManagerFactory objEntityManagerFactory= Persistence.createEntityManagerFactory("ing.javatraining2019.ddb");

        EntityManager objEntityManager=objEntityManagerFactory.createEntityManager();

        EmployeeDetails employeeDetails=new EmployeeDetails();

        insert(employeeDetails);

        objEntityManager.getTransaction().begin();

        //objEntityManager.persist(employeeDetails);

        List<Object> listResult=select(objEntityManager,"select  name    from employeeTable where corpkey='wj80vf'");
        for (Object val: listResult  ) {
            System.out.println(val+"******");        }
        Iterator<Object> item=listResult.iterator();
            while (item.hasNext()){
                System.out.println(item.next()+"####");
            }
        objEntityManager.getTransaction().commit();

        objEntityManager=objEntityManagerFactory.createEntityManager();
        objEntityManager.getTransaction().begin();

       listResult=select(objEntityManager,"select  name    from employeeTable where corpkey='wj80vf'");
        for (Object val: listResult  ) {
            System.out.println(val+"******");        }
        item=listResult.iterator();
        while (item.hasNext()){
            System.out.println(item.next()+"####");
        }
        objEntityManager.getTransaction().commit();

        objEntityManager=objEntityManagerFactory.createEntityManager();
        objEntityManager.getTransaction().begin();
        String qlQuery = "select name from employeeTable where corpkey='wj80vf'";
        qlQuery = "select * from employeeTable where corpkey='wj80vf'";

        Session session = objEntityManager.unwrap(Session.class);
        //List<Object[]> listResult2 = (List<Object[]>) session.createSQLQuery(qlQuery).list();
        List<Object[]> listResult2 = (List<Object[]>) session.createSQLQuery(qlQuery).list();
        objEntityManager.close();

        for (Object[] val:  listResult2 ) {
            //System.out.println(val[0] +"******");
            for(Object val1 : val) {
                System.out.print(val1 + "|");
            }
            System.out.println();
        }
        objEntityManager.getTransaction().commit();
        /*
        item=listResult.iterator();
        while (item.hasNext()){
            System.out.println(item.toString()+" "+item.next()+"####");
        }
        System.out.println(listResult);
        objEntityManager.getTransaction().commit();

        objEntityManagerFactory.close();
  */
        /*

        System.out.println("BEN ");
        SessionFactory oSF = new Configuration().configure().buildSessionFactory();
        EmployeeDetails oMD = new EmployeeDetails();
        Session oS = oSF.openSession();
        Transaction oTx;

        System.out.println("List using openSession");
        oTx = oS.beginTransaction();
        List employees = oS.createQuery("FROM employeetable").list();
        for (Iterator iterator = employees.iterator(); iterator.hasNext();){
            EmployeeDetails employee = (EmployeeDetails) iterator.next();
            System.out.print("CorpKey: " + employee.getCorpKey());
            System.out.print("  Last Name: " + employee.getName());
        }
        oTx.commit();
        oS.close();
        */
        /*
        EntityManager objEntityManager=objEntityManagerFactory.createEntityManager();

        EmployeeDetails employeeDetails=new EmployeeDetails();

        insert(employeeDetails);

        objEntityManager.getTransaction().begin();

        //objEntityManager.persist(employeeDetails);

        */
    }



    public static void insert(EmployeeDetails employeeDetails){

        employeeDetails.setCorpKey("WJ80VF");
        employeeDetails.setName("Ansari");
        employeeDetails.setEmail("abc@xyz.com");
        employeeDetails.setTribe("Customer Information Managment");
    }


    public static List<Object> select(EntityManager manager,String query){

        Session session = manager.unwrap(Session.class);

        List<Object> listResult = (List<Object>) session.createSQLQuery(query).list();
        manager.close();
        return listResult;
    }


}
