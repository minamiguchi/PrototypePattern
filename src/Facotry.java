import java.util.HashMap;
import java.util.Map;

public class Facotry {
	Map<String, Printer> protoMap;

	public Facotry() {
		protoMap = new HashMap<String, Printer>();
		protoMap.put("a", new Printer("a"));
		protoMap.put("b", new Printer("b"));
		protoMap.put("c", new Printer("c"));
	}

	public Printer create(String type) {
		return protoMap.get(type).clone();
	}
}
