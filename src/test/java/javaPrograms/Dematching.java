package javaPrograms;

public class Dematching {

	public static void main(String[] args) {
		Dematching obj = new Dematching();
		obj.dematchingChar("Naga", "Samy");

	}
	
	public void dematchingChar(String str1,String str2)
	{
		String str3="";
		for(int i=0;i<str1.length();i++)
		{
				if(str2.contains(str1.charAt(i)+""))
				{
					if(!str3.contains(str1.charAt(i)+""))
					{
					str3=str3+str1.charAt(i);
					}
				}			
		}
		for(int i=0;i<str3.length();i++)
		{
			System.out.println("First String ="+str1.replaceAll(str3.charAt(i)+"",""));
			System.out.println("Second String ="+str2.replaceAll(str3.charAt(i)+"",""));
		}
		
	}
}
