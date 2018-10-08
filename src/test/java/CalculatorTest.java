import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void addTest(){

        //Given
        Calculator calculator = new Calculator();
        double expect = 5;


        //When
        double actual = calculator.add(2, 3);

        //Then

        Assert.assertEquals(expect,actual, 0);
    }

    @Test
    public void subtractTest(){
        //when
        Calculator calculator = new Calculator();
        double expect = 1;

        //when
        double actual = calculator.subtract(3, 2);

        //then
        Assert.assertEquals(expect, actual, 0);
    }

    @Test
    public void squareTest(){
        Calculator calculator = new Calculator();
        double expect = 25;

        double actual = calculator.square(5);

        Assert.assertEquals(expect, actual, 0);
    }

    @Test
    public void squareRootTest(){
        Calculator calculator = new Calculator();
        double expect = 5;

        double actual = calculator.squareRoot(25);

        Assert.assertEquals(expect, actual, 0);
    }

    @Test
    public void exponentTest(){
        Calculator calculator = new Calculator();
        double expect = 125;

        double actual = calculator.exponent(5, 3);

        Assert.assertEquals(expect, actual, 0);
    }

    @Test
    public void sinTest(){
        Calculator calculator = new Calculator();
        double expect = 0.84;

        double actusl = calculator.sin(1);

        Assert.assertEquals(expect, actusl, 1);
    }
}
