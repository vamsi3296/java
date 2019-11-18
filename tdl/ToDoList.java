package tdl;

import tdl.Declare;
import tdl.readdata.readData2;
import tdl.datawrite.dataWrite;
import tdl.deletedata.deleteData;
import tdl.AppendingObjectOutputStream;
import java.util.Scanner;
import java.util.Date;
import java.text.*;
import java.util.*;
import java.lang.System.*;
import java.io.*;


public class ToDoList implements Serializable{

public void addToDo(int i){
    Declare obj = new Declare();
    obj.setSrNo(i);
    System.out.println("No. " + obj.getSrNo());
    Scanner input = new Scanner(System.in);
    System.out.print("Task: ");
    String temp = input.nextLine();
    obj.setDescription(temp);
    Date today = new Date();
    //Creating today and Formattingit.
    SimpleDateFormat todayFormat = new SimpleDateFormat("E yyyy.MM.dd 'at' HH:mm");
    temp = todayFormat.format(today);
    obj.setDate(temp);
    System.out.print("Due on: ");
    temp = input.nextLine();
    obj.setDueDate(temp);
    try{
        dataWrite.writeD(obj.toString());
    }catch(IOException e){
      System.out.println(e);
    }
  }

  public static void main(String  args[]) throws Exception
  {
    int i = 0;
    Scanner input = new Scanner(System.in);
    System.out.println("No.\tDescription\t\tCreated\t\t\tDue Date");
    try
    {
      //passing i value and returning the Sr.no.
      i = readData2.dataRead(i);
    }catch(Exception e)
    {
      System.out.println(e);
    }
    System.out.println("Please Choose the action to be performed: ");
    System.out.println("1. Add new.\t2. Update.\t3. Delete.\t4. Exit.");
    int choice = input.nextInt();
    switch(choice)
    {
      case 1:
        System.out.println("Adding");
        ToDoList addData = new ToDoList();
        addData.addToDo(i);
        break;
      case 2:
        break;
      case 3:
        System.out.println("Index no. of the row to be deleted: ");
        int s = input.nextInt();
        deleteData.deleteD(String.valueOf(s));
        break;
      case 4:
        break;
    }
    /*try{
      FileWriter file = new FileWriter("todolist.txt", true);
      PrintWriter out = new PrintWriter(file);
      out.println(obj.toString());
      out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}*/
    	i = readData2.dataRead(i = 0);
  }
}
