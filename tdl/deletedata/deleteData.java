package tdl.deletedata;

import java.io.*;
import java.lang.*;
import java.lang.reflect.*;
import java.util.regex.*;

public class deleteData {
  public static void deleteD(String i)
  {
    try{
      File file = new File("todolist.txt");
      if ( !file.isFile() )
      {
        System.out.println("File doesn't exist.");
      }

    //Constructing a new File.
    File tempFile = new File(file.getAbsolutePath() + ".tmp");
    BufferedReader br = new BufferedReader( new FileReader("todolist.txt") );
    PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
        String line = null;

        //Reading lines from the file.
        while ( (line = br.readLine() ) != null) 
        {
          String temp = i; //setting the index of the data to be deleted.
          //Matching index number with regex.
          Matcher m = Pattern.compile("^"+temp).matcher(line);
          if (!m.find())//if true
          {
            pw.println(line);
            pw.flush();
          }
        }
        pw.close();
        br.close();
        
        //Delete the original file
        if ( !file.delete() )
        {
          System.out.println("Could not delete the original file.");
        }

        //rename the temp file to original
        if ( !tempFile.renameTo(file) )
        {
          System.out.println("Could not rename the temp file.");
        }

    }catch(FileNotFoundException e)
    {
      System.out.println(e);
    }catch(IOException e)
    {
      System.out.println(e);
    }
  }
}
