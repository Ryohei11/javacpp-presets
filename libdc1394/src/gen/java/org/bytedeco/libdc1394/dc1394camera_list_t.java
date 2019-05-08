// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.libdc1394;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.libdc1394.global.dc1394.*;


/**
 * A list of cameras
 *
 * Usually returned by dc1394_camera_eumerate(). 
 */
@Properties(inherit = org.bytedeco.libdc1394.presets.dc1394.class)
public class dc1394camera_list_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public dc1394camera_list_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public dc1394camera_list_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public dc1394camera_list_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public dc1394camera_list_t position(long position) {
        return (dc1394camera_list_t)super.position(position);
    }

    public native @Cast("uint32_t") int num(); public native dc1394camera_list_t num(int setter);
    public native dc1394camera_id_t ids(); public native dc1394camera_list_t ids(dc1394camera_id_t setter);
}
