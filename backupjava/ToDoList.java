package tdl.main;

import java.util.Scanner;
import java.util.Date;
import java.text.*;
import java.util.*;
import java.lang.System.*;
import java.io.*;

class Declare implements Serializable
{
  private String description;
  private int srNo;
  private String createdOn;
  private String dueDate;

  public void setDescription(String s)
  {
    this.description = s;
  }

  public void setDate(String s)
  {
    this.createdOn = s;
  }

  public void setDueDate(String s)
  {
    this.dueDate = s;
  }

  public String getDescription()
  {
    return description;
  }

  public String getCreatedDate()
  {
    return createdOn;
  }
  public String getDueDate()
  {
    return dueDate;
  }
  @Override
  public String toString()
  {
    return "sr no. " + srNo + "Description: " + description + "created on: " + 
      createdOn + "Due Date: " + dueDate;
  }
}
public class ToDoList implements Serializable{

  public static void main(String  args[])
  {
    Declare obj = new Declare();
    Scanner input = new Scanner(System.in);
    System.out.print("Task: ");
    String temp = input.nextLine();
    obj.setDescription(temp);
    Date today = new Date();
    SimpleDateFormat todayFormat = new SimpleDateFormat("E yyyy.MM.dd 'at' HH:mm");
    temp = todayFormat.format(today);
    obj.setDate(temp);
    System.out.print("Due on: ");
    temp = input.nextLine();
    obj.setDueDate(temp);
    System.out.println("sr.no\t\t\tDesctiption\t\t\tDue Date\t\t\tCreated On");
    System.out.println("1\t\t\t" + obj.getDescription() + "\t\t\t " + obj.getCreatedDate() + "\t\t\t" + obj.getDueDate() );
    try{
      FileOutputStream fos = new FileOutputStream("todolist.ser");
      ObjectOutputStream oos = new ObjectOutputStream(fos);

      oos.writeObject(obj);
      System.out.println("Done");
			// closing resources
			oos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
  }
}
