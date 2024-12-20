package kz.jgarant.dit.simpleexample1;

public class OrdArray{
    private long[] arr;
    private int nElems;

    public OrdArray(int max){
      arr = new long[max];
      nElems = 0;
    }

    public int size(){
        return nElems;
    }

    public int find(long searchKey){
        int low = 0;
        int high = nElems - 1;
        int curIndex;

        while (true){
            curIndex = (low + high) / 2;
            if (arr[curIndex] == searchKey){
                return curIndex;
            } else if (low > high) {
                return nElems;
            } else {
                if (arr[curIndex] < searchKey){
                    low = curIndex + 1;
                } else {
                    high = curIndex - 1;
                }
            }
        }
    }

    public void insertFirst(long value){
        int j;
        for (j = 0; j < nElems; j++){
            if (arr[j] > value){
                break;
            }
        }

        for (int k = nElems; k > j; k--){
            arr[k] = arr[k - 1];
        }
        arr[j] = value;
        nElems++;
    }

    public void insertInOrder(long value){
        int i;
        for (i = 0; i < nElems; i++){
            if (arr[i] > value){    // Если элемент массива выше, чем добавляемое значение, то цикл останавливается и i фиксирует индекс
                break;
            }
        }

        for (int j = nElems; j > i; j--){   // j = кол-ву элементов в массиве. Если кол-во элементов больше, чем фиксированный индекс массива,
            arr[j] = arr[j - 1];        //то элементы массива будут копировать значения предыдущего элемента массива, до того момента пока не достигнут элемента с фиксированным индексом
        }

        arr[i] = value; // массив добавляет значение в указанный индекс
        nElems ++;  // кол-во элементов в массиве
    }

    public void insertInOppositeOrder(long value){
        int i;
        for (i = 0; i < nElems; i++){
            if(arr[i] < value){
                break;
            }
        }

        for (int j = nElems; j > i; j--){
            arr[j] = arr[j - 1];
        }
        arr[i] = value;
        nElems++;
    }

    public boolean delete(long value){
        int j = find(value);
        if (j == nElems){
            return false;
        } else {
            for (int k = j; k < nElems; k++){
                arr[k] = arr[k + 1];
            }
            nElems --;
            return true;
        }
    }

    public void display(){
        for (int j = 0; j < nElems; j++){
            System.out.print(arr[j] + " ");
        }
        System.out.println(" ");
    }
}
