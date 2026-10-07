import java.util.Scanner;
class PowerOfTwo{
public static void main(String args[]){
Scanner Sc=new Scanner(System.in);
int n;
System.out.print("Enter a positive integer:");
n=Sc.nextInt();
if(n>0&&(n&(n-1))==0){
System.out.println(n+"is a power of 2");
}
else{
System.out.println(n+"is not a power of 2");
  }
      }
 }