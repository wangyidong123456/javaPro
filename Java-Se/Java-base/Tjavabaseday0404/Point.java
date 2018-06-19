package Tjavabaseday0404;

public class Point {
    private int x;
	private int y;
	public Point(){
    	
    }
     public Point(int x,int y){
    	this.x=x;
    	this.y=y;
    }
     public int getX(){
    	 return this.x;
     }
     public int getY(){
    	 return this.y;
     }
     public void setX(int x){
    	 this.x=x;
     }
     public void setY(int y){
    	 this.y=y;
     }
     public double distance(){
    	 Point point0=new Point(0,0);
    	 return distance(point0);
     }
     public double distance(Point p){
    	 return Math.sqrt((this.x-p.x)*(this.x-p.x)+(this.y-p.y)*(this.y-p.y));
     }
     public boolean equals(Point p){
    	 return this.x==p.x&&this.y==p.y;
     }
}
