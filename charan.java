class Demo
{
public static void main(String args[])
{
int arr[]={10,20,30,40};
int a=Integer.parseInt(arg[0]);
try
{
System.out.println(arr[a]/arr[a+1]);
}
catch(ArithmeticException e)
{
System.out.println(e);
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e);
}
catch(RuntimeException e)
{
System.out.println(e);
}
}
}
