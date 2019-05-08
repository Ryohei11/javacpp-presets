// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.onnx.global.onnx.*;

// Defined in helpers.h
@Namespace("google::protobuf::compiler::cpp") @Opaque @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class Formatter extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public Formatter() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Formatter(Pointer p) { super(p); }
}
