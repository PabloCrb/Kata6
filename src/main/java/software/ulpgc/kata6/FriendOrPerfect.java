package software.ulpgc.kata6;
import java.util.stream.IntStream;

public class FriendOrPerfect {
    public String find(int number) {

        int potentialFriend = IntStream.rangeClosed(1, number/2)
                .filter(num -> isDivisor(number, num))
                .sum();

        int checkFriend = IntStream.rangeClosed(1, potentialFriend/2)
                .filter(num -> isDivisor(potentialFriend, num))
                .sum();

        if (potentialFriend == number) return "Number is perfect";
        return checkFriend == number ? "" + potentialFriend : "Number has no friends";
    }
    public boolean isDivisor(int number, int potentialDivisor) {
        return number % potentialDivisor == 0;
    }
}
