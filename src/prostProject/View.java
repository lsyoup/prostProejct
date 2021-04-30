package prostProject;

public class View {
	
	int length;
	int arr[];
	
	void printf(int arr[])
	{
		this.arr=arr;
		this.length = arr.length;
		
		System.out.print("printf(intArr) : ");
		for(int i=0;i<length;i++)
		{
			System.out.print(arr[i]+", ");			
			
		}
		System.out.println("");
		
	}
	
	void printf(char arr[])
	{
		
		this.length = arr.length;
		
		System.out.print("printf(charArr) : ");
		for(int i=0;i<length;i++)
		{
			System.out.print(arr[i]+", ");			
			
		}
		System.out.println("");
		
	}	
	
	void printf(String arr[])
	{
		
		this.length = arr.length;
		
		System.out.print("printf(StringArr) : ");
		for(int i=0;i<length;i++)
		{
			System.out.print(arr[i]+", ");			
			
		}
		System.out.println("");
		
	}
	
	
	void printf(int n)
	{
		System.out.println("printf(int) : "+n);
	}
	
	void printf(String str)
	{
		System.out.println("printf(String) : "+str);
	}
	void printf(char str)
	{
		System.out.println("printf(char) : "+str);
	}
	

	void printf(int arr[], String desc)
	{
		this.arr=arr;
		this.length = arr.length;
		
		System.out.print("printf("+desc+") : ");
		for(int i=0;i<length;i++)
		{
			System.out.print(arr[i]+", ");			
			
		}
		System.out.println("");
		
	}
	
	void printf(char arr[], String desc)
	{
		
		this.length = arr.length;
		
		System.out.print("printf("+desc+") : ");
		for(int i=0;i<length;i++)
		{
			System.out.print(arr[i]+", ");			
			
		}
		System.out.println("");
		
	}	
	
	void printf(String arr[],String desc)
	{
		
		this.length = arr.length;
		
		System.out.print("printf("+desc+") : ");
		for(int i=0;i<length;i++)
		{
			System.out.print(arr[i]+", ");			
			
		}
		System.out.println("");
		
	}
	
	
	void printf(int n,String desc)
	{
		System.out.println("printf("+desc+") : "+n);
	}
	
	void printf(String str,String desc)
	{
		System.out.println("printf("+desc+") : "+str);
	}
	void printf(char str,String desc)
	{
		System.out.println("printf("+desc+") : "+str);
	}
	
}
