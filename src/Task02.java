
public class Task02 {
    public static void main(String[] args) {
        String strIn = "aaaabbbcddv";

        long o1 = System.currentTimeMillis();
        // Через строки
        System.out.println(Str_arh(strIn));
        long o2 = System.currentTimeMillis();
        System.out.println("Time: " + (o2 - o1));
    }


        public static String Str_arh(String str) {
            String strRes = "";
            int count = 1;
            char currCh = str.charAt(0);
            for (int i = 1; i < str.length(); i++) {
                if(str.charAt(i) == currCh)
                    count++;
                else{
                    strRes += String.valueOf(currCh) + (count>1 ? count : "");
                    currCh = str.charAt(i);
                    count = 1;
                }
            }
            strRes += String.valueOf(currCh) + (count>1 ? count : "");
            return strRes;
        }

    }