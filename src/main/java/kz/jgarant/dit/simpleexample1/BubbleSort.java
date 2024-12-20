package kz.jgarant.dit.simpleexample1;

public class BubbleSort {
    public static void main(String[] args) {
        int[] listOfArr = getListOfArr();
        System.out.print("Before sorting: ");
        for (int valBefore: listOfArr) {
            System.out.print(valBefore+" ");
        }
//        int[] sort = executeBubbleSort(listOfArr);
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

    private static int[] executeBubbleSort(int[] listOfArr) {
        /* На каждом цикле происходит освобождение последних элементов, для того, чтобы в них добавлялись отсортированные элементы*/
        for (int j = listOfArr.length-1; j > 0; j--) {  // j-- на каждом цикле смещается влево для добавления нового элемента в конец
            int temp;
            for (int i = 0; i < j; i++) {   // внутренний цикл выполняет свои циклы только до индекса j
                if (listOfArr[i] > listOfArr[i+1]) {    // если элемент массива больше следующего элемента, то
                    temp = listOfArr[i];                // записывает временно в temp значение текущего элемента
                    listOfArr[i] = listOfArr[i+1];      // копирует значение следующего элемента в текущий
                    listOfArr[i+1] = temp;              // в следующий элемент записывается значение элемента из temp
                }
            }
        }

        System.out.println();
        return listOfArr;
    }

    private static int[] executeSort(int[] listOfArr) {
        for(int i=listOfArr.length-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(listOfArr[j]>listOfArr[j+1]){
                    int temp = listOfArr[j];
                    listOfArr[j] = listOfArr[j+1];
                    listOfArr[j+1] = temp;
                }
            }
        }
        System.out.println();
        return listOfArr;
    }
}
