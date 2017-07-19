import org.junit.Test;
import org.junit.Assert;

public class OperationsTest {
    @Test //this is an annotation ie: a hook and we are trying to hook into junit
    public void testAdd() throws Exception { // testAdd is method, () is parameters, action to "throw" an exception - is bubbling up the problem of dealing with this.
        Assert.assertEquals(2, Operations.add(1, 1)); //assertion is stating what we believe to be a fact, if this is false program will fail.  
    } //Assert.assertEquals is the method, a static method. Operations.add is a method

    @Test
    public void testSubtract() throws Exception {
        Assert.assertEquals(0, Operations.subtract(1, 1));
    }

    @Test
    public void testMultiply() throws Exception {
        Assert.assertEquals(4, Operations.multiply(2, 2));
    }
    @Test
    public void testDivide() throws Exception { //throwing exception is not mandatory for all test cases.
		double expected = 2.0;
		Assert.assertEquals(expected,Operations.divide(4, 2), 0.0);
	}
}