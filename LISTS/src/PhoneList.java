import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class PhoneList {
	 private Map<String, List<String>> phoneList;

	    public PhoneList() {
	        phoneList = new HashMap<>();
	    }

	    public void add(String lastName, String phoneNumber) {  
	        if (phoneList.containsKey(lastName)) {     // когда фамилия существует, добавляем к ней номер
	        	phoneList.get(lastName).add(phoneNumber);
	        } else {                                  // когда фамилии нет в списке, создаём пару
	            List<String> numbers = new ArrayList<>();
	            numbers.add(phoneNumber);
	            phoneList.put(lastName, numbers);
	        }
	    }

	    public List<String> get(String lastName) {         // получает список строк по фамилии
	    	List<String> numbers = phoneList.get(lastName);
	    	return numbers != null ? numbers : new ArrayList<>();
	    }
}
