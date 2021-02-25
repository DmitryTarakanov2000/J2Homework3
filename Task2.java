public class Task2 {
public static void main(String[] args) {
    TelephoneDirectory telephoneDirectory = new TelephoneDirectory();

telephoneDirectory.add("Петров","123456");
    telephoneDirectory.add("Иванов","987654");
    telephoneDirectory.add("Петров","234567");
    telephoneDirectory.add("Иванов","741852");
    telephoneDirectory.add("Авдеев","951159");
    telephoneDirectory.add("Стулов","963147");
    telephoneDirectory.add("Столов","843597");
    telephoneDirectory.add("Петров","968574");

    System.out.println(telephoneDirectory.get("Иванов"));
    System.out.println(telephoneDirectory.get("Петров"));
    System.out.println(telephoneDirectory.get("Авдеев"));






    }
}
