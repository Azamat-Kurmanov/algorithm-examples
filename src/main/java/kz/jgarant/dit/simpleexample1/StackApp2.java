package kz.jgarant.dit.simpleexample1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class StackApp2 {
    public static void main(String[] args) throws IOException {
        String input;
        while(true)
        {
            System.out.print("Enter string containing delimiters: ");
            System.out.flush();
            input = getString(); // Чтение строки с клавиатуры
            if(input.equals("")) // Завершение, если [Enter]
                break;
            BracketChecker theChecker = new BracketChecker(input);  // Создание объекта BracketChecker
            theChecker.check(); // Проверка парных скобок
        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}

class StackX2 {
    private int maxSize;
    private char[] stackArray2;
    private int top;

    public StackX2(int maxSize) {
        stackArray2 = new char[maxSize];
        top = - 1;
    }

    public void push(char value) {
        stackArray2[++top] = value;
    }

    public char pop() {
        return stackArray2[top--];
    }

    public char peek() {
        return stackArray2[top];
    }

    public boolean isEmpty() // True, если стек пуст
    {
        return (top == -1);
    }
//--------------------------------------------------------------
} // Конец класса StackX

class BracketChecker{
    private String input;

    BracketChecker(String value){
        this.input = value;
    }

    public void check() {
        int stackSize = input.length(); // Определение размера стека
        StackX2 theStack = new StackX2(stackSize); // Создание стека
        for(int j=0; j<input.length(); j++) // Последовательное чтение
        {
            char ch = input.charAt(j); // Чтение символа
            switch(ch)
            {
                case '{': // Открывающие скобки
                case '[':
                case '(':
                    theStack.push(ch); // Занести в стек
                    break;
                    case '}': // Закрывающие скобки
                case ']':
                case ')':
                    if( !theStack.isEmpty() ) // Если стек не пуст,
                    {
                        char chx = theStack.pop(); // Извлечь и проверить
                        if( (ch=='}' && chx!='{') || (ch==']' && chx!='[') || (ch==')' && chx!='(') )
                            System.out.println("Error: "+ch+" at "+j);
                    }
                    else // Преждевременная нехватка элементов
                        System.out.println("Error: "+ch+" at "+j);
                    break;
                default: // Для других символов действия не выполняются
                    break;
            }
        }   // В этой точке обработаны все символы
        if(!theStack.isEmpty()) System.out.println("Error: missing right delimiter");
    }
}
