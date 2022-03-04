class student{
    String SName;
	int Rollno;
	int sem;
	char sec;
	student(){
		SName="ABC";
		Rollno=1;
		sem=5;
		sec='A';
	}
	student(String SName,int rn,int sm,char se){
		this.SName=SName;
		Rollno=rn;
		sem=sm;
		sec=se;
	}
	
	void Display(){
	System.out.println("Student Name="+SName);
	System.out.println("Student Roll No="+Rollno);
	System.out.println("Student Sem="+sem);
	System.out.println("Student Sec="+sec);
	}
}
class testStudent{
	public static void main(String arg[]){
		student s1,s2;
		s1=new student();
		s1.Display();
		s2=new student("Amit",12,6,'B');
		s2.Display();
		
	}
}
