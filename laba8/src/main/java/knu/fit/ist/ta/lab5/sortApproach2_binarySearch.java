/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Ольга
 */
public class sortApproach2_binarySearch {

    private Random rnd = new Random(1);
    private List<String> stringlist;
    private List<Integer> intlist;

    public List<String> getUnsortedStringList() {
        return stringlist;
    }

    public List<Integer> getUnsortedIntList() {
        return intlist;
    }

    public sortApproach2_binarySearch(int arrayLength) {

        String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        this.stringlist = new ArrayList<>();
        for (int i = 0; i < arrayLength; i++) {
            stringlist.add("" + a.charAt(rnd.nextInt(52)));
        }

        this.intlist = new ArrayList<>();
        for (int i = 0; i < arrayLength; i++) {
            int b = rnd.nextInt(Byte.MAX_VALUE * 2) - Byte.MAX_VALUE;
            intlist.add(Integer.parseInt(Integer.toString(b)));

        }

    }

    //--------------------------------------------------------------------
    public List<String> sortApproach2String() {

        String s;
        int t;

        List<String> result = new ArrayList<>();
        result.addAll(stringlist);

        int n = 0;
        int k = result.size() - 1;
        int arrsize = result.size() - 1;
        String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int index1 = 0;
        int index2 = 0;

        while (k != n) {
            t = k - 1;

            index1 = a.indexOf(result.get(t));
            index2 = a.indexOf(result.get(t + 1));
            while (t < arrsize && index1 > index2) {
                s = result.get(t);
                result.set(t, result.get(t + 1));
                result.set(t + 1, s);
                t++;
                index1 = a.indexOf(result.get(t));
                if (t + 1 <= arrsize) {
                    index2 = a.indexOf(result.get(t + 1));
                }
            }

            k--;

        }

        return result;
    }

    public List<Integer> sortApproach2Int() {

        int t;
        int s;

        List<Integer> result = new ArrayList<>();
        result.addAll(intlist);

        int n = 0;
        int k = result.size() - 1;
        int arrsize = result.size() - 1;

        while (k != n) {
            t = k - 1;

            while (t < arrsize && result.get(t) > result.get(t + 1)) {
                s = result.get(t);
                result.set(t, result.get(t + 1));
                result.set(t + 1, s);
                t++;
            }

            k--;

        }

        return result;
    }
    //-----------------------------------------------------------------

    public String binarySearch_String(String find, List<String> sortedList) {

        int findid = 0;
        String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < a.length(); i++) {
            if ("" + a.charAt(i) == find) {
                findid = i;
            }
        }

        int result = -1;
        int start = 0;
        int n = sortedList.size() - 1;
        while (n > 1) {

            if (start + n > sortedList.size()) {
                start--;
            }
            n = (n + 1) / 2;

            int listid = 0;
            for (int i = 0; i < a.length(); i++) {
                if (sortedList.get(n + start) == "" + a.charAt(i)) {
                    listid = i;
                }
            }

            if (sortedList.get(n + start).equals(find)) {
                return "position = " + (start + n);
            } else if (listid > findid) {
                start = start + n;
            }

        }

        return "" + result;
    }

    public String binarySearch_Int(int find, List<Integer> sortedList) {

        
        int result = -1;
        int start = 0;
        int n = sortedList.size() - 1;
        while (n > 1) {

            if (start + n > sortedList.size()) {
                start--;
            }
            n = (n + 1) / 2;

            System.out.println(find + " | " + sortedList.get(n + start).intValue());
            if (sortedList.get(n + start).intValue() == find) {
                return "position = " + (start + n);
            } else if (sortedList.get(n + start).byteValue() < find) {
                start = start + n;
            }

        }

        return "" + result;
    }
}
