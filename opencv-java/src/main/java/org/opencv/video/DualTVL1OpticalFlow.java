package org.opencv.video;

// C++: class DualTVL1OpticalFlow
//javadoc: DualTVL1OpticalFlow
public class DualTVL1OpticalFlow extends DenseOpticalFlow {

    DualTVL1OpticalFlow(long addr) { super(addr); }


    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        delete(nativeObj);
    }

    // native support for java finalize()
    private static native void delete(long nativeObj);

}