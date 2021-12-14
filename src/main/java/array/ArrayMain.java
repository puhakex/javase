package array;

public class ArrayMain {
    public static void main(String[] args) {

        //Hét napjai
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(days[1]);
        System.out.println(days.length);

        //2 hatványai
        int[] hatvanyok = new int[5];
        for (int i = 0; i < hatvanyok.length; i++) {
            if (i == 0) {
                hatvanyok[i] = 1;
            }
            if (i > 0) {
                hatvanyok[i] = hatvanyok[i-1] * 2;
            }
        }

        for (int item: hatvanyok) {
            System.out.print(item + " ");

        }


    }
}
