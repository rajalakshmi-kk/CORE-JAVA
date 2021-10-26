import java.awt.Point;
public class Modify {

	public static void main(String[] args) {
		Point p1 =new Point();
		p1.x=1;
		p1.y=2;
		System.out.println("x="+p1.x+" "+"and"+" "+"y="+p1.y);
		change(p1);
		System.out.println("x="+p1.x+" "+"and"+" "+"y="+p1.y);
	}
	
	public static void change(Point p) {
		p.x=3;
		p.y=4;
	}
}
