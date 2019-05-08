// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpu_features;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cpu_features.global.cpu_features.*;


@Namespace("cpu_features") @Properties(inherit = org.bytedeco.cpu_features.presets.cpu_features.class)
public class Aarch64Features extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Aarch64Features() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Aarch64Features(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Aarch64Features(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public Aarch64Features position(long position) {
        return (Aarch64Features)super.position(position);
    }

  public native @NoOffset int fp(); public native Aarch64Features fp(int setter);     // Floating-point.
  public native @NoOffset int asimd(); public native Aarch64Features asimd(int setter);  // Advanced SIMD.
  public native @NoOffset int aes(); public native Aarch64Features aes(int setter);    // Hardware-accelerated Advanced Encryption Standard.
  public native @NoOffset int pmull(); public native Aarch64Features pmull(int setter);  // Polynomial multiply long.
  public native @NoOffset int sha1(); public native Aarch64Features sha1(int setter);   // Hardware-accelerated SHA1.
  public native @NoOffset int sha2(); public native Aarch64Features sha2(int setter);   // Hardware-accelerated SHA2-256.
  public native @NoOffset int crc32(); public native Aarch64Features crc32(int setter);  // Hardware-accelerated CRC-32.

  // Make sure to update Aarch64FeaturesEnum below if you add a field here.
}
