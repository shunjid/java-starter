package enhancedForLoop;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int[][] array = {
				                  {1,2,3,4},
				                  {5,6,7,8},
				                  {2,4,6,8}
		                };
		for (int rowGenerator[] : array)
		{
			for (int valueFromRowGenerator : rowGenerator)
			{
				sout(valueFromRowGenerator+" ");
			}
			sout("\n");
		}
	}
	
	public static void sout (Object anyObject) {
		System.out.print(anyObject);
	}

}
