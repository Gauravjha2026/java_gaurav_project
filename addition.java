package johan2;

public class addition {
	void sum(int a, int b) {
		int c = a+b;
		System.out.println("the add is two num ->"+c);
	}
	
	void sum(int a, int b,int e) {
		int c = a+b+e;
		System.out.println("the add is two num ->"+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addition obj = new
		addition();obj.sum(30,90);
		obj.sum(45,80,22);

	}

}
