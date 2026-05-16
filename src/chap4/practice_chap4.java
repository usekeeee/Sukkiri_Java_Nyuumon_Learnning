package chap4;

public class practice_chap4 {

    public static void main(String[] args) {
        int[] scores = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }

        int avg = sum / scores.length;
        System.out.println("合計点" + sum);
        System.out.println("平均点" + avg);

        int[] seq = new int[10];

        for (int z = 0; z < seq.length; z++) {
            seq[z] =new java.util.Random().nextInt(4);

            char[] base = {'A', 'T', 'G', 'C'};
            System.out.print(base[seq[z]] + " ");
        }
        int [][] gity = {{50,40,60},{80,30,10}};
        System.out.println(gity.length);
        System.out.println(gity[0].length);

        //練習問題4-1
        int[] points = new int [4];
        double[] weight= new double[5];
        boolean[] answer= new boolean[3];
        String[] names= new String[3];

        //練習問題4-2
        int[] moneyList={121902,8302,55100};
        for(int y =0; y<moneyList.length; y++){
            System.out.println(moneyList[y]);
        }
        for(int value : moneyList){
            System.out.println(value);
        }
        //練習問題4-4(4-3は穴埋め問題のため省略)
        int[] numbers = {3,4,9};
        System.out.print("1桁の数字を入力してください");
        int input = new java.util.Scanner(System.in).nextInt();
        for(int k = 0; k<numbers.length; k++){
            if(numbers[k] == input){
                System.out.println("アタリー");
            }
        }
    }
}
