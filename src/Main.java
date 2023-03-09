import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //На входе массив из 10 элеентов
        ArrayListImplementation list = new ArrayListImplementation(10);

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.print();


        //Добавляем любо количество ээлементов
        list.add(11);
        list.add(12);

        list.print();
    }
}