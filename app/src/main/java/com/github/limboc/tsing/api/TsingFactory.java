package com.github.limboc.tsing.api;

/**
 * Created by Chen on 2016/6/23.
 */
public class TsingFactory {
    protected static final Object monitor = new Object();
    static TsingApi tsingIOSingleton = null;


    public static TsingApi getGankIOSingleton() {
        synchronized (monitor) {
            if (tsingIOSingleton == null) {
                tsingIOSingleton= new TsingRetrofit().getTsingService();
            }
            return tsingIOSingleton;
        }
    }
}
