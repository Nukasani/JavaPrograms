package Stringclass;


public class Duplicatewordsinstring 
{
	public static void main(String[] args) 
	{
	   String x="hi harsha hello harsha Hii";
	   String x1=x.toLowerCase();
	   String[] x2=x1.split(" ");
	   
	   int count,i,j;
	   
	   for(i=0;i<x2.length;i++)
	   {
		   count=1;
		   for(j=i+1;j<x2.length;j++)
		   {
			   if(x2[i].equals(x2[j]))
			   {
				   count++;
				   x2[j]="0";
			   }			   
		   }
		   System.out.println(x2[i]);   
	   }
	}
}
