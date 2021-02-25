import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TelephoneDirectory {

    private Map<String, List<String>> directory = new HashMap<>();
    private List<String> phonenumber;

    public void add(String surname, String phone_number) {
        if (directory.containsKey(surname)) {
            phonenumber = directory.get(surname);
            phonenumber.add(phone_number);
            directory.put(surname, phonenumber);
        } else {
            phonenumber = new ArrayList<>();
            phonenumber.add(phone_number);
            directory.put(surname, phonenumber);
        }
    }

    public List<String> get(String surname) {
        return directory.get(surname);
    }

}
