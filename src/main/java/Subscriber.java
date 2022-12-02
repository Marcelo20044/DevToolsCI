public class Subscriber {

    int feeCost(int countOfMinutes, int priceForMinute, int priceForExtraMinute){
        int totalPrice;

        if (countOfMinutes <= 499) {
            totalPrice = countOfMinutes * priceForMinute;
        } else {
            totalPrice = (priceForMinute * 499) + (priceForExtraMinute * (countOfMinutes - 499));
        }

        return totalPrice;
    }
}
