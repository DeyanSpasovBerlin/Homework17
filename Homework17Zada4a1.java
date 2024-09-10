import java.util.Arrays;
import java.util.Random;
import static java.lang.System.out;

public class Homework17Zada4a1 {
    private Integer[] arrZad1 = new Integer[8];
    Random rand = new Random();
    public void printZad1(){

        for (int i = 0;i< arrZad1.length;i++){
            //System.out.print("\t"+arrZad1[i]+", ");
            arrZad1[i] = rand.nextInt(1,50);
        }
        out.println("Initial Array is: "+Arrays.toString(arrZad1));
        for(int i = 1;i< arrZad1.length;i+=2){
            out.print("\tOld element["+i+"]= "+arrZad1[i]+", ");
            arrZad1[i] = 0;
            out.print("\tNew element["+i+"]= "+arrZad1[i]+", ");
        }
        out.println("\nFinal Array is: "+Arrays.toString(arrZad1));
    }
}










/*
Создайте массив из 8 случайных целых чисел из интервала [1;50]
Выведите массив на консоль в строку.
Замените каждый элемент с нечетным индексом на ноль.
Снова выведете массив на консоль в отдельной строке.

 */