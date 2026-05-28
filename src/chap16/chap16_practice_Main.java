package chap16;
import java.util.ArrayList;
import java.util.Iterator;

public class chap16_practice_Main {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();
        names.add("昭s");
        names.add("かうｔ");
        names.add("うぇしs");
        System.out.println(names.get(0));
        System.out.println(names.get(1));

        ArrayList<Integer> points = new ArrayList<Integer>();
        points.add(10);
        points.add(29);
        points.add(934);
        for(int i : points){
            System.out.println(i);
        }
        Iterator<String> it = names.iterator();
        while(it.hasNext()){
            String e = it.next();
            System.out.println(e);
        }
        Iterator<Integer> it2 = points.iterator();
        while(it2.hasNext()){
            Integer e2 = it2.next();
            System.out.println(e2);
        }
    }
}
