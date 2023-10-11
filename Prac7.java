class Practical1{
	public static void main(String[] args){
		int sellingPrice=1000;
		int costPrice=1000;
		
		if(sellingPrice>costPrice){
			System.out.println("Profit of "+(sellingPrice-costPrice));
		}else if(sellingPrice<costPrice){
			System.out.println("Profit of "+(costPrice-sellingPrice));
		}else{
			System.out.println("No profit or loss");
		}
	}
}
