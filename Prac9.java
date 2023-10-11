class Practical1{
	public static void main(String[] args){
		int a=3;
		int b=4;
		int c=5;
		
		if(a*a==b*b+c*c || b*b==a*a+c*c || c*c==a*a+b*b){
			System.out.println("It is a pythagorean triplet");
		}else{
			System.out.println("It is not a pythagorean triplet");
		}
	}
}
