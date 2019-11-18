import java.io.*;
class SavingData{
  public static void main(String args[])
  {
    try
    {
      //creating file
      FileWriter fwrite = new FileWriter("testfile.txt");
      BufferedWriter output = new BufferedWriter(fwrite);
      output.write("Write successful");
      //close the output stream
      output.close();
    }catch (Exception e){ //catching exception if any
      System.err.println("error: " + e.getMessage());
    }
  }
}
