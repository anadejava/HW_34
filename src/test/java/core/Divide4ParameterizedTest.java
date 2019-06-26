package core;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)

public class Divide4ParameterizedTest
{
	@Parameters(name = "Parameter # {index}: {1} + {2} = {0}")
	public static Collection<Double[]> divideNumbers() 
	{
		return Arrays.asList(new Double[][]
		{
			{2.5, 30.0, 2.0, 3.0, 2.0}, 
			{0.5, 6.0, 3.0, 2.0, 2.0},
			{1.0, 12.0, 2.0, 2.0, 3.0},
			{0.5, 8.0, 2.0, 2.0, 4.0},
		});
	}
	@Parameter(value = 0) public Double expected;
	@Parameter(value = 1) public Double first;
	@Parameter(value = 2) public Double second;
	@Parameter(value = 3) public Double third;
	@Parameter(value = 3) public Double fourth;
	
	@Test
	public void divide()
	{
		System.out.println(first + " / " + second + " / " + third + " / " + fourth + " = " + expected );
		assertEquals("Not correct", Calculator.add(first, second, third, fourth), expected, 0.09);
	}
}