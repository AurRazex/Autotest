package Unit_Test.Lesson1;

public class Calculator {

    public static double calculateDiscount(double purchaseAmount, int discountAmount) {

        double amountTemp;
        double discountedAmount;

        if (purchaseAmount <= 0){
            throw new ArithmeticException("The purchase amount cannot be less than or equal to zero");

        } else if (discountAmount < 0){
            throw new ArithmeticException("The discount amount cannot be less than zero");

        } else if (discountAmount > 100){
            throw new ArithmeticException("The discount amount cannot be higher than to 100");

        }

        amountTemp = purchaseAmount - ((purchaseAmount / 100) * discountAmount);
        discountedAmount = Math.round(amountTemp * 100D) / 100D;
        return discountedAmount;
    }

}