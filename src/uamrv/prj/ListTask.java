package uamrv.prj;
/*
Написать класс типа коллекция, содержащий только уникальные элементы (Integer), добавить в нее список не уникальных эелемнтов
так, чтобы остались только униклаьные, остортировать по возрастанию и вывести.
 */

import java.util.*;

public class ListTask {


    public static void main(String[] args) {
        Integer[] start = {0, 3, 8, 2, 6, 1, 4, 5, 7, 9, 10};
        Integer[] toAdd = {10, 10, 1, 2, 33, 33, 45, 65, 99, 99, 108, 108};

        LinkedHashSet<Integer> linkedList = new LinkedHashSet<Integer>(Arrays.asList(start));
        ArrayList<Integer> list = new ArrayList<Integer>();


        for (int i = 0; i < toAdd.length; i++) {
            linkedList.add(toAdd[i]);
        }

        list.addAll(linkedList);
        Collections.sort(list);
        linkedList.clear();
        linkedList.addAll(list);
        System.out.println(Arrays.asList(linkedList));


    }

}
/*
Второй вариант
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
 */