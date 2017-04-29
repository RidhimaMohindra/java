import java.io.*;
class bubblesort{
public static void main(String args[])throws IOException{
InputStreamReader ins =new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ins);
int a[]=new int[150];
System.out.println("Enter number of Elemnts in an Array");
int n=Integer.parseInt(br.readLine());
for(int i=0;i<n;i++){
System.out.println("Enter the Element");
a[i]=Integer.parseInt(br.readLine());
}

for(int k=0;k<n-1;k++){
for(int j=0;j<n-k-1;j++){
if(a[j]>a[j+1]){
int temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}}
System.out.println("After Sorting the list becomes");
for(int i=0;i<n;i++){
System.out.println(a[i]);
}
}
}