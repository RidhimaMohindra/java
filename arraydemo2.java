//to find the biggest array element and its location
import java.io.*;
import java.util.*;
class arraydemo2{
public static void main(String args[])throws IOException{
int big=0,loc=0,n;
InputStreamReader ins=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ins);
System.out.println("Enter no of elements");
n=Integer.parseInt(br.readLine());
int a[]=new int[n];
System.out.println("enter the elements of array");

for(int i=0;i<n;i++){
System.out.println("Enter the element");

a[i]=Integer.parseInt(br.readLine());
}

for(int i=0;i<n;i++){
if(a[i]>big){
big=a[i];
loc=i;
}
}
System.out.println("The biggest Element of Array is "+big+" present at location "+(loc+1));

}
}