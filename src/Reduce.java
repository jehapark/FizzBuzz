public class Reduce {
    public static void main(String[] args) {
        System.out.println(doReduceCount(100));
    }

    public static int doReduceCount(int i) {
        int reductionSoFar = 0;
        while (i != 0){
            if (i % 2 == 0){
                i = i / 2;
            } else{
                i = i - 1;
            }
            reductionSoFar++;
        }
        return reductionSoFar;
    }
}



