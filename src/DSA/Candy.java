package DSA;

public class Candy {
    public static int candy(int[] reviews){
        if(reviews == null || reviews.length == 0){
            return 0;
        }
        int N = reviews.length;
        int[] candies = new int[N];
        candies[0] = 1;
        for (int i = 1; i < reviews.length; i++){
            if (reviews[i] > reviews[i-1]){
                candies[i] = candies[i-1] + 1;
            }
            else {
                candies[i] = 1;
            }
        }
        int result = 0;
        for (int i = reviews.length-2; i >= 0; i--){
            if(reviews[i] > reviews[i+1]){
                candies[i] = Math.max(candies[i], candies[i+1]+1);
            }
        }
        for(int all : candies){
            result += all;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] reviews = {1,0,2};
        System.out.println(candy(reviews));
    }
}
