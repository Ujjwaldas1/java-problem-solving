package arrays;

public class GetMaximumInGeneratedArray {

    public static int getMaximumGenerated(int n){

        if(n == 0) return 0;
        if(n == 1) return 1;


        int num[] = new int[n+1];

        int max = 1;

        num[0] = 0;
        num[1] = 1;

        for(int i = 2; i<=n; i++){
            if(i%2 == 0 ){
                num[i] = num[i/2];
            }else{
                num[i] = num[i/2] + num[i/2+1];
            }

            max = Math.max(max, num[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println("max :" + getMaximumGenerated(7));
    }
}
