package javatraining.hibernate2;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/*create table users (
        id integer not null,
        first_name varchar(255),
        last_name varchar(255),
        primary key (id)
        )
        and the following corresponding Java class:
*/


class TUserBenMain {

    public static void main(String[] args) {
        System.out.println("javatraining/hibernate2/BEN ");
        //SessionFactory oSF = new Configuration().configure("C:\\JavaTraining\\JavaPrograms\\src\\main\\java\\javatraining\\hibernate2\\EmployeeTable.hbm.xml").buildSessionFactory();
        //System.out.println(new Configuration().configure().getProperty());
        //getSystemResourceAsStream(getResourceAsStream());
        //Configuration oC = new Configuration();
        //oC.configure().setProperty();
        //Configuration().configure("/JavaTraining/JavaPrograms/src/main/java/javatraining/hibernate2/hibernate.cfg.xml").buildSessionFactory();
        SessionFactory oSF = new Configuration().configure("/javatraining/hibernate2/BEN/hibernate.cfg.xml").buildSessionFactory();

        /*
        TUserBen oTUB = new TUserBen();
        Session oS = oSF.openSession();
        Transaction oTx;

        System.out.println("List using openSession");
        oTx = oS.beginTransaction();
        List TUserBen = oS.createQuery("FROM userben").list();
        for (Iterator iterator = TUserBen.iterator(); iterator.hasNext();){
            TUserBen employee = (TUserBen) iterator.next();
            //System.out.print("CorpKey: " + TUserBen.getCorpKey());
            //System.out.print("  Last Name: " + employee.getName());
        }
        oTx.commit();
        oS.close();
        */
    }

/*
public class ManageEmployee {
   private static SessionFactory factory;
   public static void main(String[] args) {

      try {
         factory = new Configuration().configure().buildSessionFactory();
      } catch (Throwable ex) {
         System.err.println("Failed to create sessionFactory object." + ex);
         throw new ExceptionInInitializerError(ex);
      }

      ManageEmployee ME = new ManageEmployee();

      'Add few employee records in database * /
Integer empID1 = ME.addEmployee("Zara", "Ali", 1000);
    Integer empID2 = ME.addEmployee("Daisy", "Das", 5000);
    Integer empID3 = ME.addEmployee("John", "Paul", 10000);

      / * List down all the employees * /
    ME.listEmployees();

      / * Update employee's records * /
    ME.updateEmployee(empID1, 5000);

      / * Delete an employee from the database * /
    ME.deleteEmployee(empID2);

      / * List down new list of the employees * /
    ME.listEmployees();
}

    / * Method to CREATE an employee in the database * /
    public Integer addEmployee(String fname, String lname, int salary){
        Session session = factory.openSession();
        Transaction tx = null;
        Integer employeeID = null;

        try {
            tx = session.beginTransaction();
            Employee employee = new Employee(fname, lname, salary);
            employeeID = (Integer) session.save(employee);
            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return employeeID;
    }

    / * Method to  READ all the employees * /
    public void listEmployees( ){
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            List employees = session.createQuery("FROM Employee").list();
            for (Iterator iterator = employees.iterator(); iterator.hasNext();){
                Employee employee = (Employee) iterator.next();
                System.out.print("First Name: " + employee.getFirstName());
                System.out.print("  Last Name: " + employee.getLastName());
                System.out.println("  Salary: " + employee.getSalary());
            }
            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    / * Method to UPDATE salary for an employee * /
    public void updateEmployee(Integer EmployeeID, int salary ){
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            Employee employee = (Employee)session.get(Employee.class, EmployeeID);
            employee.setSalary( salary );
            session.update(employee);
            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    / * Method to DELETE an employee from the records * /
    public void deleteEmployee(Integer EmployeeID){
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();
            Employee employee = (Employee)session.get(Employee.class, EmployeeID);
            session.delete(employee);
            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}*/

    public static void insert(TUserBen pT){

        /*pT.setCorpKey("WJ80VF");
        employeeDetails.setName("Ansari");
        employeeDetails.setEmail("abc@xyz.com");
        employeeDetails.setTribe("Customer Information Managment");
        */
    }


    /*
    public static List<Object> select(EntityManager manager,String query){

        Session session = manager.unwrap(Session.class);

        List<Object> listResult = (List<Object>) session.createSQLQuery(query).list();
        manager.close();
        return listResult;
    }
    */

}
