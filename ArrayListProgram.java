import java.util.ArrayList;


public class ArrayListProgram {

	
	public static void main(String[] args) {
		
		  ArrayList<String> obj = new ArrayList<String>();

		  obj.add("Ajeet");
		 // obj.add("Harry");
		  obj.add("Chaitanya");
		  
		  obj.add("Anuj");
		  obj.add("Ankita");
		  //obj.add("kirti");
		  obj.add("shishirabh");
		  obj.add("urvasi");
		  obj.add("shaleen");
         System.out.println("Adding the code to Master");

		  System.out.println("Currently the array list has following elements:"+obj);
		  
		  obj.add(0, "Rahul");
		  obj.add(1, "Justin");
          System.out.println("After adding the element in  first and second position to the ArrayList: " +obj);
          
          obj.add(3,"Sanjeet");
          System.out.println("After adding the element in Third position to the Arraylist: " +obj);
          obj.add(8,"Jyoti");
          System.out.println("Editing the element in the last of the Arraylist: " +obj);
          
		  obj.remove("Chaitanya");
		  obj.remove("Harry");
		  obj.remove("Sanjeet");
		 // obj.remove("Jyoti");
		  System.out.println("Current array list is:"+obj);

		  
		  obj.remove(5);

		  System.out.println("Current array list is:"+obj);
	   }
	

	}


