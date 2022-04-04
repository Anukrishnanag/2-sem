class cpu
{
double prize;
class processor
{
double core;
String manu;
double getcatch()
{
return 4.3;
}
}
protected class ram
{
double memory;
String maun;
double clockspeed()
{
return 5.4;
}
}
}
public class cpudetails
{
public static void main(String[] args)
{
cpu obj1=new cpu();
cpu.processor obj2=obj1.new processor();
cpu.ram obj3=obj1.new ram();
System.out.println("processor catch is " + obj2.getcatch());
System.out.println("clock speed  is " +obj3.clockspeed());
}
}





