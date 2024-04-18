package practice;

public class StringQuestions {

    public static void main(String[] args) {
        String str = "ana";
        String str3 = "";

        StringBuilder stringBuilder = new StringBuilder(str);

        StringBuilder reverse = stringBuilder.reverse();

        String str2 = reverse.toString();

        if(str.equals(str2)){
            System.out.println("its a palindrome...");
        }


        for(int i = str.length()-1;i>=0;i--) {
            str3.concat(Character.toString(str.charAt(i)));
        }

        System.out.println(str3);

        if(str.equals(str3)){
            System.out.println("its a palindrome...");
        }
    }
}
