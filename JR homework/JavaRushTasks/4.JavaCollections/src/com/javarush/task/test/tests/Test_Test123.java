package com.javarush.task.test.tests;

import com.javarush.task.test.Test123;
import org.junit.Assert;
import org.junit.Test;

public class Test_Test123 {
    @Test
    public void test_reverse() {
        String s1 = "abc";
        String s2 = Test123.reverse("abc");
        String s3 = "cba1";

        Assert.assertEquals(s2, s3);
        Assert.assertNotEquals(s1 , s3);

    }

    @Test
    public void testCalc() {
        Test123 t = new Test123();
        Assert.assertEquals("5 x 10 must be 50",50, t.calA(5,10));
    }
}
