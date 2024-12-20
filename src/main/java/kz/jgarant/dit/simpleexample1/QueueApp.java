package kz.jgarant.dit.simpleexample1;

public class QueueApp {
    public static void main(String[] args) {
     Queue theQueue = new Queue(5);      // Очередь из 5 ячеек
     theQueue.insert(20);
     theQueue.insert(30);               // Вставка 4 элементов
     theQueue.insert(40);
     theQueue.insert(50);
     theQueue.insert(60);

     theQueue.remove();                       // Извлечение 3 элементов (10, 20, 30)
     theQueue.remove();
     theQueue.remove();

     theQueue.insert(70);               // Вставка еще 4 элементов (с циклическим переносом)
     theQueue.insert(80);
     theQueue.insert(90);

     while (!theQueue.isEmpty()) {            // Извлечение и вывод всех элементов (40, 50, 60, 70, 80)
         long n = theQueue.remove();
         System.out.print(n);
         System.out.print(" ");
     }
     System.out.println("");
    }
}

class Queue {
    private final int maxSize;      // максимальный размер массива
    private final long[] queArray;  // массив
    private int front;              // первый элемент
    private int rear;               // последний элемент
    private int nItems;             // кол-во элементов в массиве

    public Queue(int max) {             // Конструктор для инициализации
        maxSize = max;
        queArray = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(long value) {    // Вставка элемента в конец очереди
        if (rear == maxSize - 1) {      // Циклический перенос
            rear = -1;
        }
        queArray[++rear] = value;       // Увеличение rear и вставка
        nItems++;                       // Увеличение количества элементов
    }

    public long remove() {              // Извлечение элемента в начале очереди
        long temp = queArray[front++];  // Выборка и увеличение front
        if (front == maxSize) {         // Циклический перенос
            front = 0;
        }
        nItems--;                       // Уменьшение количества элементов
        return temp;
    }

    public long peekFront() {           // Чтение элемента в начале очереди
        return queArray[front];
    }

    public boolean isEmpty(){           // true, если очередь пуста
        return (nItems == 0);
    }

    public boolean isFull(){            // true, если очередь заполнена
        return (nItems == maxSize);
    }

    public int size(){                  // Количество элементов в очереди
        return nItems;
    }
}