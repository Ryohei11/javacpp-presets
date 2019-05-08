// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_eigen_symmv_workspace extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_eigen_symmv_workspace() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_eigen_symmv_workspace(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_eigen_symmv_workspace(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_eigen_symmv_workspace position(long position) {
        return (gsl_eigen_symmv_workspace)super.position(position);
    }

  public native @Cast("size_t") long size(); public native gsl_eigen_symmv_workspace size(long setter);
  public native DoublePointer d(); public native gsl_eigen_symmv_workspace d(DoublePointer setter);
  public native DoublePointer sd(); public native gsl_eigen_symmv_workspace sd(DoublePointer setter);
  public native DoublePointer gc(); public native gsl_eigen_symmv_workspace gc(DoublePointer setter);
  public native DoublePointer gs(); public native gsl_eigen_symmv_workspace gs(DoublePointer setter);
}
