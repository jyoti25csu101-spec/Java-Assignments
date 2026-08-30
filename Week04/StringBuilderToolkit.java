public class StringBuilderToolkit {

    static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    static String repeat(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++)
            sb.append(s);
        return sb.toString();
    }

    static String joinWords(String[] a, String sep) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            if (i > 0) sb.append(sep);
            sb.append(a[i]);
        }
        return sb.toString();
    }

    static String removeCharacterAt(String s, int i) {
        StringBuilder sb = new StringBuilder(s);
        sb.deleteCharAt(i);
        return sb.toString();
    }

    static String replaceCharacterAt(String s, int i, char c) {
        StringBuilder sb = new StringBuilder(s);
        sb.setCharAt(i, c);
        return sb.toString();
    }

    static String buildNumberedList(String[] a) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++)
            sb.append(i + 1).append(". ").append(a[i]).append("\n");
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("Jyoti"));
        System.out.println(repeat("Hi", 5));
        System.out.println(joinWords(new String[]{"J", "K", "V"}, "-"));
        System.out.println(removeCharacterAt("Namaste", 1));
        System.out.println(replaceCharacterAt("Ram", 1, 'a'));
        System.out.println(buildNumberedList(new String[]{"Java", "Python"}));
    }
}
