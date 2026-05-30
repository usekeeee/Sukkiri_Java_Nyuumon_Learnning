package chap17;
import java.io.*;
public class chap17_practice_Main {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("data.txt");
            fw.write("hello");
        } catch (Exception e) {
            System.out.println("何らかの例外が発生しました");
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    ;
                }
            }
        }
    chap17_practice_Person p = new chap17_practice_Person();
        p.setAge(-128);
    }
}