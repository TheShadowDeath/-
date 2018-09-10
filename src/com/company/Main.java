package com.company;

import java.util.concurrent.SynchronousQueue;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        String str = new String();
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("а) Найти самую длинную последовательность идущих подряд одинаковых элементов и где эта последовательность начинается ");
            System.out.println("б) Определить три последовательных элемента( и их индексы), суммы которых в массиве максимальны");
            System.out.println("д) Уплотнить массив, оставив повторяющиеся элементы в одном экземпляре");
            System.out.println("Для выхода наберите: выход");
            System.out.print("Выберите задание: ");
            str = in.nextLine();
            switch (str) {
                case "а":
                    mas.a();
                    break;
                case "б":
                    mas.b();
                    break;
                case "д":
                    mas.d();
                    break;
                case "выход":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Такого задания не существует");
                    break;
            }
        }
    }
}

class mas
{
   public static void a()
   {
       int n, value, Index = 0, col = 1, maxCol = 1;
       Scanner in = new Scanner(System.in);
       System.out.print("Введите размер массива: ");
       n = in.nextInt();
       int array[] = new int[n];
       System.out.println("Введите значения");
       for (int i = 0; i < n; i = i + 1)
       {
           array[i] = in.nextInt();
       }
       value = array[0];
       for (int i = 1; i < n; i = i + 1)
       {
           if (value == array[i])
           {
               col = col + 1;
           }
           else
           {
               col = 1;
               value = array[i];
           }
           if (col > maxCol)
           {
               maxCol = col;
               Index = i;
           }
       }
       System.out.println("Максимальное кол-во элементов: " + maxCol);
       System.out.println("Начинаются с индекса: " + (Index + 1 - maxCol));
   }
   public static void b()
   {
       int n, sum, maxSum, Index = 0;
       Scanner in = new Scanner(System.in);
       System.out.print("Введите размер массива: ");
       n = in.nextInt();
       int array[] = new int[n];
       System.out.println("Ввдите значение");
       for (int i = 0; i < n; i = i + 1)
       {
           array[i] = in.nextInt();
       }
       if ((n - 2) > 0)
       {
           maxSum = array[0] + array[1] + array[2];
           for (int i = 1; i < n - 2; i = i + 1)
           {
               sum = array[i] + array[i + 1] + array[i + 2];
               if (sum > maxSum)
               {
                   maxSum = sum;
                   Index = i;
               }
           }
       }
       System.out.println("Три элемента в которых сумма максимальна: " + array[Index]+ " " + array[Index + 1]+ " " + array[Index + 2]);
       System.out.println("Индексы элементов: " + Index + " " + (Index + 1) + " " + (Index + 2));
   }
   public static void d()
   {
       {
           int n, value;
           Scanner in = new Scanner(System.in);
           System.out.print("Введите размер массива: ");
           n = in.nextInt();
           int array[] = new int[n];
           System.out.println("Ввдите значение");
           for (int i = 0; i < n; i = i + 1)
           {
               array[i] = in.nextInt();
           }
           for (int i = 0; i < n; i = i + 1)
           {
               value = array[i];
               for (int j = i + 1; j < n; j = j + 1)
               {
                   if (value == array[j])
                   {
                       n = n - 1;
                       for (int k = j; k < n; k = k + 1)
                       {
                           array[k] = array[k + 1];
                       }
                   }
               }
           }
           System.out.print("Массив:");
           for (int i = 0; i < n; i = i + 1)
           {
               System.out.print(" " + array[i]);
           }
       }
   }
}

