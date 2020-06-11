import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class HastableSuplicateKeys {
public static void main(String[] args) {
	
	String string = new String("Hello");
	String string2 = string;
	
	System.err.println(string2);
	HashMap hashMap= new HashMap<>();
	
	Hashtable<String, String> hashtable = new Hashtable<>();
	hashtable.put("name", "shanu");
	
	Enumeration<String> key = hashtable.keys();
	int hash = key.hashCode();
	
	
	System.err.println(hashtable.get("name")+hash);
}
}
