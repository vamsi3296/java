package tdl.updatedata;

import java.lang.*;
import java.io.*;
import java.util.*;
import java.text.*;
import tdl.Declare;

public class updateData{
  public static  void updateD(String srNo, String description, String dueDate)
  {
    try{
      File file = new File("todolist.txt");
      BufferedReader br = new BufferedReader(new FileReader(file));
      File tempFile = new File(file.getAbsolutePath() + ".tmp");
      BufferedReader tbr = new BufferedReader(new FileReader("todolist.txt"));
      PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
      if (!file.isFile() )
      {
        System.out.println("File doesn't exist.");
      }

      String line = null;
      while ( (line = br.readLine() ) != null)
      {
        //String[] data = new String[500];
        //data[temp] = line;
        Declare tableData = new Declare();
        String[] strSplit = null;
        strSplit = line.split("\t++", 4);
        tableData.setDescription(strSplit[1]);
        tableData.setDueDate(strSplit[3]);

        if (  strSplit[0].equals(srNo) )
        {
          //Splitting into words
          if ( description !=  "" && dueDate != "" )
          {
            line = line.replaceAll(tableData.getDescription(), description);
            line = line.replaceAll(tableData.getDueDate(), dueDate);
            pw.println(line);
            pw.flush();
          }
        }
        else
          pw.println(line);
      }
      pw.close();
      br.close();
      tbr.close();
      
      if ( !file.delete() )
      {
        System.out.println("Delete Unsuccessful");
      }

      if ( !tempFile.renameTo(file) )
      {
        System.out.println("Rename unsuccessful");
      }
  }catch(Exception e){
    System.out.println(e);
    }
  }
}
