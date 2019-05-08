// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


 @Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_ieee_float_rep extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_ieee_float_rep() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_ieee_float_rep(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_ieee_float_rep(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_ieee_float_rep position(long position) {
        return (gsl_ieee_float_rep)super.position(position);
    }

  public native int sign(); public native gsl_ieee_float_rep sign(int setter);
  public native @Cast("char") byte mantissa(int i); public native gsl_ieee_float_rep mantissa(int i, byte setter);
  @MemberGetter public native @Cast("char*") BytePointer mantissa(); /* Actual bits are 0..22, element 23 is \0 */
  public native int exponent(); public native gsl_ieee_float_rep exponent(int setter);
  public native int type(); public native gsl_ieee_float_rep type(int setter);
} 
