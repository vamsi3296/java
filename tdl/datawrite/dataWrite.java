package tdl.datawrite;

import java.lang.*;
import java.util.*;
import java.io.*;

public class dataWrite 
{
  public static void writeD(String obj) throws IOException
  {
    try
    {
      FileWriter file = new FileWriter("todolist.txt", true);
      PrintWriter out = new PrintWriter(file);
      out.println(obj);
      out.close();
    }
    catch(IOException e)
    {
      e.printStackTrace();
    }
  }
}
