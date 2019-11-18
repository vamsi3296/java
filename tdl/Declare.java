package tdl;
import java.io.*;
public class Declare implements Serializable
{
  private String description;
  private int srNo;
  private String createdOn;
  private String dueDate;

  public void setSrNo(int i)
  {
    this.srNo = i;
  }
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

  public int getSrNo()
  {
    return srNo;
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
    return srNo + "\t" + description + "\t" + 
      createdOn + "\t\t" + dueDate;
  }
}
