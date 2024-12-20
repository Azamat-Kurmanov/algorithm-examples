package kz.jgarant.dit.simpleexample1;

import java.util.*;

public class Example1 {

    public static void main(String[] args) {
        String names = "АЙСАНА";
//        String names = "РОЗА";
//        String names = "АЗАМАТ";
//        String names = "ДАНИЯ";
        System.out.print("Слово-перевертыш: " + names + "-");

        for (int i = names.length()-1; i >= 0; i--) {
            System.out.print(names.charAt(i));
        }
        System.out.println();
//*********************Максимальное и минимальное число******************************//
        int[] digits = {3,7,2,8,5,3,10,9,23,42};
        int max = digits[0];
        int min = digits[0];
        for (int i = 0; i <= digits.length-1; i++) {
            int next = digits[i];
            if (next >= max) {
                max = next;
            }
            if (next <= min) {
                min = next;
            }
        }
        for (int digit : digits) {
            System.out.print(digit + ", ");
        }
        System.out.println("\nmin: " + min);
        System.out.println("max: " + max);

//***********************Проверка на дубликаты***************************************//
        int[] someDigits = {53,56,5,23,9,53,42,3,7,2,8,5,3,10,9,23,42};
        System.out.println("Цифры с дубликатами: " + Arrays.toString(someDigits));
        List<Integer> duplicates = new ArrayList<>();
        List<Integer> cleanList = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (Integer element : someDigits) {
            if (!cleanList.contains(element)) {
                cleanList.add(element);
            }
            if (!set.add(element)){
                duplicates.add(element);
            }
        }
        System.out.println("duplicates: " + duplicates);
        System.out.println("cleanList: " + cleanList);
//*******************************************************************************//
        String a = "abc";
        String b = "abc";
        System.out.println("is equal: " + a.equals(b));
        System.out.println("a==b: " + a==b);

//************************************Ёлка*******************************************//
        System.out.println("---------------------Ёлка----------------------");
        elkaTop();
        elka();
    }

    private static void elkaTop() {
        int[] elka = new int[4];
        int mid = elka.length/2;
        int left = mid;
        int right = mid;
        int shift = elka.length;
        for (int i = 0; i <= elka.length; i++) {
            for (int k = 0; k < shift+mid+11; k++) {
                System.out.print("  ");
            }
            for (int j = left; j <= right; j++) {
                System.out.print(" *");
            }
            System.out.println();
            left--;
            right++;
            shift--;
        }
    }



    private static void elka() {
        int elkaSize = 10;
        int maxSize = 4;
        for (int s = 0; s < 2; s++) {
            maxSize = maxSize+4;
            int[] elka = new int[maxSize];
            int mid = elkaSize / 2;
            int left = mid;
            int right = mid;
            int shift = elkaSize;
            for (int i = 0; i <= elka.length - 1; i++) {
                for (int k = 0; k < shift + mid; k++) {
                    System.out.print("  ");
                }
                for (int j = left-2; j <= right+2; j++) {
                    System.out.print(" *");
                }
                System.out.println();
                left--;
                right++;
                shift--;
            }
        }
    }
}
