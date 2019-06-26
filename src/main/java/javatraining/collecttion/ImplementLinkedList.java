package javatraining.collecttion;
import javax.swing.*;
import java.util.LinkedList;
import java.util.Objects;
/*
class Customer {
    String CustomerName;
    String CustomerAddress;
    String CustomerPhone;
    String CustomerMaritalStatus;
    String CustomerDOB;

    public Customer(String customerName, String customerAddress, String customerPhone, String customerMaritalStatus, String customerDOB) {
        CustomerName = customerName;
        CustomerAddress = customerAddress;
        CustomerPhone = customerPhone;
        CustomerMaritalStatus = customerMaritalStatus;
        CustomerDOB = customerDOB;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getCustomerAddress() {
        return CustomerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        CustomerAddress = customerAddress;
    }

    public String getCustomerPhone() {
        return CustomerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        CustomerPhone = customerPhone;
    }

    public String getCustomerMaritalStatus() {
        return CustomerMaritalStatus;
    }

    public void setCustomerMaritalStatus(String customerMaritalStatus) {
        CustomerMaritalStatus = customerMaritalStatus;
    }

    public String getCustomerDOB() {
        return CustomerDOB;
    }

    public void setCustomerDOB(String customerDOB) {
        CustomerDOB = customerDOB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return Objects.equals(getCustomerName(), customer.getCustomerName()) &&
                Objects.equals(getCustomerAddress(), customer.getCustomerAddress()) &&
                Objects.equals(getCustomerPhone(), customer.getCustomerPhone()) &&
                Objects.equals(getCustomerMaritalStatus(), customer.getCustomerMaritalStatus()) &&
                Objects.equals(getCustomerDOB(), customer.getCustomerDOB());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCustomerName(), getCustomerAddress(), getCustomerPhone(), getCustomerMaritalStatus(), getCustomerDOB());
    }
}
    private LinkedList <Customer> oLLC;
    private Customer    oC;
 */
public class ImplementLinkedList {
    private LinkedList<String>  oLL = new LinkedList<String>();

    String enterValue(String pMsg) {
        String sStr;
        sStr = JOptionPane.showInputDialog(pMsg);
        return(sStr);
    }

    void automaticInsert() {
        oLL.add("CustomerName");
        oLL.add("CustomerAddress");
        oLL.add("CustomerPhone");
        oLL.add("CustomerMaritalStatus");
        oLL.add("CustomerDOB");
        //oLL.add(new Customer("Giovanni","Addres Giovanni", "Phone Giovanni", "Maried Giovann", "Dob Giovanni"));
        //oLL.add(new Customer("Calogera","Addres Calogera", "Phone Calogera", "Single Calogera", "Dob Calogera"));
    }

    public void listAll() {
        System.out.println("---------------------------------------");
        System.out.println("List All");
        for (String item: this.oLL) {
            System.out.println(item);
        }
        System.out.println("---------------------------------------");
    }

    public void action () {
        System.out.println("Index of CustomerName          :" + oLL.indexOf("CustomerName"));
        System.out.println("Index of CustomerMaritalStatus :" + oLL.indexOf("CustomerMaritalStatus"));
        System.out.println("Index of Cust                  :" + oLL.indexOf("Cus"));
        oLL.set(oLL.indexOf("CustomerPhone"), "CustomerMobile");
        oLL.remove("CustomerDOB");

    }

    public static void main(String[] args) {
        ImplementLinkedList oILL = new ImplementLinkedList();
        oILL.automaticInsert();
        oILL.listAll();
        oILL.action();
        oILL.listAll();
    }
}
