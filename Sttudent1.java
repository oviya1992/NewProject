package Final;

public class Sttudent1 extends Thread{
	public void run() {
		for(int i=1;i<=10;i++)
		{
			try
			{
		    Thread.sleep(700);
		    
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println(i);
		
				
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sttudent1 s1=new Sttudent1();
		Sttudent1 s2=new  Sttudent1();
		s1.start();
		s1.start();
	}

}
