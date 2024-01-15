import org.junit.*;
import static org.junit.Assert.assertEquals;
import software.ulpgc.kata6.FriendOrPerfect;

public class TDD_Tests {
    FriendOrPerfect friendOrPerfect = new FriendOrPerfect();

    @Test
    public void should_return_no_friend_given_number_with_no_friend() {
        assertEquals("Number has no friends", friendOrPerfect.find(3));
    }

    @Test
    public void should_return_friend_given_number_with_friend() {
        assertEquals("284", friendOrPerfect.find(220));
    }

    @Test
    public void should_return_friend_given_number_with_friend_2() {
        assertEquals("220", friendOrPerfect.find(284));
    }

    @Test
    public void should_return_perfect_given_perfect_number() {
        assertEquals("Number is perfect", friendOrPerfect.find(6));
    }

    @Test
    public void should_return_perfect_given_perfect_number_2() {
        assertEquals("Number is perfect", friendOrPerfect.find(28));
    }
}
