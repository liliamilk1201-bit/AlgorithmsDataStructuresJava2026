import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1.
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Pink");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Orange");
        colors.add("Purple");
        System.out.println("1. Колекція: " + colors);
        //2.
        System.out.println("2. Ітерація:");
        for(String color : colors){
            System.out.println(" " + color);
        }
        //3.
        colors.add(0, "Green");
        System.out.println("3. Після вставки на початок: " + colors);
        //4.
        System.out.println("4. Введіть індекс елемента: ");
        Scanner console = new Scanner(System.in);
        int k = console.nextInt();
        if(k >= 0 && k < colors.size()){
            System.out.println("4. Елемент з індексом " + k + ": " + colors.get(k));
        }
        else{
            System.out.println("4. Такого індексу немає, розмір списку: " + colors.size());
        }
        //5.
        colors.set(1, "Red");
        System.out.println("5. Після оновлення елемента з індексом 1 : " + colors);
        for (int i = 0; i < colors.size(); i++) {
            System.out.println("   " + colors.get(i));
        }
        //6.
        colors.remove(2);
        System.out.println("6. Після видалення третього елемента : " + colors);
        //7.
        String search = "Orange";
        if (colors.contains(search)){
            System.out.println("7. Елемент" + search + "знайдено, індекс: " + colors.indexOf(search));
        }
        else{
            System.out.println("7. Елемент" + search + "не знайдено");
        }
        //8.
        Collections.sort(colors);
        System.out.println("8. Відсортований список: " + colors);
        //9.
        ArrayList<String> colors2 = (ArrayList<String>) colors.clone();
        System.out.println("9. Оригінал: " + colors);
        System.out.println("Копія" + colors2);
        //10.
        Collections.reverse(colors2);
        System.out.println("10. Копія після реверсу: " + colors2);
        System.out.println("Оригінал не змінився: " + colors);
        //11.
        System.out.println("11. colors.equals(colors2): " + colors.equals(colors2));
        Collections.reverse(colors2);
        System.out.println("Після повторного реверсу: " + colors.equals(colors2));
        System.out.println("colors == colors2 (одне й те саме посилання): " + (colors == colors2));
        //12.
        colors.clear();
        System.out.println( "12. Після clear(): " + colors);
        //13.
        System.out.println("13. colors порожній: " + colors.isEmpty());
        System.out.println("colors2 порожній: " + colors2.isEmpty());
        //14.
        colors.ensureCapacity(20);
        colors.add("Black");
        colors.add("Red");
        colors.add("Gray");
        colors.add("Violet");
        colors.add("Brown");
        System.out.println("14. Місткість збільшено до 20, елементи: " + colors);
        //15.
        colors.trimToSize();
        System.out.println("15. Після trimToSize(), розмір: " + colors.size());
    }
}