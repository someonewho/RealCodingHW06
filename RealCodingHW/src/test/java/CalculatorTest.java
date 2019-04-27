import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.number.OrderingComparison.greaterThanOrEqualTo;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class CalculatorTest {
    Calculator calculator = new Calculator();
    @Before
    public void setUp() {
        Calculator calculator = new Calculator();
    }
    @Test
    public void setResult()  {
        calculator.getResult();
        assertThat(calculator.getResult(), is(0));
    }
    @Test
    public void caladd()    {
        calculator.add(2500, 500);
        assertThat(calculator.getResult(), is(3000));

    }
    @Test
    public void callingResultAtLeastOne()    {
        Calculator calculator = mock(Calculator.class);
        calculator.getResult();
        verify(calculator, atLeastOnce()).getResult();

    }
    //==================================   Money  ==========================================
    @Test
    public void won_Dollar(){  // 원은 몇 달러인가?
        calculator.wonToDollar();
        assertThat(calculator.getDollar(), equalTo(calculator.getWon() / 1200) );
    }

    @Test
    public void won_Pound(){
        calculator.wonToPound();
        assertThat(calculator.getPound(), Matchers.is(calculator.getWon() / 1500) );
    }

    @Test
    public void won_Yen(){
        calculator.wonToYen();
        assertEquals(calculator.getYen(),(calculator.getWon() / 10));
    }

    //빼기(음수가 나오지 않는 빼기 임으로 결과 값이 0보다 큰지 확인)
    @Test
    public void checkUSub(){
        Calculator calculator = new Calculator();
        calculator.unSignedSub(5000, 3000);
        greaterThanOrEqualTo(0);
    }

    //빼기(음수가 나오지 않는 빼기에서 결과 값이 맞게 작동하는지 확인)
    @Test
    public void checkResultOfUSub(){
        Calculator calculator = new Calculator();
        calculator.unSignedSub(3000, 5000);
        assertEquals(2000, calculator.getResult());
    }

    //signed빼기 함수 확인
    @Test
    public void checkSub(){
        Calculator calculator = new Calculator();
        calculator.sub(3000, 5000);
        assertEquals(-2000, calculator.getResult());
    }


}