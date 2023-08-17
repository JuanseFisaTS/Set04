public class FactorialCalculator {

    public int calculateFactorial(int number) {
        // Write your code here
        int factorial = 1;
        int control = number;
        if (number<0){
            return -1;        
        }
                for (int i = 2; i <= number; i++) {
            
            factorial *= i;
        }
        

        return factorial;
    }
       
    }
