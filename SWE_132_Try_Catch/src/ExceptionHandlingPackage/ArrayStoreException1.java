package ExceptionHandlingPackage;

public class ArrayStoreException1 {

    public static void main(String[] args) {

        getArrayIndexOutOfBoundsException();
        getNegativeArraySizeException();
        getArrayStoreException();
    }

    private static void getArrayIndexOutOfBoundsException() {
        try {
            int[] m = new int[10];
            for (int x = 0; x < 15; ++x) {
                m[x] = x + 5;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
    }

    private static void getNegativeArraySizeException() {
        try {
            int[] y = new int[-9];

        } catch (NegativeArraySizeException e) {
            System.out.println("\n" + e.toString());
        }

    }
    
    private static void getArrayStoreException(){
        try {
            Object[] val = new Integer[4];
            val[0] = 5.8;
            System.out.println(val[0]);
        } catch (ArrayStoreException e) {
            System.out.println("\n" + e.toString());
        }

    }

}
