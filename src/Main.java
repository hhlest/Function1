import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Integer[] ar = new Integer[]{5,6,7,8,9,10};
        Predicate<Integer> prInt = a -> isPrime(a);
        Function<Integer[], Integer> funInt = (a) -> countPrimeNumbers(a, prInt);
        System.out.println(funInt.apply(ar));
    }

    public static Integer countPrimeNumbers(Integer[] ar, Predicate<Integer> pr) {
        int counter = 0;
        for (int i = 0; i < ar.length ; i++) {
            if(pr.test(ar[i])) {
                counter++;
            }
        }
        return counter;
    }

    public static boolean isPrime(Integer n) {
        for (int i = 2; i < n; i++) {
            if((n % i) == 0) {
                return false;
            }
        }
        return true;
    }
}
