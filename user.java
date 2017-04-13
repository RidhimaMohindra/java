import java.io.*;
class user{
public static void main(String args[])throws IOException{
InputStreamReader ins =new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(ins);
System.out.println("Enter you name");
String s=br.readLine();
System.out.println("hello "+s);
}}