public class PalindromChecker {

    //исходная строка
    String original_str;

    //очищение строки от пробелов и знаков препинания
    String cleanString() {
        String[] words = original_str.split("[,;:.!?\\s]+");
        String clean_str = "";
        for (int i=0; i<words.length; i++) {
            clean_str+=words[i];
        }
        clean_str.toLowerCase();
        return clean_str;
    }

    //проверка, яявляется ли строка палиндромом
    boolean isPalindrom() {
        String cleaned_str = cleanString();
        String reversed_str = new StringBuilder(cleaned_str).reverse().toString();
        return cleaned_str==reversed_str;
    }

    //конструктор по строке
    public PalindromChecker(String str) {
        this.original_str = str;
    }
}
