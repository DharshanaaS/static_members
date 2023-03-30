package staticblock;
class A
{
    static int a=10,b=20;
    static
{
        System.out.print(a+"+"+b+"="+(a+b));
    }
}
public class StaticBlock 
{
    public static void main(String[] args) {
    A ob=new A();    
    }
    
}
