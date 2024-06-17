public class Test {
	private int id;

	public Test() {
	}

	public int getId() {
	  return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		test.setId(10);
		System.out.println(test.getId());
	}
}


