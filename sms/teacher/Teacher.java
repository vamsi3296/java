package teacher;
import java.util.ArrayList;
import school.School;
/*
 * This class is responsible for keeping the
 * track of teacher's name, id, salary.
 */

public class Teacher{
  private int id;
  private String name;
  private int salary;
  private int salaryEarned;

  /*
   * Creating a new Teacher object.
   * @param id id for teacher.
   * @param name name of the teacher.
   * @param salary salary of the teacher.
   */

  public Teacher(int id, String name, int salary)
  {
    this.id = id;
    this.name = name;
    this.salary = salary;
    this.salaryEarned = 0;//initializing value
  }

  /*
   * Getters and Setters for private variables.
   * @return the id, name, salary of teacher.
   */

  public int getId(){
    return id;
  }

  public String getName(){
    return name;
  }
  public int getSalary(){
    return salary;
  }
  public void updateSalary(int salary){
    this.salary = salary;
  }
//comment on school and update money and salary
  public void receiveSalary(int salary){
    salaryEarned+=salary;
    School.updateTotalMoneySpent(salary);
  }

  @Override
  public String toString(){
    return "Name of the Teacher: "+name+"Salary Earned: \u20B9"+salaryEarned;
  }
}
