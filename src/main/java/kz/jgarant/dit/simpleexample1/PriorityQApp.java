package kz.jgarant.dit.simpleexample1;

public class PriorityQApp {
    public static void main(String[] args) {
        PriorityQ thePQ = new PriorityQ(5);
        thePQ.insert(30);
        thePQ.insert(50);
        thePQ.insert(10);
        thePQ.insert(40);
        thePQ.insert(20);

        while (!thePQ.isEmpty()){
            long item = thePQ.remove();
            System.out.print(item + " ");       // 10, 20, 30, 40, 50
        }
        System.out.println();

        thePQ.display();
    }
}

class PriorityQ{
    // Элементы массива сортируются по значению ключа, от максимумa (0) до минимума (maxSize-1)
    private final int maxSize;
    private final long[] queArray;
    private int nItems;

    public PriorityQ(int maxSize){
        this.maxSize = maxSize;
        queArray = new long[maxSize];
        nItems = 0;
    }

    public void insert(long value){
        int j;

        if(nItems == 0){                            // Если очередь пуста,
            queArray[nItems++] = value;             // вставляем в ячейку 0
        } else {                                    // Если очередь содержит элементы
            for (j = nItems - 1; j >= 0; j--) {     // Перебор в обратном направлении
                if(value > queArray[j]){            // Если новый элемент больше,
                    queArray[j+1] = queArray[j];    // сдвинуть вверх
                } else {                            // Если меньше,
                    break;                          // сдвиг прекращается
                }
            }
            queArray[j+1] = value;                  // Вставка элемента
            nItems++;
        }
    }

    public long remove(){                           // Извлечение минимального элемента
        return queArray[--nItems];
    }

    public long peekMin(){                          // Чтение минимального элемента
        return queArray[nItems - 1];
    }

    public boolean isEmpty(){                       // true, если очередь пуста
        return nItems == 0;
    }

    public boolean isFull(){                        // true, если очередь заполнена
        return nItems == maxSize;
    }

    public void display(){
        for (int i = 0; i < nItems; i++){
            System.out.print(queArray[i] + " ");
        }
    }
}
