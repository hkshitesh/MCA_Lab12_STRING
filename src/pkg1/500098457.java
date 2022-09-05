class 500098457
{
    private int a =10;//memory will allocated during sun time
    int b =20;


int Sum()// static int Sum() will give an error because this will get assigned during complile time....(static and prrivate cannnot be accesed together so make vhanges to private to static.)
{
    return a+b;
}
 public static void main(String[] args)//public static void main (String args[])
  {
    acess ob=new acess();
    System.out.println (ob.Sum());
    System.out.println (ob.a+ob.b);
    ob.b=5;
    System.out.println (ob.Sum());
    ob.a=2;
    System.out.println (ob.Sum());



    
}}