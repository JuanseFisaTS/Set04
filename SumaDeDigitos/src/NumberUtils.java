public class NumberUtils {

    public int getSumOfDigits(int number) {
        // Write your code here
        if (number <0 ){
            return -1;
        }
        if (number == 0){
            return 0;
        }
         int sum = 0;
         int control = 0;
         while (number>0){
             sum = sum + number%10;
             number = number /10;
         }
        return sum;
    }
}