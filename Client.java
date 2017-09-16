
public class Client {
		int clientid;
		String clientname;
		String clientaddress;
		Client(int i,String n,String a){
			clientid=i;
			clientname=n;
			clientaddress=a;
		}
		void display(){
			System.out.println(clientid+" "+clientname+" "+clientaddress);
		}
		public static void main(String[] args){
			
			Client c1=new Client(101,"Rishabh","Pune");
			Client c2=new Client(102,"Mayur","Pune");
			c1.display();
			c2.display();
		}
		
			
}
