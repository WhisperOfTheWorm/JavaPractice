public class Runner {
    public static void main(String[] args) {
        System.out.println(codebat(""));

    }

    public static boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        } else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }


    public static String codebat(String name) {
        return name;
    }

    public static int last2(String str) {
        if (str.length() < 2) {
            return 0;
        }

        String a = str.substring(str.length() - 2);
        int b = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            String c = str.substring(i, i + 2);
            if (c.equals(a)) {
                b++;
            }
        }
        return b;
    }

    public static String helloName(String name) {
        return "Hello " + name + "!";
    }

    public static int[] front11(int[] a, int[] b) {
        int x = a[0];
        int y = b[0];

        if (x == 0) {
            return new int[] {a[0]};
        }

        if (y == 0) {
            return new int[] {b[0]};
        }

        int[] z = new int[] {a[0], b[0]};
        return z;
    }

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend && cigars >= 40) {
            return true;
        } else {
            if (cigars >= 40 && cigars <= 60) {
                return true;
            } else {
                return false;
            }

        }
    }

    public static int luckySum(int a, int b, int c) {
        if (a != 13 && b != 13 && c != 13) {
            return a + b + c;
        }
        if(a == 13){
            return 0;
        }
        if (b == 13) {
            return a;
        }
        if (c == 13) {
            return a + b;
        }
        return 0;
    }

    public static String doubleChar(String str){
        String x = "";
        for(int i = 0; i<str.length();i++){
            String y = str.substring(i, i+1);
            x += y + y;
        }
        return x;
    }



    public static boolean gHappy(String str) {
        int strlen = str.length();
        boolean a = true;

        for (int i = 1; i < strlen; i++) {
            if (str.substring(i, i+1).equals("g")) {
                if (i > 0 && str.substring( i - 1, i).equals("g")){
                    a = true;
                    if (i < strlen - 1 && str.substring(i, i + 1).equals("g")){
                        a = false;
                    }
                    else {
                        a = true;
                    }
                }
            }
        }
        return a;
    }



}
