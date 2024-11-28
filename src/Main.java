import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
//Объявите три массива:
//Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new

        int [] one = new int[3];
        one [0] = 1;
        one [1] = 2;
        one [2] = 3;
//Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986.
//Массив сразу заполните значениями.

        float [] two = {1.57F,7.654F,9.986F};
//Произвольный массив. Тип и количество данных определите сами. Самостоятельно выберите способ создания массива:
//с помощью ключевого слова или сразу заполненный элементами.

        int [] three = {0,1};

        System.out.println("Задача №2");
//Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую.
//В конце строки запятую ставить не надо.

        System.out.println(Arrays.toString(one));
        System.out.println(Arrays.toString(two));
        System.out.println(Arrays.toString(three));

        System.out.println("Задача №3");
//Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую.
//В конце строки запятую ставить не надо.

        for (int i = one.length-1; i>=0; i-- ) {
            System.out.print(", " +one[i]);
        }
        System.out.println( );
        for (int i = two.length-1; i>=0; i-- ) {
            System.out.print(", "+two[i]);
        }
        System.out.println();
        for (int i = three.length-1; i>=0; i-- ) {
            System.out.print(", "+three[i]);
        }
        System.out.println();
        System.out.println("Задача №4");
//Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
//Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания используйте циклы.
//Распечатайте результат преобразования в консоль.
for (int i =0; i< one.length; i++){
    if (one[i]%2!=0)
    one[i]+=1;
    System.out.println(one[i]);
}

    }
}