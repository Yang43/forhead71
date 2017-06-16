package exercise_1;

class calculator {
	int a = 1;
	int b = 2;

	public int plus() {
		return a + b;
	}

	public int subtract() {
		return a - b;
	}

	public int multiple() {
		return a * b;
	}

	public double divide(int a,int b) {
		if( b!=0){
			return (double)a/(double)b;
		}
		return b;
	}
}

public class Testing_1 {
	public static void main(String[] args) {

		calculator test = new calculator();
		System.out.println(test.plus());
		System.out.println(test.subtract());
		System.out.println(test.multiple());
		System.out.println(test.divide(1,2));

	}
}