class Practical1{
	public static void main(String[] args){
		int marks=80;		//out of 100
		
		if(marks<=100 && marks>=80){
			System.out.println("Grade A");
		}else if(marks<80 && marks>=60){
			System.out.println("Grade B");
		}else if(marks<60 && marks>=40){
			System.out.println("Grade C");
		}else if(marks<40){
			System.out.println("Fail");
		}else{
			System.out.println("Invalid");
		}
	}
}
