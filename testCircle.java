class circle{
    public float radius;
	private float Area;
	private float Perimeter;
	public void Calculate_Area(){
		Area=2*3.14f*radius;
	}
	public void Calculate_Perimeter(){
		Perimeter=2*3.14f*radius;
	}
	public void Display(){
		System.out.println("Radius="+radius);
		System.out.println("Area="+Area);
		System.out.println("Perimeter="+Perimeter);
	}
}
class testCircle{
	public static void main(String arg[]){
		circle c1=null,c2,c3;
		System.out.println(c1);
		        c1=new circle();
				c2=new circle();
				c3=new circle();
			System.out.println(c1);
			c1.radius=2.0f;
			c1.Calculate_Area();
            c1.Calculate_Perimeter();
            c1.Display();
            c2.radius=3.0f;
			c2.Calculate_Area();
            c2.Calculate_Perimeter();
            c2.Display();
            c3.radius=4.0f;
			c3.Calculate_Area();
            c3.Calculate_Perimeter();
            c3.Display();			
	}
}
