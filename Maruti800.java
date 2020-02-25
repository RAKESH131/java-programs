class car{
public car()
{      
System.out.println("class car");
}
public void vehicletype()
{
System.out.println("vehicletype: car");
}
}
class Maruti extends car{
public Maruti()
{
System.out.println("Class Maruti");
}
public void brand()
{
System.out.println("Brand: Maruti");
}
public void speed()
{
System.out.println("max: 90kmph");
}
}
public class maruti800 extends Maruti{
public maruti800()
{
System.out.println("Maruti model: 800");
}
public void speed()
{
System.out.println("Max: 80kmph");
}
public static void main(String args[])
{
Maruti800 obj=new Maruti800();
obj.vehicletype();
obj.brand();
obj.speed();
}
} 
