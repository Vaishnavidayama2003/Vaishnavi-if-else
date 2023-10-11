class Practical1{
	public static void main(String[] args){
		int num1=1;
		int num2=2;
		int num3=1;
		
		if(num1>num2 && num1>num3){
			System.out.println(num1+" is the maximum between 1,2 and 3");
		}else if(num2>num1 && num2>num3){
			System.out.println(num2+" is the maximum between 1,2 and 3");
		}else if(num3>num1 && num3>num2){
			System.out.println(num3+" is the maximum between 1,2 and 3");
		}else if(num1>num2 && num1==num3){
			System.out.println(num1+" is greater than "+num2+" and equal to "+num3);
		}else if(num2>num3 && num2==num1){
			System.out.println(num2+" is greater than "+num3+" and equal to "+num1);
		}else if(num3>num1 && num3==num2){
			System.out.println(num3+" is greater than "+num1+" and equal to "+num2);
		}else{
			System.out.println("All numbers are equal");
		}
	}
}
