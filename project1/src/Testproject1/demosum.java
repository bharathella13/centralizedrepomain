package Testproject1;

public class demosum {


public int sum(int a,int b)
{
	int c;
	c=a+b;
	System.out.println("sum="+c);
	return c;

}
public int sub(int e,int f)
{
	int d;
	d=e-f;
	System.out.println("sub="+d);
	return d;
}
public void multi(int x,int y)
{
	int z;
	z=x*y;
	System.out.println("multi="+z);
}
public static void main(String[] args) {
	demosum calc=new demosum();
	int sum=calc.sum(10,5);
	int sub=calc.sub(10, 4);
	calc.multi(sum, sub);
}
}
