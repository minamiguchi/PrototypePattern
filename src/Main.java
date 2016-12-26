public class Main {

	public static void main(String[] args) {
		Facotry factory = new Facotry();
		Printer printer;

		printer = factory.create("a");
		printer.printMessage();
		printer = factory.create("b");
		printer.printMessage();
		printer = factory.create("c");
		printer.printMessage();
	}
}
