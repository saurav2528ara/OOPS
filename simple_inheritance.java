 class student
 {
 	int roll,marks;
 	String name;
 	void input()
 	{
 		System.out.print("Enter roll and marks: ");
 	}
 }
 class trial extends student
 {
 	void disp()
 	{
 		roll = 9;name= "Saurav"; marks= 77;
 		System.out.print(roll+" "+name+" "+marks);
 	}
 	public static void main(String[] args) {
 		trial in = new trial();
 		in.input(); in.disp();
 	}

 }