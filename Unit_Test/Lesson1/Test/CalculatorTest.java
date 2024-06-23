import Unit_Test.Lesson1.Calculator;
import org.assertj.core.api.Assertions;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    public static void main(String[] args) {

        testCalculateDiscountByBasicFunctionality();
        testCalculateDiscountByPurchaseAmountLessThanZero();
        testCalculateDiscountByPurchaseAmountEqualToZeroZero();
        testCalculateDiscountByDiscountAmountLessThanZero();
        testCalculateDiscountByDiscountAmountMoreThanOneHundredPercent();
    }


    public static void testCalculateDiscountByBasicFunctionality(){

        Assertions.assertThat(Calculator.calculateDiscount(122.33, 3)).isEqualTo(118.66);
        System.out.println("Сумма к оплате с учетом скидки " + Calculator.calculateDiscount(122.33,3));
    }


    public static void testCalculateDiscountByPurchaseAmountLessThanZero(){

        assertThatThrownBy(() -> Calculator.calculateDiscount(-1.00, 25))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("The purchase amount cannot be less than or equal to zero");
    }


    public static void testCalculateDiscountByPurchaseAmountEqualToZeroZero(){

        assertThatThrownBy(() -> Calculator.calculateDiscount(0, 25))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("The purchase amount cannot be less than or equal to zero");
    }


    public static void testCalculateDiscountByDiscountAmountLessThanZero(){

        assertThatThrownBy(() -> Calculator.calculateDiscount(100.00, -25))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("The discount amount cannot be less than zero");
    }


    public static void testCalculateDiscountByDiscountAmountMoreThanOneHundredPercent(){

        assertThatThrownBy(() -> Calculator.calculateDiscount(100.00, 101))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("The discount amount cannot be higher than to 100");
    }
}