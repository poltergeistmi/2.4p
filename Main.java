package prak2_4;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();

        Random rand = new Random();
        rand.setSeed(System.currentTimeMillis());
        for (int i=0; i <= 20; i++)
        {
            Integer r = rand.nextInt() % 256;
            arrayList.add(r);
        }

        System.out.println("Початковий список:");
        System.out.println(arrayList);
        System.out.print("Введіть число: ");
        int num = in.nextInt();

        CompareInt compareInt = new CompareInt(num);
        Collections.sort(arrayList, compareInt);

        System.out.println("Переформатований список:");
        System.out.println(arrayList);
    }
}

class CompareInt implements Comparator<Integer>{

    private Integer integer;

    CompareInt(Integer integer){
       this.integer = integer;
    }

    @Override
    public int compare(Integer integer, Integer i2){
        return integer - i2;
    }
}
