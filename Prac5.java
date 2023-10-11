class Practical1{
	public static void main(String[] args){
		int month=-6;
		
		if(month<=0 || month>12){
			System.out.println("Invalid month");
		}else if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
			System.out.println(month+" has 31 days");
		}else{
			System.out.println(month+" has 30 days");
		}
		
		
	}
}
