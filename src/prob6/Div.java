package prob6;

public class Div extends Calculate{
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public int calculate() {
		return a / b;
	}

}
