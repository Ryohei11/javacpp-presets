// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_multifit_robust_workspace extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_multifit_robust_workspace() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_multifit_robust_workspace(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_multifit_robust_workspace(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_multifit_robust_workspace position(long position) {
        return (gsl_multifit_robust_workspace)super.position(position);
    }

  public native @Cast("size_t") long n(); public native gsl_multifit_robust_workspace n(long setter);            /* number of observations */
  public native @Cast("size_t") long p(); public native gsl_multifit_robust_workspace p(long setter);            /* number of parameters */
  public native @Cast("size_t") long numit(); public native gsl_multifit_robust_workspace numit(long setter);        /* number of iterations */
  public native @Cast("size_t") long maxiter(); public native gsl_multifit_robust_workspace maxiter(long setter);      /* maximum iterations */
  @MemberGetter public native @Const gsl_multifit_robust_type type();
  public native double tune(); public native gsl_multifit_robust_workspace tune(double setter);         /* tuning parameter */

  public native gsl_vector r(); public native gsl_multifit_robust_workspace r(gsl_vector setter);       /* residuals at current iteration */
  public native gsl_vector weights(); public native gsl_multifit_robust_workspace weights(gsl_vector setter); /* weights at current iteration */
  public native gsl_vector c_prev(); public native gsl_multifit_robust_workspace c_prev(gsl_vector setter);  /* coefficients from previous iteration */
  public native gsl_vector resfac(); public native gsl_multifit_robust_workspace resfac(gsl_vector setter);  /* multiplicative factors for residuals */

  public native gsl_vector psi(); public native gsl_multifit_robust_workspace psi(gsl_vector setter);     /* psi(r) */
  public native gsl_vector dpsi(); public native gsl_multifit_robust_workspace dpsi(gsl_vector setter);    /* psi'(r) */

  public native gsl_matrix QSI(); public native gsl_multifit_robust_workspace QSI(gsl_matrix setter);     /* Q S^{-1} of original matrix X */
  public native gsl_vector D(); public native gsl_multifit_robust_workspace D(gsl_vector setter);       /* balancing parameters of original matrix X */

  public native gsl_vector workn(); public native gsl_multifit_robust_workspace workn(gsl_vector setter);   /* workspace of length n */

  public native @ByRef gsl_multifit_robust_stats stats(); public native gsl_multifit_robust_workspace stats(gsl_multifit_robust_stats setter); /* various statistics */

  public native gsl_multifit_linear_workspace multifit_p(); public native gsl_multifit_robust_workspace multifit_p(gsl_multifit_linear_workspace setter);
}
