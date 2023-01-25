import java.util.Scanner;

class a1{
public static void main(String [] args){

Scanner sc = new Scanner(System.in);

int a = sc.nextInt();
int[] b = new int[a];
int sum = 0;
int prod = 1;

for(int i=0;i<b.length;i++)
{
	b[i]=sc.nextInt();
}

for(int j=0;j<b.length;j++)
{
	sum = sum + b[j];
	prod = prod * b[j];
}

System.out.println(sum);
System.out.println(prod);
	  
}}