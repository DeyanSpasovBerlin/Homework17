import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.copyOf;

public class Homework17Zada4a3 {
    Scanner reader = new Scanner(System.in);
    public void printZad3(){
        System.out.println("Insert nuber- the length of array:");
        Integer n = reader.nextInt();
        System.out.println("Insert nuber- the element epson of the array of array:");
        Integer m = reader.nextInt();
        Integer[] arrZad4 = new Integer[n];
        Integer[] arrZad4Trunc = new Integer[n-1];
        for (int i = 0; i < arrZad4.length; i++) {
            arrZad4[i] = i;
        }
        System.out.println("Initial full Array is: "+ Arrays.toString(arrZad4));
        for (int i = 0, j =0; i < arrZad4.length ; i++) {
            if(arrZad4[i] != m){
                arrZad4Trunc[j] = arrZad4[i];
                j++;
            }
        }
        System.out.println("Truncated Array is: "+Arrays.toString(arrZad4Trunc));
        for(int j =0; j< arrZad4Trunc.length-1;j++){
                if( (arrZad4Trunc[j]+1)!=arrZad4Trunc[j+1]){
                    System.out.println("Epson number is: "+(j+1)+" and this is element["+(j+1)+"]");
                    break;
                }
        }




    }


}

/*
Дан массив размера  N-1  , содержащий только различные целые числа в диапазоне от  1 до N . Найдите недостающий элемент.
Пример 1:
Вход:
N = 5
А[] = {1,2,3,5}
Выход: 4

Пример 2:
Вход:
N = 10
А[] = {6,1,2,8,3,4,7,10,5}
Выход: 9

 */