public class Printer implements Cloneable {
	String str;

	public Printer(String str) {
		this.str = str;
	}

	public void printMessage() {
		System.out.println(this);
	}

	@Override
	public Printer clone() {
		Printer cloned = null;
		try {
			cloned = (Printer) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}
}
