package Array;

public class TestVarArgsEx1 {

public void add(int...data){
	int total=0;
	for(int i =0;i<data.length;i++){
		total =total +data[i];
	}System.out.println("total"+total);
}
	public static void main(String[] args) {
   TestVarArgsEx1 varargs =new TestVarArgsEx1();
	varargs.add(1,2,3,4,5,6,7,8,9,10);
	int[] values ={10,20,30,40,50};
	varargs.add(values);
	}
	

}
