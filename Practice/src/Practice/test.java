package Practice;


public class test {
	
	public static void main(String args[])
	{
		String name = "Harry Potter";
		
		System.out.println(name);
		System.out.println("my name is : " + name);
		
		test t =  new test();
		t.add();
		t.sub();
	}
	
	public void add()
	{
		int a=10;
		
		int b=20;
		
		int c=a+b;
		
		System.out.println("Addition of a and b is : "+c);
	}

	public void sub()
	{
		int a=20;
		
		int b=10;
		
		int c=a-b;
		
		System.out.println("Substraction of a and b is : "+c);
	}


}
