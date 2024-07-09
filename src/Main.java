import org.w3c.dom.ls.LSOutput;

import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.ServiceUIFactory;
import javax.print.attribute.Attribute;
import javax.print.attribute.AttributeSet;
import javax.print.attribute.PrintServiceAttribute;
import javax.print.attribute.PrintServiceAttributeSet;
import javax.print.event.PrintServiceAttributeListener;

public class Main {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Ivan", 20, 101),
                new Person("Vasya", 25, 102),
                new Person("Petya", 22, 103),
                new Person("Petya", 12, 104),
                new Person("Petya", 18, 105),
        };
        System.out.println("Размер списка " + people.length);
        for (Person person : people) {
            System.out.println("имя " + person.getName() + "; возраст " + person.getAge() + "; телефон " + person.getPhoneNumber());
        }

        System.out.println();

        System.out.println("Размер списка покупателей " + people.length);
        Customer[] customers = {
                new Customer("Ivan", 20, 101, 987654321),
                new Customer("Vasya", 25, 102, 123456789),
                new Customer("Petya", 22, 103, 123456710),
                new Customer("Petya", 12, 104, 123456798),
                new Customer("Petya", 18, 105, 123456774),
        };
        for (int i = 0; i < customers.length; i++) {
            Customer customer = customers[i];
            System.out.println("Имя " + customer.getName() + "; возраст " + customer.getAge() + "; телефон " + customer.getPhoneNumber() + "; номер карты " + customer.getCardNumber());
        }
    }
}