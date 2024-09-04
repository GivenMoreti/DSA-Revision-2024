package PracticeSemesterTest;

import PracticeSemesterTest.ArrayLists.MySecondArrayList;

public class Main {

    public static void main(String[] args) {
        MySecondArrayList<Integer> arrList = new MySecondArrayList<Integer>();

        // test for inserting at the end
        arrList.append(100);
        arrList.append(300);
        arrList.append(45);
        arrList.append(90);
        // 
        // arrList.deleteEnd();
        // 
        System.out.println(arrList);
        arrList.sort();
        arrList.deleteStart();
        arrList.deleteEnd();
        System.out.println(arrList);
    }

}
