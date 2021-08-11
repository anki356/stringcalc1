package testadd;

import static org.junit.Assert.*;

import org.junit.Test;
public class TestStringCalculator {
    public static void main(String[] args) {
    org.junit.runner.JUnitCore.main("testadd.TestStringCalculator");	
    }
	@Test
	public void testOneNum() {
		assertEquals(1,StringCalculator.Add("1"));
			}
	@Test
	public void testtwonum() {
		assertEquals(3,StringCalculator.Add("1,2"));
			}
	@Test
	public void testthreenum() {
		assertEquals(6,StringCalculator.Add("1,2,3"));
			}
	@Test
	public void testnewline() {
		assertEquals(6,StringCalculator.Add("1\n2,3"));
			}
	@Test
	public void testneg() {
		try {
			StringCalculator.Add("-1,2");
			}
		catch(IllegalArgumentException e) {
			assertEquals(e.getMessage(),"Negatives not allowed:-1");
		}
		try {
			StringCalculator.Add("2,-4,3,-5");
			}
		catch(IllegalArgumentException e) {
			assertEquals(e.getMessage(),"Negatives not allowed:-4,-5");
		}
		}
	@Test
	public void testoverthou() {
		assertEquals(2,StringCalculator.Add("1000,2"));
			}
	public void testoother() {
		assertEquals(2,StringCalculator.Add("//;\n1;2"));
			}


}
