import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubscriberFeeTest {

    Subscriber sub = new Subscriber();
    int countOfMinutes;
    int priceForMinute;
    int priceForExtraMinute;

    @Test
    void lessThanLimit() {
        countOfMinutes = 350;
        priceForMinute = 2;
        priceForExtraMinute = 5;
        int expected = 700;
        int actual = sub.feeCost(countOfMinutes, priceForMinute, priceForExtraMinute);
        assertEquals(expected, actual);
    }

    @Test
    void moreThanLimit() {
        countOfMinutes = 723;
        priceForMinute = 3;
        priceForExtraMinute = 7;
        int expected = 3065;
        int actual = sub.feeCost(countOfMinutes, priceForMinute, priceForExtraMinute);
        assertEquals(expected, actual);
    }

    @Test
    void limit() {
        countOfMinutes = 499;
        priceForMinute = 2;
        priceForExtraMinute = 5;
        int expected = 998;
        int actual = sub.feeCost(countOfMinutes, priceForMinute, priceForExtraMinute);
        assertEquals(expected, actual);
    }

    @Test
    void lessThanLimitBy1() {
        countOfMinutes = 498;
        priceForMinute = 5;
        priceForExtraMinute = 6;
        int expected = 2490;
        int actual = sub.feeCost(countOfMinutes, priceForMinute, priceForExtraMinute);
        assertEquals(expected, actual);
    }

    @Test
    void moreThanLimitBy1() {
        countOfMinutes = 500;
        priceForMinute = 2;
        priceForExtraMinute = 6;
        int expected = 1004;
        int actual = sub.feeCost(countOfMinutes, priceForMinute, priceForExtraMinute);
        assertEquals(expected, actual);
    }

    @Test
    void zeroMinutes() {
        countOfMinutes = 0;
        priceForMinute = 2;
        priceForExtraMinute = 4;
        int expected = 0;
        int actual = sub.feeCost(countOfMinutes, priceForMinute, priceForExtraMinute);
        assertEquals(expected, actual);
    }

    @Test
    void samePriceForExtraMinutes() {
        countOfMinutes = 600;
        priceForMinute = 2;
        priceForExtraMinute = 2;
        int expected = 1200;
        int actual = sub.feeCost(countOfMinutes, priceForMinute, priceForExtraMinute);
        assertEquals(expected, actual);
    }


}
