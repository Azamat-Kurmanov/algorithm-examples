package kz.jgarant.dit.simpleexample1;

public class SelectSort {
    public static void main(String[] args) {
        int[] listOfArr = getListOfArr();
        System.out.print("Before sorting: ");
        for (int valBefore: listOfArr) {
            System.out.print(valBefore+" ");
        }
//        int[] sort = executeSelectSort(listOfArr);
        int[] sort = executeSort(listOfArr);
        System.out.print("After sorting: ");
        for (int val: sort){
            System.out.print(val + " ");
        }
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

    private static int[] executeSelectSort(int[] listOfArr) {
        int out, in, min;
        for (out = 0; out < listOfArr.length-1; out++) {    // out пробегается по всему внешнему циклу
            min = out;                                      // min копирует индекс из out
            for (in = out+1; in < listOfArr.length; in++) { // in индекс начинает свой внутренний цикл с индекса out+1
                if (listOfArr[in] < listOfArr[min]) {   // если массив с индексом in=out+1 меньше того же массива с индексом min
                    min = in;           // индекс min копирует индекс in
                }
            }
            int temp = listOfArr[out];  // temp копирует элемент массива с индексом out
            listOfArr[out] = listOfArr[min];    // текущий элемент массива из внешнего цикла копирует значение элемента с индексом min
            listOfArr[min] = temp;      // элемент внешнего цикла с индексом min копирует значение из temp
        }
        System.out.println();
        return listOfArr;
    }

    private static int[] executeSort(int[] listOfArr) {
        int in, out, min;
        for(out=0; out<listOfArr.length-1; out++){
            min = out;
            for(in = out+1; in<listOfArr.length; in++){
                if(listOfArr[in]<listOfArr[min]){
                    min = in;
                }
            }
            int temp = listOfArr[out];
            listOfArr[out] = listOfArr[min];
            listOfArr[min] = temp;
        }
        System.out.println();
        return listOfArr;
    }
}
