public class Sum_of_all_divi {
    static long sumOfDivisors(int N){
        System.out.println("Given a positive integer N., The task is to find the value of Σi from 1 to N F(i) where function F(i) for the number i is defined as the sum of all divisors of i.\n" +
                "\n");
        long tsum=0;
        for (int i = 1; i <=N; i++) {
            Long sum=0l;
            for (int j = 1; j <=i; j++) {
                if (i % j == 0) {
                sum+=j;
            }
            }
            tsum+=sum;
    }
        System.out.println(tsum);
        return tsum;
    }
    public static void main(String[] argc){
        sumOfDivisors(5);
    }
}
