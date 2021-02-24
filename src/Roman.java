
import java.io.*;
import java.util.*;

public class Roman {

    private final static TreeMap<Integer, String> myMap = new TreeMap<Integer, String>();

    static {
        myMap.put(1000, "M");
        myMap.put(900, "CM");
        myMap.put(500, "D");
        myMap.put(400, "CD");
        myMap.put(100, "C");
        myMap.put(90, "XC");
        myMap.put(50, "L");
        myMap.put(40, "XL");
        myMap.put(10, "X");
        myMap.put(9, "IX");
        myMap.put(5, "V");
        myMap.put(4, "IV");
        myMap.put(1, "I");
    }



    public static String convert( int num ) {
        int l = myMap.floorKey(num);
        if (num == l) {
            return myMap.get(num);
        }
        return myMap.get(l) + convert(num - l);
    }



    public static void main(String[] args) {
        System.out.println(convert(4032));
 
    }

}