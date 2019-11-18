class Bicycle{
  public int gear;
  public int speed;

 //Constructor
 public Bicycle(int gear, int speed)
 {
   this.gear = gear;
   this.speed = speed;
 } 

 //methods
 public void applyBrake(int decrement)
 {
   speed -= decrement;
 }

 public void speedUp(int increment)
 {
   speed += increment;
 }

 public String toString()
 {
   return("No of gears are "+gear+"\n"+"Speed of Bicycle is "+speed);
 }
}

//derived class
class MountainBike extends Bicycle
{
  public int seatHeight;

  //subclass has one constructor
  public MountainBike(int gear, int speed, int startHeight)
  {
    //invoking base-class (Bicycle) constructor 
    super(gear, speed);
    seatHeight = startHeight;
  }

  public void setHeight(int newValue)
  {
    seatHeight = newValue;
  }
  @Override
  public String toString()
  {
    return (super.toString()+"\nseat height is "+seatHeight);
  }
}

public class todoList 
{
  public static void main(String args[])
  {
    MountainBike mb = new MountainBike(10, 20, 30);
    System.out.println(mb.toString());
  }
}
