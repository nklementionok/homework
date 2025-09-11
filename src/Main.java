import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Main {

    public static class PhoneDirectory {
        private final Map<String, List<String>> data = new HashMap<>();


        public void add(String lastName, String phoneNumber) {
            List<String> numbers = data.computeIfAbsent(lastName, k -> new ArrayList<>());
            numbers.add(phoneNumber);
        }

        public List<String> get(String lastName) {
            List<String> numbers = data.get(lastName);
            return numbers == null ? new ArrayList<>() : new ArrayList<>(numbers);
        }}


        public static void main(String[] args) {
            PhoneDirectory book = new PhoneDirectory();
            book.add("Иванов", "+11111");
            book.add("Петров", "+22222");
            book.add("Иванов", "+33333");

            System.out.println("Иванов: " + book.get("Иванов"));
            System.out.println("Петров: " + book.get("Петров"));
            System.out.println("Клементионок: " + book.get("Клементионок"));

            }
    }
