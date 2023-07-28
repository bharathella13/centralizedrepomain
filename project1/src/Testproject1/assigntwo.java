package Testproject1;

public class assigntwo {	
public int sum(int a,int b)
{
	int c;
	c=a+b;
	return c;
}
public int sub(int a1,int b1)
{
	int c1;
	c1=a1-b1;
	return c1;
}
public int multi(int a2,int b2)
{
	int c2;
	c2=a2*b2;
	return c2;
	}
public void div(int a3,int b3)
{
int c3;
c3=a3/b3;
System.out.println("Result of ((((10+2)+2)-2)/2)="+c3);
}
public static void main(String[] args) {
	assigntwo calc=new assigntwo();
	int sum1=calc.sum(10, 2);
	int sum2=calc.sum(sum1, 2);
	int sub=calc.sub(sum2, 2);
	int multi=calc.multi(sub, 2);
	calc.div(multi, 2);
	
}
}

