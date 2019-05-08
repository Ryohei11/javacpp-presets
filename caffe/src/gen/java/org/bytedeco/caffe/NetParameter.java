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
public class NetParameter extends Message {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NetParameter(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NetParameter(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public NetParameter position(long position) {
        return (NetParameter)super.position(position);
    }

  public NetParameter() { super((Pointer)null); allocate(); }
  private native void allocate();

  public NetParameter(@Const @ByRef NetParameter from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef NetParameter from);

  public native @ByRef @Name("operator =") NetParameter put(@Const @ByRef NetParameter from);
//   #if LANG_CXX11
//   #endif
  public native @Const @ByRef UnknownFieldSet unknown_fields();
  public native UnknownFieldSet mutable_unknown_fields();

  public static native @Const Descriptor descriptor();
  public static native @Const @ByRef NetParameter default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const NetParameter internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void Swap(NetParameter other);
  

  // implements Message ----------------------------------------------

  public native final NetParameter New();

  public native final NetParameter New(Arena arena);
  public native final void CopyFrom(@Const @ByRef Message from);
  public native final void MergeFrom(@Const @ByRef Message from);
  public native void CopyFrom(@Const @ByRef NetParameter from);
  public native void MergeFrom(@Const @ByRef NetParameter from);
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

  // accessors -------------------------------------------------------

  // repeated .caffe.V1LayerParameter layers = 2;
  public native int layers_size();
  public native void clear_layers();
  @MemberGetter public static native int kLayersFieldNumber();
  public static final int kLayersFieldNumber = kLayersFieldNumber();
  public native V1LayerParameter mutable_layers(int index);
  public native @Const @ByRef V1LayerParameter layers(int index);
  public native V1LayerParameter add_layers();

  // repeated string input = 3;
  public native int input_size();
  public native void clear_input();
  @MemberGetter public static native int kInputFieldNumber();
  public static final int kInputFieldNumber = kInputFieldNumber();
  public native @StdString BytePointer input(int index);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_input(int index);
  public native void set_input(int index, @StdString BytePointer value);
  public native void set_input(int index, @StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_input(int index, @Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_input(int index, String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer add_input();
  public native void add_input(@StdString BytePointer value);
  public native void add_input(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void add_input(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void add_input(String value, @Cast("size_t") long size);

  // repeated int32 input_dim = 4;
  public native int input_dim_size();
  public native void clear_input_dim();
  @MemberGetter public static native int kInputDimFieldNumber();
  public static final int kInputDimFieldNumber = kInputDimFieldNumber();
  public native @Cast("google::protobuf::int32") int input_dim(int index);
  public native void set_input_dim(int index, @Cast("google::protobuf::int32") int value);
  public native void add_input_dim(@Cast("google::protobuf::int32") int value);

  // repeated .caffe.BlobShape input_shape = 8;
  public native int input_shape_size();
  public native void clear_input_shape();
  @MemberGetter public static native int kInputShapeFieldNumber();
  public static final int kInputShapeFieldNumber = kInputShapeFieldNumber();
  public native BlobShape mutable_input_shape(int index);
  public native @Const @ByRef BlobShape input_shape(int index);
  public native BlobShape add_input_shape();

  // repeated .caffe.LayerParameter layer = 100;
  public native int layer_size();
  public native void clear_layer();
  @MemberGetter public static native int kLayerFieldNumber();
  public static final int kLayerFieldNumber = kLayerFieldNumber();
  public native LayerParameter mutable_layer(int index);
  public native @Const @ByRef LayerParameter layer(int index);
  public native LayerParameter add_layer();

  // optional string name = 1;
  public native @Cast("bool") boolean has_name();
  public native void clear_name();
  @MemberGetter public static native int kNameFieldNumber();
  public static final int kNameFieldNumber = kNameFieldNumber();
  public native @StdString BytePointer name();
  public native void set_name(@StdString BytePointer value);
  public native void set_name(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_name(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_name(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_name();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_name();
  public native void set_allocated_name(@StdString @Cast({"char*", "std::string*"}) BytePointer name);

  // optional .caffe.NetState state = 6;
  public native @Cast("bool") boolean has_state();
  public native void clear_state();
  @MemberGetter public static native int kStateFieldNumber();
  public static final int kStateFieldNumber = kStateFieldNumber();
  public native @Const @ByRef NetState state();
  public native NetState release_state();
  public native NetState mutable_state();
  public native void set_allocated_state(NetState state);

  // optional bool force_backward = 5 [default = false];
  public native @Cast("bool") boolean has_force_backward();
  public native void clear_force_backward();
  @MemberGetter public static native int kForceBackwardFieldNumber();
  public static final int kForceBackwardFieldNumber = kForceBackwardFieldNumber();
  public native @Cast("bool") boolean force_backward();
  public native void set_force_backward(@Cast("bool") boolean value);

  // optional bool debug_info = 7 [default = false];
  public native @Cast("bool") boolean has_debug_info();
  public native void clear_debug_info();
  @MemberGetter public static native int kDebugInfoFieldNumber();
  public static final int kDebugInfoFieldNumber = kDebugInfoFieldNumber();
  public native @Cast("bool") boolean debug_info();
  public native void set_debug_info(@Cast("bool") boolean value);
}
