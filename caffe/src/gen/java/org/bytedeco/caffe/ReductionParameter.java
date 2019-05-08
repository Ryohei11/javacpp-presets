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

// -------------------------------------------------------------------

@Namespace("caffe") @NoOffset @Properties(inherit = org.bytedeco.caffe.presets.caffe.class)
public class ReductionParameter extends Message {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ReductionParameter(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ReductionParameter(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ReductionParameter position(long position) {
        return (ReductionParameter)super.position(position);
    }

  public ReductionParameter() { super((Pointer)null); allocate(); }
  private native void allocate();

  public ReductionParameter(@Const @ByRef ReductionParameter from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef ReductionParameter from);

  public native @ByRef @Name("operator =") ReductionParameter put(@Const @ByRef ReductionParameter from);
//   #if LANG_CXX11
//   #endif
  public native @Const @ByRef UnknownFieldSet unknown_fields();
  public native UnknownFieldSet mutable_unknown_fields();

  public static native @Const Descriptor descriptor();
  public static native @Const @ByRef ReductionParameter default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const ReductionParameter internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void Swap(ReductionParameter other);
  

  // implements Message ----------------------------------------------

  public native final ReductionParameter New();

  public native final ReductionParameter New(Arena arena);
  public native final void CopyFrom(@Const @ByRef Message from);
  public native final void MergeFrom(@Const @ByRef Message from);
  public native void CopyFrom(@Const @ByRef ReductionParameter from);
  public native void MergeFrom(@Const @ByRef ReductionParameter from);
  public native final void Clear();
  public native @Cast("bool") final boolean IsInitialized();

  public native @Cast("size_t") final long ByteSizeLong();
//   #if GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
//   #else
  public native @Cast("bool") final boolean MergePartialFromCodedStream(
        CodedInputStream input);
//   #endif  // GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
  public native final void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") final BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") final ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") final byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") byte[] target);
  public native final int GetCachedSize();

  public native @ByVal final Metadata GetMetadata();

  // nested types ----------------------------------------------------
  @MemberGetter public static native @Cast("const caffe::ReductionParameter::ReductionOp") int SUM();
  public static final int SUM = SUM();
  @MemberGetter public static native @Cast("const caffe::ReductionParameter::ReductionOp") int ASUM();
  public static final int ASUM = ASUM();
  @MemberGetter public static native @Cast("const caffe::ReductionParameter::ReductionOp") int SUMSQ();
  public static final int SUMSQ = SUMSQ();
  @MemberGetter public static native @Cast("const caffe::ReductionParameter::ReductionOp") int MEAN();
  public static final int MEAN = MEAN();
  public static native @Cast("bool") boolean ReductionOp_IsValid(int value);
  @MemberGetter public static native @Cast("const caffe::ReductionParameter::ReductionOp") int ReductionOp_MIN();
  public static final int ReductionOp_MIN = ReductionOp_MIN();
  @MemberGetter public static native @Cast("const caffe::ReductionParameter::ReductionOp") int ReductionOp_MAX();
  public static final int ReductionOp_MAX = ReductionOp_MAX();
  @MemberGetter public static native int ReductionOp_ARRAYSIZE();
  public static final int ReductionOp_ARRAYSIZE = ReductionOp_ARRAYSIZE();
  public static native @Const EnumDescriptor ReductionOp_descriptor();
  public static native @StdString BytePointer ReductionOp_Name(@Cast("caffe::ReductionParameter::ReductionOp") int value);
  public static native @Cast("bool") boolean ReductionOp_Parse(@StdString BytePointer name,
        @Cast("caffe::ReductionParameter::ReductionOp*") IntPointer value);
  public static native @Cast("bool") boolean ReductionOp_Parse(@StdString String name,
        @Cast("caffe::ReductionParameter::ReductionOp*") IntBuffer value);
  public static native @Cast("bool") boolean ReductionOp_Parse(@StdString BytePointer name,
        @Cast("caffe::ReductionParameter::ReductionOp*") int[] value);
  public static native @Cast("bool") boolean ReductionOp_Parse(@StdString String name,
        @Cast("caffe::ReductionParameter::ReductionOp*") IntPointer value);
  public static native @Cast("bool") boolean ReductionOp_Parse(@StdString BytePointer name,
        @Cast("caffe::ReductionParameter::ReductionOp*") IntBuffer value);
  public static native @Cast("bool") boolean ReductionOp_Parse(@StdString String name,
        @Cast("caffe::ReductionParameter::ReductionOp*") int[] value);

  // accessors -------------------------------------------------------

  // optional int32 axis = 2 [default = 0];
  public native @Cast("bool") boolean has_axis();
  public native void clear_axis();
  @MemberGetter public static native int kAxisFieldNumber();
  public static final int kAxisFieldNumber = kAxisFieldNumber();
  public native @Cast("google::protobuf::int32") int axis();
  public native void set_axis(@Cast("google::protobuf::int32") int value);

  // optional .caffe.ReductionParameter.ReductionOp operation = 1 [default = SUM];
  public native @Cast("bool") boolean has_operation();
  public native void clear_operation();
  @MemberGetter public static native int kOperationFieldNumber();
  public static final int kOperationFieldNumber = kOperationFieldNumber();
  public native @Cast("caffe::ReductionParameter_ReductionOp") int operation();
  public native void set_operation(@Cast("caffe::ReductionParameter_ReductionOp") int value);

  // optional float coeff = 3 [default = 1];
  public native @Cast("bool") boolean has_coeff();
  public native void clear_coeff();
  @MemberGetter public static native int kCoeffFieldNumber();
  public static final int kCoeffFieldNumber = kCoeffFieldNumber();
  public native float coeff();
  public native void set_coeff(float value);
}
