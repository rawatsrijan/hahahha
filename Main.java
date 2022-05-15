import java.util.*;
class A
{
  void basicException ()
  {
     int b=0;
      int a=100/b;
System.out.println(a);
  }

  void handleException ()
  {//sensitibe code
      try {
     int b=0;
      int a=100/b;
System.out.println(a);
          
      } catch(Exception e) {
          System.out.println(e.getMessage());
          
      }
      System.out.println("done");

  }

  void multipleCatch ()
  
  {

  }
  void inputMismatchException ()
  {try{
      Scanner sc=new Scanner(System.in);
      System.out.println("enteer the number");
      int num=sc.nextInt();

  }
  catch(Exception e){
      System.out.println(e.getMessage());
      
  }
      System.out.println("done!");
  }
  
  void stackOverFlowError ()
  {

  }
  void indexOutOfBoundException ()
  {

  }
  void nullPointerException ()
  {

  }
  void useOfThrow ()
  {

  }
  void useOfThrowsFinally ()
  {

  }

}

public class Main
{
  public static void main (String[]args)
  {
 A obj=new A ();
 //obj.basicException();
 obj.inputMismatchException();
 
  }
}
