import java.util.*;
class fact{
public static void main(String args[]){
// Scanner sc=new Scanner (System.in);
int n=4;
int fact=0;
for (int i=0;i<=n;i++){
if(n%i==0){
fact=fact+1;
}
System.out.print("NOOF factors " +fact);
}
}
}