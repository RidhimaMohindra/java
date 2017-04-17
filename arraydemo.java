import java.io.*;
import java.util.*;
class arraydemo{
public static void main(String args[])throws IOException{
InputStreamReader ins =new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ins);
int arr[] =new int[15];
System.out.println("Enter the elemnts of the array");
for(int i=0;i<5;i++){
System.out.println("Enter the Element");
arr[i]=Integer.parseInt(br.readLine());
}
System.out.println("Elments of the array are");
for(int j=0;j<5;j++){
System.out.println(arr[j]);
}
}
}