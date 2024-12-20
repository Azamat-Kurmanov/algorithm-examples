package kz.jgarant.dit.simpleexample1;

public class Example2 {
    public static void main(String[] args) {
//        subExample2 arr = new subExample2(100);
        int [] arr = new int[30];
        arr[0] = 2; // Вставка 30 элементов
        arr[1] = 19;
        arr[2] = 52;
        arr[3] = 131;
        arr[4] = 252;
        arr[5] = 291;
        arr[6] = 382;
        arr[7] = 397;
        arr[8] = 422;
        arr[9] = 447;
        arr[10] = 460;
        arr[11] = 465;
        arr[12] = 478;
        arr[13] = 489;
        arr[14] = 506;
        arr[15] = 508;
        arr[16] = 523;
        arr[17] = 552;
        arr[18] = 559;
        arr[19] = 580;
        arr[20] = 616;
        arr[21] = 619;
        arr[22] = 663;
        arr[23] = 678;
        arr[24] = 714;
        arr[25] = 728;
        arr[26] = 780;
        arr[27] = 621;
        arr[28] = 865;
        arr[29] = 988;

        int searchKey = 551;
        int findIndex = binarySearchInArr(arr, searchKey);
        System.out.println("Search key: " + searchKey + " found index: " + findIndex + " found element: " + arr[findIndex]);
//        optimized(arr);
//        mess();
    }

    private static int binarySearchInArr(int[] arr, int searchKey) {
        int min = 0;
        int max = arr.length - 1;
        int current;
        System.out.println("min: " + min + " max: " + max);

        while(true){
            current = (min + max) / 2;
            System.out.println("current: " + current + " arr[current]: " + arr[current]);
            if(arr[current] == searchKey){
                return current;
            } else if(min > max){
                return 0;
            } else {
                if(arr[current] < searchKey){
                    min = current+1;
                } else {
                    max = current-1;
                }
            }
        }
    }

    private static void optimized(subExample2 arr) {
        int nElems = 10; // Массив содержит 10 элементов
        int j;

        for (j = 0; j < nElems; j++) {              // Вывод элементов
            System.out.print(arr.getElement(j) + " ");
        }
        System.out.println(" ");

        int searchKey = 44;                         // Поиск элемента
        for (j = 0; j < nElems; j++) {              // Для каждого элемента
            if (arr.getElement(j) == searchKey) {   // Значение найдено?
                break;
            }
        }

        if (j == nElems){                           // Нет
            System.out.println("Can't find " + searchKey);
        } else {
            System.out.println("Found " + searchKey);
        }

        // Удаление элемента с ключом 55
        searchKey = 55;
        for (j = 0; j < nElems; j++) {
            if (arr.getElement(j) == searchKey) {
                break;
            }
        }
        System.out.println("Find and remove " + searchKey);

        for (int k = j; k < nElems; k++) {
            arr.setElem(k, arr.getElement(k+1));
        }
        nElems --;

        for (j = 0; j < nElems; j++) {
            System.out.print(arr.getElement(j) + " ");
        }
    }

    private static void mess() {
        long [] arr = new long[10];     // Создание массива
        int nElements = 10;             // Массив содержит 10 элементов
        int j;                          // Счетчик цикла
        long searchKey;                 // Ключи искомого элемента

        arr[0] = 77;                    // Вставка 10 элементов
        arr[1] = 99;
        arr[2] = 44;
        arr[3] = 55;
        arr[4] = 22;
        arr[5] = 88;
        arr[6] = 11;
        arr[7] = 0;
        arr[8] = 66;
        arr[9] = 33;

        for (long item : arr) {
            System.out.println("InitItem: " + item);
        }

        searchKey = 66;                 // Поиск элемента с ключом 66
        for (j = 0; j < nElements; ++j) {// Для каждого элемента
            if (arr[j] == searchKey) {   // Значение найдено?
                break;                   // Да - выход из цикла
            }
        }

        if (j == nElements) {            // Достигнут последний элемент?
            System.out.println("Can't find " + searchKey);  // Да
        } else {
            System.out.println("Found " + searchKey);       // Нет
        }

        searchKey = 55;
        for (j = 0; j < nElements; j++) {
            if (arr[j] == searchKey) {
                break;
            }
        }

        for (int k = j; k < nElements-1; k++) {
            arr[k] = arr[k+1];
        }
        nElements--;

        for(j=0; j<nElements; j++) { // Вывод элементов
            System.out.print(arr[j] + " ");
        }
    }
}

class subExample2{
    private long [] arr;

    public subExample2(int size) {
        arr = new long[size];
    }

    public void setElem(int index, long value) {
        arr[index] = value;
    }

    public long getElement(int index) {
        return arr[index];
    }
}
