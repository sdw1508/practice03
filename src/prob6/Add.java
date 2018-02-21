package prob6;

public class Add extends Calculate{
	public void setValue(int a, int b) {
		super.a = a;
		this.b = b;
	}

	@Override
	public int calculate() {
		// TODO Auto-generated method stub
		return a+b;
	}



}
