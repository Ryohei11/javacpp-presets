// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.caffe;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.hdf5.*;
import static org.bytedeco.hdf5.global.hdf5.*;

import static org.bytedeco.caffe.global.caffe.*;


@Namespace("google::protobuf::internal") @Properties(inherit = org.bytedeco.caffe.presets.caffe.class)
public class BoundedZCIS extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public BoundedZCIS() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BoundedZCIS(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BoundedZCIS(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public BoundedZCIS position(long position) {
        return (BoundedZCIS)super.position(position);
    }

  public native ZeroCopyInputStream zcis(); public native BoundedZCIS zcis(ZeroCopyInputStream setter);
  public native @Name("limit") int _limit(); public native BoundedZCIS _limit(int setter);
}
