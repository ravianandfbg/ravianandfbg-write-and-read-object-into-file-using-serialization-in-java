import java.io.*;
class testserial implements Serializable
{
public int Srollno;
public String Sname;

public testserial(int Srollno,String Sname)
{
this.Srollno=Srollno;
this.Sname=Sname;
}
}
 class testser
{
public static void main(String[] args) throws Exception
{
//serialize();
deserialize();
}
public static void serialize() throws Exception
{
testserial ts=new testserial(100,"Shourya");
FileOutputStream fos=new FileOutputStream("D:\\Serial.ser");
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(ts);
oos.close();
System.out.println("Success....");
}

public static void deserialize() throws Exception
{
FileInputStream fis=new FileInputStream("D:\\Serial.ser");
ObjectInputStream ois=new ObjectInputStream(fis);
testserial tsd=(testserial)ois.readObject();
ois.close();

System.out.println("Object has been decentralised");
System.out.println("a= "+tsd.Srollno);
System.out.println("b= "+tsd.Sname);
System.out.println("Success....");
}
}