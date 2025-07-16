public class RecursionProblems {

    public static int count8(int n) {
        if (n == 0) return 0;
        int last = n % 10;
        int next = (n / 10) % 10;
        if (last == 8) {
            if (next == 8) return 2 + count8(n / 10);
            return 1 + count8(n / 10);
        }
        return count8(n / 10);
    }

    public static String stringClean(String str) {
        if (str.length() <= 1) return str;
        if (str.charAt(0) == str.charAt(1)) return stringClean(str.substring(1));
        return str.charAt(0) + stringClean(str.substring(1));
    }

    
    public static int countHi2(String str) {
        if (str.length() < 2) return 0;
        if (str.startsWith("xhi")) return countHi2(str.substring(1));
        if (str.startsWith("hi")) return 1 + countHi2(str.substring(2));
        return countHi2(str.substring(1));
    }

    public static int strCount(String str, String sub) {
        if (str.length() < sub.length()) return 0;
        if (str.startsWith(sub)) return 1 + strCount(str.substring(sub.length()), sub);
        return strCount(str.substring(1), sub);
    }

    public static int countHi(String str) {
        if (str.length() < 2) return 0;
        if (str.startsWith("hi")) return 1 + countHi(str.substring(2));
        return countHi(str.substring(1));
    }

}