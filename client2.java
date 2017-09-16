
public class client2{
int id;
String name;
String address;

void display(){System.out.println(id+" "+name+" "+address);}

public static void main(String args[]){
client2 s1=new client2();
client2 s2=new client2();
s1.display();
s2.display();
}
}