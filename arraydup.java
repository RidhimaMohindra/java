//to remove duplicate elements from arrays
import java.io.*;
import java.util.*;
class arraydup{
public static void main(String args[])throws IOException{
InputStreamReader ins=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ins);
int m=0,k;
System.out.println("Enter number of  elemnts in the array");
int n=Integer.parseInt(br.readLine());
int a[]=new int[n];
System.out.println("Enter the Elemnts of the array");
for(int i=0;i<n;i++){
System.out.println("Enter the Element");
a[i]=Integer.parseInt(br.readLine());
m=n;
}
for(int i=0;i<m;i++){
for(int j=0;j<m;j++){
if(i==j)
continue;
else if(a[i]==a[j]){
k=j;
m--;
while(k<m){
a[k]=a[k+1];
k++;
}
j=0;
}
}
}
System.out.println("After removing duplicate arrays ... list becomes");
for(int i=0;i<m;i++){
System.out.println("Element at "+i+" is "+a[i]);}
System.out.println("total elements removed are "+(n-m));
}
}




