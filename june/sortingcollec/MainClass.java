package june.sortingcollec;

import java.util.ArrayList;
import java.util.Collections;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<Song> songArrayList = new ArrayList<>();
        songArrayList.add(new Song("Gouranga bolite habe","BVT",1830));
        songArrayList.add(new Song("Bhuliya Tomare","BVT",1800));
        songArrayList.add(new Song("Aemon durmati","BVT",1850));
        songArrayList.add(new Song("Vidhyar vilase","BVT",1820));
        songArrayList.add(new Song("Dhan mora nityananda","BVT",1860));

        System.out.println(songArrayList);
        System.out.println("after sorting:");
        //Sorting using Default natural sorting order - it uses Comparable(I) and default implementation is provided by vendor inside Song class compareTo() method.
        Collections.sort(songArrayList);
        System.out.println(songArrayList);

        //if we want our own implementation(Custom sorting order) and don't want default one which is sorting based on name(as implemented by vendor in Song class compareTo() method (Comparable)). We can't change default implementation. So we will use Comparator and provide custom sorting order by implementing Comparator's compare(Object o1,Object o2).

        //How can you provide custome logic for String class? Assume that you got a requirement to sort String objects in descending order. What will be your approach? (i)I will override String's compareTo() method to implement my logic. (ii)Not possible (c)I have another approach
        //-> You can't override String class compareTo method as it is final and we can't inherit it. We can use Comparator. and Collections.sort(strList,new MyComparator());

        System.out.println("Sorting using Comparator:");
        Collections.sort(songArrayList,(song1,song2)->
            (song1.getYear() < song2.getYear())?-1:(song1.getYear() > song2.getYear()?1 : 0)
        );
        System.out.println(songArrayList);

    }

}
