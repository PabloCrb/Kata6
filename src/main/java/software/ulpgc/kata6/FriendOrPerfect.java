package software.ulpgc.kata6;
import java.util.stream.IntStream;

public class FriendOrPerfect {
    public String find(int number) {

        int potentialFriend = IntStream.range(1, number)
                .filter(num -> isDivisor(number, num))
                .sum();

        int checkFriend = IntStream.range(1, potentialFriend)
                .filter(num -> isDivisor(potentialFriend, num))
                .sum();

        if (potentialFriend == number) return "Number is perfect";
        return checkFriend == number ? "" + potentialFriend : "Number has no friends";
    }
    public boolean isDivisor(int number, int potentialDivisor) {
        return number % potentialDivisor == 0;
    }
}
