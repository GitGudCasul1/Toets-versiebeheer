public class ArrayPrinter{
	public static void main(String[] args) {
		ArrayPrinter praktijk = new ArrayPrinter();
      		int[] array = new int[]{1, 2, 3, 4, 5};
		praktijk.printarray();		
	}
	private void printarray(){
		for(int i = 0; i < 5; i++){
			System.out.println(array[i])
		}
	}
}



