package app.niedziela.rano;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class Szkola {

    public static void main(String[] args) {



    ArrayList<Integer> myNumbers = new ArrayList<>();

    myNumbers.add(new Integer(23));

        for (Integer myNumber : myNumbers) {
            System.out.println(myNumber);
        }

        TreeSet<Integer> myNumber = new TreeSet<>();

        myNumber.add(29);
        myNumber.add(29);

        System.out.println(myNumbers.size());

        HashMap<String, String> strings = new HashMap<String, String>();
    }

}

