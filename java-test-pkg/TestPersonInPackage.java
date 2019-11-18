import java.lang.*;
import personpackage.Person;

public class TestPersonInPackage {
  public static void main(String args[])
  {
    //Instantiate the Person class
    Person person = new Person();

    //setting firstname and lastname
    person.setFirstName("Vamsi");
    person.setLastName("Krishna");

    //getting first and lastname
    System.out.println("Your full name is: "+person.getFirstName()+" "+person.getLastName());
  }
}
