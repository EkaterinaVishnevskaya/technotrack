public class PalindromChecker {

    //исходная строка
    private String original_str;

    //очищение строки от пробелов и знаков препинания
    private String cleanString() {
         return original_str.replaceAll("[,;:.!?\\s]+", "").toLowerCase();
    }

    //проверка, является ли строка палиндромом
    public boolean isPalindrom() {
        String cleaned_str = cleanString();
        String reversed_str = new StringBuilder(cleaned_str).reverse().toString();
        return (cleaned_str.equals(reversed_str));
    }

    //конструктор по строке
    public PalindromChecker(String str) {
        this.original_str = str;
    }
}
