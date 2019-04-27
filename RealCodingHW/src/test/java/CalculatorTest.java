import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
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

}