package tdl.readdata;


import tdl.ToDoList;
import tdl.Declare;
import java.util.*;
import java.text.*;
import java.lang.*;
import java.io.*;

public class readData implements Serializable{
  public static void main(String args[]) throws Exception
  {
    Declare readObj = new Declare();
    
    File file = new File("/Users/vamsikrishnamuppalaneni/Documents/javal/todolist.ser");
//    FileInputStream fin = new 
     // FileInputStream("/Users/vamsikrishnamuppalaneni/Documents/javal/todolist.ser");
    //List<obj> objectsList = new List<obj>();
    boolean cont = true;
    try{
      //FileInputStream fread = new FileInputStream(file);
      ObjectInputStream input = new ObjectInputStream(new FileInputStream(file) );

     List<Object> list = new ArrayList<>() ;
    /*  readObj = (Declare)input.readObject();
      list.add(readObj);
      System.out.println(readObj);*/
      //Object obj = null;
      try
      {
        for(;;)
        {
          Object object = input.readObject();
          list.add(object);
          System.out.println(object);
        }
      }
      catch(EOFException e)
      {
        System.out.println(e);
      }
    /*while( cont ){
      obj = input.readObject();
      if(obj instanceof Declare)
      {
         objectsList.add(obj);
         System.out.println(obj);
      }
      else
        {
           cont = false;
        }
      }
      */
      input.close();
     // fread.close();
    }catch(IOException e){
      System.out.println(e);
    }catch(ClassNotFoundException e){
      System.out.println(e);
    }catch(Exception e){
      System.out.println(e);
    }
  }
}
