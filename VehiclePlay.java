abstract class vehicle
{

  String name;
  int wheels;
 String color;
 String model;
String vendor;
int speed;
 
vehicle()
 {
	  
}
vehicle(String n,int wh,String col,String mod, String ven ,int sp)
{
   name=n;
   wheels=wh;
   color=col;
   model=mod;
 vendor=ven;
speed=sp;
}
	
void display()
{
 System.out.println( " name of the vehicle : \t\t\t" + name);
System.out.println( " number of wheels in the vehicle : \t " + wheels);
System.out.println( " color of the vehicle : \t\t" + color);
System.out.println( "  model of the vehicle : \t \t" + model);
System.out.println( "  vendor of the vehicle : \t \t" + vendor);
System.out.println( "  speed of the vehicle in km: \t \t" + speed);
}

abstract void start();
}



class  Car extends  vehicle
 {

String remote;
Car()
{

}

Car(String n,int wh,String col,String mod, String ven, int sp,String rem)
{

  super(n,wh,col,mod,ven,sp);
  remote=rem;
}

void display()
{

super.display();
System.out.println( "  do car consist of remote key ? \t" +remote );

}
void start()
{

System.out.println(" To make an engine start it must be turned at some speed");

}
}


class bike extends vehicle
{

String airbags;
 bike()
{

}

bike(  String n,int wh,String col,String mod, String ven, int sp ,String ab)
{

super(n,wh,col,mod,ven,sp);
airbags=ab;

}

void display()
{

super.display();
System.out.println(" do bike consiste of airbags ? \t\t" +airbags);

}

void start()
{

System.out.println(" bike has kick start mechnanism ");

}
}

class VehiclePlay
{

public static void main(String [] args)
{

Car c1=new Car(" Audi " , 4 ,"black"," Audi Q5", "Audi fourms" ,62, "yes");
System.out.println("\n\n car details");
System.out.println("***************************************************************");

c1.display();
c1.start();

bike b1=new bike("Honda Gold Wing", 2 ," grey ", "Honda Gold Wing GL-1800" ," honda goldwing  " ,220,"yes");
System.out.println("\n\n bike  details");
System.out.println("***************************************************************");

b1.display();
b1.start();
}
}











    
