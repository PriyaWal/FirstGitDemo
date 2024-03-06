import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

ArrayList<String> arrlist = new ArrayList<String>();
arrlist.add("Daksh");
arrlist.add("Pramod");
arrlist.add("Priyanka");
arrlist.add("Mule");	

System.out.println(arrlist.contains("Pramod"));

/*for(int i=0; i<arrlist.size(); i++)
{
	System.out.println(arrlist.get(i));
    // i++;

}*/

}
}
