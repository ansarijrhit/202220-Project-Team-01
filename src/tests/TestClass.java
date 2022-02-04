package tests;

public class TestClass {
	private String BadCase, camelCase;
	private int index = 0;
	
	public boolean returnTrue(double unused) {
		return true;
	}
	
	public void messageChain() {
		System.out.println(getOne());
		getOne();
	}
	
	public int getOne() {
		return 1;
	}
}
