package Testproject1;

public class assignthree {
	
public int sum(int a,int b)
{
	int c=a+b;
	return c;
	}
public int div(int a1,int b1)
{
	int c1=a1/b1;
	return c1;
}
public int sub(int a2,int b2)
{
	int c2=a2-b2;
	return c2;
}
public void multi(int a3,int b3)
{
	int c3=a3*b3;
	System.out.println("Result of ((((10/2)-2)+2)-2)*2)="+c3);
}
public static void main(String[] args) {
	
assignthree calc3=new assignthree();
int div1=calc3.div(10, 2);
int sub1=calc3.sub(div1, 2);
int add=calc3.sum(sub1, 2);
int sub2=calc3.sub(add, 2);
calc3.multi(sub2, 2);

}
}