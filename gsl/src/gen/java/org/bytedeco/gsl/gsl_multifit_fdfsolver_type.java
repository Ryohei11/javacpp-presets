// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_multifit_fdfsolver_type extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_multifit_fdfsolver_type() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_multifit_fdfsolver_type(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_multifit_fdfsolver_type(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_multifit_fdfsolver_type position(long position) {
        return (gsl_multifit_fdfsolver_type)super.position(position);
    }

    @MemberGetter public native @Cast("const char*") BytePointer name();
    public native @Cast("size_t") long size(); public native gsl_multifit_fdfsolver_type size(long setter);
    public static class Alloc_Pointer_long_long extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Alloc_Pointer_long_long(Pointer p) { super(p); }
        protected Alloc_Pointer_long_long() { allocate(); }
        private native void allocate();
        public native int call(Pointer state, @Cast("size_t") long n, @Cast("size_t") long p);
    }
    public native Alloc_Pointer_long_long alloc(); public native gsl_multifit_fdfsolver_type alloc(Alloc_Pointer_long_long setter);
    public static class Set_Pointer_gsl_vector_gsl_multifit_function_fdf_gsl_vector_gsl_vector_gsl_vector extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Set_Pointer_gsl_vector_gsl_multifit_function_fdf_gsl_vector_gsl_vector_gsl_vector(Pointer p) { super(p); }
        protected Set_Pointer_gsl_vector_gsl_multifit_function_fdf_gsl_vector_gsl_vector_gsl_vector() { allocate(); }
        private native void allocate();
        public native int call(Pointer state, @Const gsl_vector wts,
                    gsl_multifit_function_fdf fdf, gsl_vector x,
                    gsl_vector f, gsl_vector dx);
    }
    public native Set_Pointer_gsl_vector_gsl_multifit_function_fdf_gsl_vector_gsl_vector_gsl_vector set(); public native gsl_multifit_fdfsolver_type set(Set_Pointer_gsl_vector_gsl_multifit_function_fdf_gsl_vector_gsl_vector_gsl_vector setter);
    public static class Iterate_Pointer_gsl_vector_gsl_multifit_function_fdf_gsl_vector_gsl_vector_gsl_vector extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Iterate_Pointer_gsl_vector_gsl_multifit_function_fdf_gsl_vector_gsl_vector_gsl_vector(Pointer p) { super(p); }
        protected Iterate_Pointer_gsl_vector_gsl_multifit_function_fdf_gsl_vector_gsl_vector_gsl_vector() { allocate(); }
        private native void allocate();
        public native int call(Pointer state, @Const gsl_vector wts,
                        gsl_multifit_function_fdf fdf, gsl_vector x,
                        gsl_vector f, gsl_vector dx);
    }
    public native Iterate_Pointer_gsl_vector_gsl_multifit_function_fdf_gsl_vector_gsl_vector_gsl_vector iterate(); public native gsl_multifit_fdfsolver_type iterate(Iterate_Pointer_gsl_vector_gsl_multifit_function_fdf_gsl_vector_gsl_vector_gsl_vector setter);
    public static class Gradient_Pointer_gsl_vector extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Gradient_Pointer_gsl_vector(Pointer p) { super(p); }
        protected Gradient_Pointer_gsl_vector() { allocate(); }
        private native void allocate();
        public native int call(Pointer state, gsl_vector g);
    }
    public native Gradient_Pointer_gsl_vector gradient(); public native gsl_multifit_fdfsolver_type gradient(Gradient_Pointer_gsl_vector setter);
    public static class Jac_Pointer_gsl_matrix extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Jac_Pointer_gsl_matrix(Pointer p) { super(p); }
        protected Jac_Pointer_gsl_matrix() { allocate(); }
        private native void allocate();
        public native int call(Pointer state, gsl_matrix J);
    }
    public native Jac_Pointer_gsl_matrix jac(); public native gsl_multifit_fdfsolver_type jac(Jac_Pointer_gsl_matrix setter);
    public static class Free_Pointer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Free_Pointer(Pointer p) { super(p); }
        protected Free_Pointer() { allocate(); }
        private native void allocate();
        public native void call(Pointer state);
    }
    public native Free_Pointer free(); public native gsl_multifit_fdfsolver_type free(Free_Pointer setter);
  }
