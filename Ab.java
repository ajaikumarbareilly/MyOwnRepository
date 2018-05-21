abstract class Showable
{
 public abstract void invoke();
}
class Ab extends Showable
{
 public void invoke()
 {
  System.out.println("Ok, I am implemented now man! Don't worry about it.");
  System.out.println("I have changed this file in github.");
 }
 public static void main(String arr[])
 {
  Ab obj = new Ab();
  Invoker.show(obj);
 }
}
