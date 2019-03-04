package main;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class simpleTest {
    private final static Math math = mock(Math.class);


    @Test
    public void testThreeAndTwo() {
    Math math = new Math(3,2);

    int res = math.getSum();
    Assert.assertEquals(5, res);

}
}