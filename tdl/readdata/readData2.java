package tdl.readdata;


import tdl.ToDoList;
import tdl.Declare;
import java.util.*;
import java.text.*;
import java.lang.*;
import java.io.*;

public class readData2 implements Serializable{
  //public static void main(String args[]) throws Exception
  /*
  {
  try
  {
    dataRead();
  }catch(Exception e)
    {
      System.out.println(e);
    }
  }
  */

  
  public static int dataRead(int i) throws Exception
  {
//    Declare obj = new Declare;
    int temp = i;
    String[] data = new String[1000];
    File file = new File("/Users/vamsikrishnamuppalaneni/Documents/javal/todolist.txt");
    boolean cont = true;
    //Scanner sc = new Scanner(file);
    try{
      Scanner sc = new Scanner(file);
      // input.close();
      //Scanner returns true if it has next line from the file
      while(sc.hasNext() )
      {
        //Stroring strint in array.
        data[temp] = sc.nextLine();
        Declare obj = new Declare();
        String[] strSplit = null;
        //Splitting string into words.
        strSplit = data[temp].split("\t++", 4);
			  //System.out.println(data[temp])
        //Setting Serial No., Description, Date, DueDate
        obj.setSrNo( Integer.parseInt(strSplit[0]) );
        obj.setDescription(strSplit[1]);
        obj.setDate(strSplit[2]);
        obj.setDueDate(strSplit[3]);
        System.out.println( obj.toString() );
        //System.out.println("Split: " + out);
        temp++;
      }
    }
    catch(IOException e){
      System.out.println(e);
    }
    /*catch(ClassNotFoundException e){
      System.out.println(e);
    }*/
    catch(Exception e){
      System.out.println(e);
    }
    return temp;
  }
}
