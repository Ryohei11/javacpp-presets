// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// For the purpose of control flow, every tensor produced by TensorFlow is
// conceptually tagged by a 'FrameAndIter'. FrameAndIter consists of a
// 'frame_id' and an 'iter_id'. The tensor value it represents is produced
// in the frame with frame_id at the iteration of iter_id.
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class FrameAndIter extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FrameAndIter(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FrameAndIter(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public FrameAndIter position(long position) {
        return (FrameAndIter)super.position(position);
    }

  public native @Cast("tensorflow::uint64") long frame_id(); public native FrameAndIter frame_id(long setter);
  public native @Cast("tensorflow::int64") long iter_id(); public native FrameAndIter iter_id(long setter);

  public FrameAndIter() { super((Pointer)null); allocate(); }
  private native void allocate();

  public FrameAndIter(@Cast("tensorflow::uint64") long frame, @Cast("tensorflow::int64") long iter) { super((Pointer)null); allocate(frame, iter); }
  private native void allocate(@Cast("tensorflow::uint64") long frame, @Cast("tensorflow::int64") long iter);

  public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef FrameAndIter other);
}