public class NumberUtils {

    public int getLastDigit(int number) {
        // Write your code here
        if (number<0){
            return -1;
        }
        if (number==0){
            return 0;
        }
        int ultDigito = number %10;
        return ultDigito;
    }
}