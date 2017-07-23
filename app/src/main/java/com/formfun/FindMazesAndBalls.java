package com.formfun;

import org.opencv.core.Mat;

public class FindMazesAndBalls {

    private long selfAddr;

    static {
        System.loadLibrary("process");
    }

    /**
     * makes jni call to create c++ reference
     */

    FindMazesAndBalls(int screenwidth, int screenheight, int matwidth, int matheight)
    {
        selfAddr = newSelf(screenwidth, screenheight, matwidth, matheight); //jni call to create c++ reference and returns address
    }

    /**
     * makes jni call to delete c++ reference
     */

    void delete()
    {
        deleteSelf(selfAddr);//jni call to delete c++ reference
        selfAddr = 0;//set address to 0
    }

    @Override
    protected void finalize() throws Throwable {
        delete();
    }

    /**
     * return address of c++ reference
     */
    long getselfAddr() {

        return selfAddr; //return address
    }

    /**
     * //makes jni call to proces frames
     */

    void apply(final Mat src) {
        run(selfAddr, src.getNativeObjAddr());//jni call to proces frames
    }

    boolean foundbothlineandball()
    {
        return foundbothlineandball( selfAddr);
    }

    private static native long newSelf(int screenwidth,int screenheight,int matwidth, int matheight);
    private static native void deleteSelf(long selfAddr);
    private static native void run(long selfAddr, long srcAddr);
    private static native boolean foundbothlineandball(long selfAddr);

}