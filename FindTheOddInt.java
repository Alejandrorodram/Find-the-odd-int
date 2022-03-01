package findTheOddInt;

public class FindTheOddInt {

	public static void main(String[] args) {
		System.out.println(findOdd1(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
		System.out.println(findOdd1(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
		System.out.println(findOdd1(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));
		System.out.println(findOdd1(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
	}
	
	public static int findOdd1(int[] numberList) {
		int impar = 0;
	    for (int i = 0; i < numberList.length; i++) {
	    	impar ^= numberList[i];
	    }
	    return impar;		
	}
}
