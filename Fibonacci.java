public class Fibonaci {

    public static void main(String[] args) {

        int num = 0;
        int total = 0;
        int max = 4000000;
        int temp1 = 0;
        int temp2 = 1;

        while (num < max) {

            if (num % 2 == 0) {
                total += num;
            }
            num = temp1 + temp2;
            
            temp2 = temp1;
            temp1 = num;

        }
        System.out.println(total);

    }

}