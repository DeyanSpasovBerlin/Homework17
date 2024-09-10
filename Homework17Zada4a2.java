import java.util.Arrays;
import java.util.Random;
import static java.lang.System.out;
import static java.util.Arrays.*;

public class Homework17Zada4a2 {
    private Integer[] arrZad2 = new Integer[5];
    private Integer[] arrZad2Sort = new Integer[5];
    private String st;
    private Integer index = 0;
    Random rand = new Random();
    public void printZad2(){
        for (int i =0; i< arrZad2.length; i++){
            arrZad2[i] = rand.nextInt(10,99);
        }
        out.println("Initial Array is: "+Arrays.toString(arrZad2));
        arrZad2Sort = copyOf(arrZad2, arrZad2.length);
        sort(arrZad2Sort);
        out.println("Increasing sequence Array is: "+Arrays.toString(arrZad2Sort));
        if(Arrays.equals(arrZad2,arrZad2Sort)){
            out.println("The initial array is  increasing sequence of numbers!");
        }
        else {
            out.println("The initial array is not increasing sequence of numbers!");
        }
//        Integer minArrZad2 = arrZad2[0];
//        for (Integer i =0;i<arrZad2.length; i++) {
//            if(minArrZad2>arrZad2[i]){
//                st ="The initial array is not increasing sequence of numbers!";
//                minArrZad2 = arrZad2[i];
//                index =i;
//                //out.println("index"+index);
//            }else {
//                st = "The initial array is  increasing sequence of numbers!";
//            }
//        }
//        out.println(st);
//        out.println(" The min element of initial array is element["+index+"] = "+arrZad2[index]);
    }

}

/*
Создайте массив из 5 случайных целых чисел из интервала [10;99]
Выведите его на консоль в строку.
Определите и выведите на экран сообщение о том, является ли массив строго возрастающей последовательностью.

 */