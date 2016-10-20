class Sbuilder{
	public static void main(String args[]) throws Exception{
		StringBuilder sbd=new StringBuilder("Welcome to Java");
		StringBuilder sbd1=new StringBuilder();
		while(true){
			char c=sbd.charAt(0);
			
			System.out.print("\r"+sbd);
			Thread.sleep(1000);
		}
	}
}