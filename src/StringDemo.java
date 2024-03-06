
public class StringDemo {

	public static void main(String[] args) {
		
		String s = "Dakshu Mule";
		String s1 = "Dakshu";
		
		//System.out.println(s);
		//String[] newstring= s.split("u");
		//System.out.println(newstring[0]);
		//System.out.println(newstring[1]);
		//System.out.println(newstring[1].trim());
		//System.out.println(newstring[2]);
		
		for(int i=s.length()-1;i>=0; i--)
		{
			System.out.println(s.charAt(i));
			
		}


		
	}

}
