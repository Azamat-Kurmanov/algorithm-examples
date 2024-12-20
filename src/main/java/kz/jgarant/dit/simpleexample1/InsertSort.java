package kz.jgarant.dit.simpleexample1;

public class InsertSort {
    public static void main(String[] args) {
        int[] listOfArr = getListOfArr();
        System.out.print("Before sorting: ");
        for (int valBefore: listOfArr) {
            System.out.print(valBefore+" ");
        }

        int[] sort = executeInsertSort(listOfArr);
        System.out.print("After sorting: ");
        for (int val: sort){
            System.out.print(val + " ");
        }
    }

    private static int[] executeInsertSort(int[] listOfArr) {
        int in, out;
        for (out = 1; out < listOfArr.length; out++) {  // внешний цикл начинает с второго элемента с индексом 1 и проходит по всему циклу
            int temp = listOfArr[out];  // temp временно копирует текущий элемент из внешнего цикла
            in = out;               // in копирует индекс out внешнего цикла
            while (in > 0 && listOfArr[in - 1] >= temp) {   // условие внутр. цикла: если in больше 0 и предыдущий элемент больше и равен temp, то
                listOfArr[in] = listOfArr[in - 1];  // текущий элемент с индексом in копирует элемент предыдущего элемента n-1
                --in;                               // по завершению цикла происходит уменьшение цикла на 1
            }
            listOfArr[in] = temp;               // текущий элемент с индексом in копирует элемент из temp
        }
        System.out.println();
        return listOfArr;
    }

    private static int[] getListOfArr() {
        int[] arr = new int[11];
        arr[0] = 74;
        arr[1] = 70;
        arr[2] = 90;
        arr[3] = 80;
        arr[4] = 65;
        arr[5] = 3;
        arr[6] = 68;
        arr[7] = 45;
        arr[8] = 2;
        arr[9] = 52;
        arr[10] = 21;
        return arr;
    }
}
