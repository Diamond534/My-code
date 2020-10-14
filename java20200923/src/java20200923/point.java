package java20200923;

import java.awt.Point;

public class point {
	public int x;
	public int y;
}
	public void setPoint(){
		x=0;
		y=0;
	}
	public void setPoint(int x,int y) {
		this.x=x;
		this.y=y;
		
		
	}
	public double getDistance(point p1,point p2) {
		return Math.sqrt((p1.x-p2.x)*(p1.x-p2.x)+(p1.x-p2.x)*(p1.x-p2.x))
	}
	public double getDistance(Point p) {
		return Math.sqrt(p.x*p.x+p.y*p.y);
	}
	


