public class Calculator
{
 int multiply(int num1, int num2)
 {
  return num1*num2;
 }
 int addition(int num1, int num2)
 {
  return num1+num2;
 }
 int subtration(int num1, int num2)
 {
  return num1-num2;
 }
 int division(int num1, int num2)
 {
  return num1/num2;
 }

public static void main(String args[])
{int result, num1,num2;
String op;
 Calculator s1=new Calculator();
 //System.out.println("Enter the integers:");
 num1=Integer.parseInt(args[0]);
 num2=Integer.parseInt(args[1]);
 //System.out.println("Enter the operatiom:");
 //op=Character.parseChar(args[2]);
op=args[2];
  System.out.println(op);
 if(op=="*")
 {
  result=s1.multiply(num1,num2);
  System.out.println(result);
 }
 else if(op.equals("+"))
 {
  result=s1.addition(num1,num2);
  System.out.println(result);
 }
 else if(op=="-")
 {
  result=s1.subtration(num1,num2);
  System.out.println(result);
 }
 else if(op=="/")
 {
  result=s1.division(num1,num2);
  System.out.println(result);
 }
 else
 {
  System.out.println("Invalid Entries");
 }
}


 }