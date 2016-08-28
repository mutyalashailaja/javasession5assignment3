package polymorphism;


public class area {
	public int area,area1;

	
public void area1(int l,int b){
	area=l*b;
	System.out.println("area of rectangle is" + area)
	;
	
}
public void area1(int s){
	area1=s*s;
	System.out.println("area of square is :" + area1);
}


public static void main(String[] args) {
	// TODO Auto-generated method stub
	area a1=new area();
	a1.area1(6,7);
	a1.area1(9);
	
	
	

}}
