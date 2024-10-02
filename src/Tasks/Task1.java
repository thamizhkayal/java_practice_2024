package Tasks;

public class Task1 {

    public static void run() {
        long nums = 1020101210;
        String numStr = "" + nums;

        String r = "";
        String l = "";

        for (int i = 0; i < numStr.length(); i++) {
            char ch = numStr.charAt(i);
            if (ch == '0') {
                l = l + ch;

            } else {
                int nu = 96 + Character.getNumericValue(ch);
                char chaa = (char) nu;
                r = r + chaa;
            }
        }
        System.out.println(r + l);
    }

}
