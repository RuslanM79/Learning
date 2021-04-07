package uamrv.prj;
/*
Написать класс содержащий полу типа list содержащий только уникальные элементы (Integer), добавить в нее список не уникальных эелемнтов
так, чтобы остались только униклаьные, остортировать по возрастанию и вывести.
 */

import java.util.*;

public class ListTask {


    public static void main(String[] args){
        Integer [] start= {0,3,8,2,6,1,4,5,7,9,10};
        Integer [] toAdd= {10,10,1,2,33,33,45,65,99,99,108,108};
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(start));
        for (int i = 0; i< toAdd.length; i++){
            if (!list.contains(toAdd[i])){
                list.add(toAdd[i]);
            }
        }
        Collections.sort(list);
        System.out.println(Arrays.asList(list));
    }

}
