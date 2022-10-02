import java.util.*;
public class pfactors{
  public static void main(String[] args){
    int num,num1,sum=0,n,i,sum2=0,digit;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();    
    int temp=n;
    List<Integer> value = new ArrayList<Integer>(); 
    List<Integer> value1 = new ArrayList<Integer>();
    while(n>1){
      //find prime factors for a given number
      //smallest prime number is 2
      for(i=2;i<=n;i++){
        if(n%i==0){
          n=n/i;
          value.add(i);    //add in the arraylist
        }  
      }
    }
    //to check duplicates in the arraylist
    for(int x: value){
      if(!value1.contains(x)){
        value1.add(x);      //add distinct values from arraylist in another arraylist
      }
    }
    //find sum of digits in arraylist
    for(int j=0;j<value1.size();j++){
      num=value1.get(j);
      while(num>0){
        num1=num%10;
        if(num1!=0){
          sum=sum+num1;
        }
        num=num/10;
      }
    }
    System.out.println("sum of digits of prime factors: "+sum);
    while(temp>0){  
      digit=temp%10;
      sum2=sum2+digit;
      temp=temp/10;
    }
    System.out.println("sum of digits of number entered: "+sum2);
    if(sum==sum2){
      System.out.println("number is hoax");
    }
    else{
      System.out.println("number is not hoax");
    }  
  }
}
