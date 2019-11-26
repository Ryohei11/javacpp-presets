// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Extracts the average sparse gradient in a SparseConditionalAccumulator.
 * 
 *  The op will blocks until sufficient (i.e., more than num_required)
 *  gradients have been accumulated. If the accumulator has already
 *  aggregated more than num_required gradients, it will return its
 *  average of the accumulated gradients.  Also automatically increments
 *  the recorded global_step in the accumulator by 1, and resets the
 *  aggregate to 0.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * handle: The handle to a SparseConditionalAccumulator.
 *  * num_required: Number of gradients required before we return an aggregate.
 *  * dtype: The data type of accumulated gradients. Needs to correspond to the type
 *  of the accumulator.
 * 
 *  Returns:
 *  * {@code Output} indices: Indices of the average of the accumulated sparse gradients.
 *  * {@code Output} values: Values of the average of the accumulated sparse gradients.
 *  * {@code Output} shape: Shape of the average of the accumulated sparse gradients. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class SparseAccumulatorTakeGradient extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SparseAccumulatorTakeGradient(Pointer p) { super(p); }

  public SparseAccumulatorTakeGradient(@Const @ByRef Scope scope,
                                @ByVal Input handle, @ByVal Input num_required, @Cast("tensorflow::DataType") int dtype) { super((Pointer)null); allocate(scope, handle, num_required, dtype); }
  private native void allocate(@Const @ByRef Scope scope,
                                @ByVal Input handle, @ByVal Input num_required, @Cast("tensorflow::DataType") int dtype);

  public native @ByRef Operation operation(); public native SparseAccumulatorTakeGradient operation(Operation setter);
  public native @ByRef Output indices(); public native SparseAccumulatorTakeGradient indices(Output setter);
  public native @ByRef Output values(); public native SparseAccumulatorTakeGradient values(Output setter);
  public native @ByRef Output shape(); public native SparseAccumulatorTakeGradient shape(Output setter);
}