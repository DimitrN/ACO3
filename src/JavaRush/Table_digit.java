package JavaRush;

import java.io.*;
import java.util.Scanner;



public class Table_digit  {

    public static int min(int a, int b, int c, int d){
        if (min2 ( a,  b)<min2 ( c,  d)){
        return min2 ( a,  b);
    } else {
        return min2 ( c,  d);
        }
    }





    public static int min2 (int a, int b)
    {
        if (a<b){return a;} else {return b;}

    }

    public static int min3(int a, int b, int c){

        if (a<b && a<c){
            return a;
        } else if (b<c && b<c){
            return b;
        }      else {
            return c;
        }



        }






    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        System.out.println (str1 + " проспонсировал " +str2 + ", и она стала известной певицей.");







        /*InputStream inputStream = System.in; // создаем поток, который принимает введенные с клавиатуры данные (в байт-коде)
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream); // Создаем объект, который читает байт-код и приобразовывает его в чары
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader); // своими методами класс BufferReader помогает преобразовывать поток в нужный тип данных

        String text = bufferedReader.readLine();
        System.out.println(text);
*/












        //System.out.println(min3(8, 7, 5));

        /*String path1 = "\"C:\\Program Files\\Java\\jdk1.7.0\\bin\"";
        String path2 = "\"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\\\"";
        String str1 = "It's Windows path: ";
        String str2 = "It's Java string: \\";

        System.out.println(str1+path1);
        System.out.println(str2+path2);*/


        /*Scanner sc = new Scanner(System.in);
        int digit = sc.nextInt();
        System.out.println(digit);*/





    }
}
