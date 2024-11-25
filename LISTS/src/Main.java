import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main (String[] args) {
		ArrayList<String> arrayList= new ArrayList<>();
		arrayList.add("lol");
		arrayList.add("kek");
		arrayList.add("meme");
		arrayList.add("xoxo");
		arrayList.add("kek");
		arrayList.add("kek");
		arrayList.add("meme");
		arrayList.add("lol");
		arrayList.add("lol");
		arrayList.add("meme");
		System.out.println("Лист: "+arrayList);             // Вывод arraylist-а
		Map<String, Integer> wordCounts = new HashMap<>(); // Вывод кол-ва повторяющихся слов
	    for (String word : arrayList) {
	        wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
	    }
	    System.out.println("Кол-во повторений: " + wordCounts);
		Set<String> set = new HashSet<>(arrayList);
		System.out.println("Уникальные слова: " + set);  // Вывод arraylist-а с уникальными словами
		
		PhoneList pb = new PhoneList();  // объект класса, который хранит добавленные пары
	    pb.add("Александрович", "8 (825) 493-41-64");
	    pb.add("Астафьева", "8 (469) 886-16-68");
	    pb.add("Игоревна", "8 (208) 655-42-96"); 
	    pb.add("Сидоров", "8 (614) 561-90-08");
	    pb.add("Астафьева", "8 (371) 620-52-81");
	    
	    System.out.println("\nНомера для Александровича: " + pb.get("Александрович"));
	    System.out.println("Номера для Астафьевой: " + pb.get("Астафьева"));
	    System.out.println("Номера для Игоревны: " + pb.get("Игоревна"));
	    System.out.println("Номера для Абрамовича: " + pb.get("Абрамович")); 
	}
}
