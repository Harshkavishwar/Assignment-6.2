import com.acad.primeno.Notprime;
import com.acad.primeno.Prime;



public class TypetwoThread 
{
	
	public static void main(String[] args)
	{			 
			Prime p = new Prime();
			 p.start();	
			 Notprime p1= new Notprime();
			 p1.start();
			 
		}
	}

