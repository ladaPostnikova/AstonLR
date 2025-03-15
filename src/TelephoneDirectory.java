import java.util.*;

public class TelephoneDirectory {
    private Map<String, List<String>> directory;

    public TelephoneDirectory(){
        directory = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        directory.computeIfAbsent(surname, k -> new ArrayList<>()).add(phoneNumber);
    }

    public List<String> get(String surname) {
        return directory.getOrDefault(surname, Collections.emptyList());
    }

}
