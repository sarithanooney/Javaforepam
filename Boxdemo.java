import java.util.*;
class Box
	{
		int length, breadth, height;
		Box(int l,int b,int h)
		{
			length=l;
			breadth=b;
			height=h;
		}
		public void display()
		{
			int volume=length*breadth*height;
			System.out.println("Volume of Box is"+volume);
		}
	}

class Boxdemo
{
	public static void main(String args[]){
		Box b=new Box(100,200,300);
		b.display();
	}
}

