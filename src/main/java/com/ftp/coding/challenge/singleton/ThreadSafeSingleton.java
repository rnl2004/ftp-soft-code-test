package com.ftp.coding.challenge.singleton;

import java.util.logging.Logger;

public class ThreadSafeSingleton {
    private static final Logger logger = Logger.getLogger("ThreadSafeSingleton");
    private static ThreadSafeSingleton instance;

    /** This should private to avoid instantiating the class */
    private ThreadSafeSingleton() {}

    /** This is a thread-safe singleton */
    public static synchronized ThreadSafeSingleton getGetInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
            logger.info("New instance of ThreadSafeSingleton created");
        }
        return instance;
    }
}
