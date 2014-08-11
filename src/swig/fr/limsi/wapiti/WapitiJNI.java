/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package fr.limsi.wapiti;

public class WapitiJNI {
  public final static native void opt_s_mode_set(long jarg1, opt_s jarg1_, int jarg2);
  public final static native int opt_s_mode_get(long jarg1, opt_s jarg1_);
  public final static native void opt_s_input_set(long jarg1, opt_s jarg1_, String jarg2);
  public final static native String opt_s_input_get(long jarg1, opt_s jarg1_);
  public final static native void opt_s_output_set(long jarg1, opt_s jarg1_, String jarg2);
  public final static native String opt_s_output_get(long jarg1, opt_s jarg1_);
  public final static native void opt_s_maxent_set(long jarg1, opt_s jarg1_, boolean jarg2);
  public final static native boolean opt_s_maxent_get(long jarg1, opt_s jarg1_);
  public final static native void opt_s_type_set(long jarg1, opt_s jarg1_, String jarg2);
  public final static native String opt_s_type_get(long jarg1, opt_s jarg1_);
  public final static native void opt_s_algo_set(long jarg1, opt_s jarg1_, String jarg2);
  public final static native String opt_s_algo_get(long jarg1, opt_s jarg1_);
  public final static native void opt_s_pattern_set(long jarg1, opt_s jarg1_, String jarg2);
  public final static native String opt_s_pattern_get(long jarg1, opt_s jarg1_);
  public final static native void opt_s_model_set(long jarg1, opt_s jarg1_, String jarg2);
  public final static native String opt_s_model_get(long jarg1, opt_s jarg1_);
  public final static native void opt_s_devel_set(long jarg1, opt_s jarg1_, String jarg2);
  public final static native String opt_s_devel_get(long jarg1, opt_s jarg1_);
  public final static native void opt_s_rstate_set(long jarg1, opt_s jarg1_, String jarg2);
  public final static native String opt_s_rstate_get(long jarg1, opt_s jarg1_);
  public final static native void opt_s_sstate_set(long jarg1, opt_s jarg1_, String jarg2);
  public final static native String opt_s_sstate_get(long jarg1, opt_s jarg1_);
  public final static native void opt_s_compact_set(long jarg1, opt_s jarg1_, boolean jarg2);
  public final static native boolean opt_s_compact_get(long jarg1, opt_s jarg1_);
  public final static native void opt_s_sparse_set(long jarg1, opt_s jarg1_, boolean jarg2);
  public final static native boolean opt_s_sparse_get(long jarg1, opt_s jarg1_);
  public final static native void opt_s_nthread_set(long jarg1, opt_s jarg1_, long jarg2);
  public final static native long opt_s_nthread_get(long jarg1, opt_s jarg1_);
  public final static native void opt_s_jobsize_set(long jarg1, opt_s jarg1_, long jarg2);
  public final static native long opt_s_jobsize_get(long jarg1, opt_s jarg1_);
  public final static native void opt_s_maxiter_set(long jarg1, opt_s jarg1_, long jarg2);
  public final static native long opt_s_maxiter_get(long jarg1, opt_s jarg1_);
  public final static native void opt_s_rho1_set(long jarg1, opt_s jarg1_, double jarg2);
  public final static native double opt_s_rho1_get(long jarg1, opt_s jarg1_);
  public final static native void opt_s_rho2_set(long jarg1, opt_s jarg1_, double jarg2);
  public final static native double opt_s_rho2_get(long jarg1, opt_s jarg1_);
  public final static native void opt_s_objwin_set(long jarg1, opt_s jarg1_, long jarg2);
  public final static native long opt_s_objwin_get(long jarg1, opt_s jarg1_);
  public final static native void opt_s_stopwin_set(long jarg1, opt_s jarg1_, long jarg2);
  public final static native long opt_s_stopwin_get(long jarg1, opt_s jarg1_);
  public final static native void opt_s_stopeps_set(long jarg1, opt_s jarg1_, double jarg2);
  public final static native double opt_s_stopeps_get(long jarg1, opt_s jarg1_);
  public final static native void opt_s_label_set(long jarg1, opt_s jarg1_, boolean jarg2);
  public final static native boolean opt_s_label_get(long jarg1, opt_s jarg1_);
  public final static native void opt_s_check_set(long jarg1, opt_s jarg1_, boolean jarg2);
  public final static native boolean opt_s_check_get(long jarg1, opt_s jarg1_);
  public final static native void opt_s_outsc_set(long jarg1, opt_s jarg1_, boolean jarg2);
  public final static native boolean opt_s_outsc_get(long jarg1, opt_s jarg1_);
  public final static native void opt_s_lblpost_set(long jarg1, opt_s jarg1_, boolean jarg2);
  public final static native boolean opt_s_lblpost_get(long jarg1, opt_s jarg1_);
  public final static native void opt_s_nbest_set(long jarg1, opt_s jarg1_, long jarg2);
  public final static native long opt_s_nbest_get(long jarg1, opt_s jarg1_);
  public final static native void opt_s_force_set(long jarg1, opt_s jarg1_, boolean jarg2);
  public final static native boolean opt_s_force_get(long jarg1, opt_s jarg1_);
  public final static native void opt_s_prec_set(long jarg1, opt_s jarg1_, int jarg2);
  public final static native int opt_s_prec_get(long jarg1, opt_s jarg1_);
  public final static native void opt_s_all_set(long jarg1, opt_s jarg1_, boolean jarg2);
  public final static native boolean opt_s_all_get(long jarg1, opt_s jarg1_);
  public final static native long new_opt_s();
  public final static native void delete_opt_s(long jarg1);
  public final static native long opt_defaults_get();
  public final static native void opt_parse(int jarg1, long jarg2, long jarg3, opt_s jarg3_);
  public final static native long loadModel(String jarg1);
  public final static native int runWapiti(String jarg1);
  public final static native String labelFromModel(long jarg1, String jarg2);
  public final static native void freeModel(long jarg1);
  public final static native void printModelPath(long jarg1);
}
