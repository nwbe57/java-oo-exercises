package studio1;

public class Rectangle {

	private int length;
	private int width;
	
	
	public Rectangle(int length, int width){
		
		this.length = length;
		this.width = width;
		
	}
	
	public int getLength(){
		return this.length;
	}
	
	public int getWidth(){
		return this.width;
	}
	
	public int getArea(){
		
		int area = getWidth() * getLength();
		return area;
		
	}
	
	public int getPerimeter(){
		
		int perimeter = (2*getLength()) + (2*getWidth());
		return perimeter;
		
	}
	
	public boolean isSmaller(Rectangle rec){
		
		if ((getArea()) > (rec.getArea())){
			return false;
		}
		else{
			return true;
		}
		
	}
	
	public boolean isSquare(){
		
		if (getLength() == getWidth()){
			return true;
		}
		else{
			return false;
		}
		
	}
	
	
	
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(10, 8);
		Rectangle rect2 = new Rectangle(8, 6);
		Rectangle square = new Rectangle(4, 4);
		
		System.out.println(rect1.isSmaller(rect2));
		System.out.println(rect1.isSquare());
		System.out.println(square.isSquare());
		System.out.println(rect1.getArea());
		System.out.println(rect2.getPerimeter());
		
	}

}
