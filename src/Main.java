import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("*************************************");
        System.out.println("Palindrome : " + isPalindrome(-1221));
        System.out.println("Palindrome : " + isPalindrome(707));
        System.out.println("Palindrome : " + isPalindrome(11212));
        System.out.println("*************************************");
        System.out.println("isPerfect Number : " + isPerfectNumber(6));
        System.out.println("isPerfect Number : " + isPerfectNumber(28));
        System.out.println("isPerfect Number : " + isPerfectNumber(5));
        System.out.println("isPerfect Number : " + isPerfectNumber(-1));
        System.out.println("*************************************");
        System.out.println("NumberToWords : " + numberToWords(123));
        System.out.println("NumberToWords : " + numberToWords(1010));
        System.out.println("NumberToWords : " + numberToWords(-12));
        System.out.println("*************************************");
    }

    public static boolean isPalindrome(int val) {
        String valStr = String.valueOf(val);
        String[] newStr = valStr.split("");
        ArrayList<String> nums = new ArrayList<String>(Arrays.asList(newStr));
        String valBefore = "";
        String valAfter = "";
        if (val < 0) {
            nums.remove(0);
            return control(nums, valBefore, valAfter);
        } else {
            return control(nums, valBefore, valAfter);
        }
    }

    public static boolean control(ArrayList<String> numbers, String vlBefore, String vlAfter) {
        for (String item : numbers) {
            vlBefore += item;
        }
        for (int i = numbers.size() - 1; i >= 0; i--) {
            vlAfter += numbers.get(i);
        }
        if (vlBefore.equals(vlAfter)) {
            return true;
        } else return false;
    }

    public static boolean isPerfectNumber(int count) {
        int total = 0;
        if (count > 0) {
            for (int i = 1; i <= count / 2; i++) {
                if ((count % i) == 0) {
                    total += i;
                }
            }
            if (total == count) return true;
            else return false;
        } else return false;
    }

    public static String numberToWords(int num) {
        char[] chars = String.valueOf(num).toCharArray();
        String value = "";
        if (num < 0) {
            return "invalid - value";
        }
        for (char item : chars) {
            switch (item) {
                case '0':
                     value += "Zero ";
                     break;
                case '1':
                     value += "One ";
                     break;
                case '2':
                     value += "Two ";
                     break;
                case '3':
                     value += "Three ";
                     break;
                case '4':
                     value += "Four ";
                     break;
                case '5':
                     value += "Five ";
                     break;
                case '6':
                     value += "Six ";
                     break;
                case '7':
                     value += "Seven ";
                     break;
                case '8':
                     value += "Eight ";
                     break;
                case '9':
                     value += "Nine ";
                     break;
            }
        }
        return value.trim();
    }
}

