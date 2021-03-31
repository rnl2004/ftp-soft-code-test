package com.ftp.coding.challenge;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.ftp.coding.challenge.singleton.ThreadSafeSingleton;
import org.junit.Test;

public class ThreadSafeSingletonTest {

    @Test
    public void testThreadSafeSingletonClass() {
        ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getGetInstance();

        /** Asserting if the class is an instance of ThreadSafeSingleton class */
        assertTrue(threadSafeSingleton instanceof ThreadSafeSingleton);

        /** Asserting if the class is returning null */
        assertFalse(threadSafeSingleton == null);
    }
}
