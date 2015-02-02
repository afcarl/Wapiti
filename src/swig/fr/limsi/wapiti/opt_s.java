/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package fr.limsi.wapiti;

public class opt_s {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected opt_s(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(opt_s obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        WapitiJNI.delete_opt_s(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setMode(int value) {
    WapitiJNI.opt_s_mode_set(swigCPtr, this, value);
  }

  public int getMode() {
    return WapitiJNI.opt_s_mode_get(swigCPtr, this);
  }

  public void setInput(String value) {
    WapitiJNI.opt_s_input_set(swigCPtr, this, value);
  }

  public String getInput() {
    return WapitiJNI.opt_s_input_get(swigCPtr, this);
  }

  public void setOutput(String value) {
    WapitiJNI.opt_s_output_set(swigCPtr, this, value);
  }

  public String getOutput() {
    return WapitiJNI.opt_s_output_get(swigCPtr, this);
  }

  public void setMaxent(boolean value) {
    WapitiJNI.opt_s_maxent_set(swigCPtr, this, value);
  }

  public boolean getMaxent() {
    return WapitiJNI.opt_s_maxent_get(swigCPtr, this);
  }

  public void setType(String value) {
    WapitiJNI.opt_s_type_set(swigCPtr, this, value);
  }

  public String getType() {
    return WapitiJNI.opt_s_type_get(swigCPtr, this);
  }

  public void setAlgo(String value) {
    WapitiJNI.opt_s_algo_set(swigCPtr, this, value);
  }

  public String getAlgo() {
    return WapitiJNI.opt_s_algo_get(swigCPtr, this);
  }

  public void setPattern(String value) {
    WapitiJNI.opt_s_pattern_set(swigCPtr, this, value);
  }

  public String getPattern() {
    return WapitiJNI.opt_s_pattern_get(swigCPtr, this);
  }

  public void setModel(String value) {
    WapitiJNI.opt_s_model_set(swigCPtr, this, value);
  }

  public String getModel() {
    return WapitiJNI.opt_s_model_get(swigCPtr, this);
  }

  public void setDevel(String value) {
    WapitiJNI.opt_s_devel_set(swigCPtr, this, value);
  }

  public String getDevel() {
    return WapitiJNI.opt_s_devel_get(swigCPtr, this);
  }

  public void setRstate(String value) {
    WapitiJNI.opt_s_rstate_set(swigCPtr, this, value);
  }

  public String getRstate() {
    return WapitiJNI.opt_s_rstate_get(swigCPtr, this);
  }

  public void setSstate(String value) {
    WapitiJNI.opt_s_sstate_set(swigCPtr, this, value);
  }

  public String getSstate() {
    return WapitiJNI.opt_s_sstate_get(swigCPtr, this);
  }

  public void setCompact(boolean value) {
    WapitiJNI.opt_s_compact_set(swigCPtr, this, value);
  }

  public boolean getCompact() {
    return WapitiJNI.opt_s_compact_get(swigCPtr, this);
  }

  public void setSparse(boolean value) {
    WapitiJNI.opt_s_sparse_set(swigCPtr, this, value);
  }

  public boolean getSparse() {
    return WapitiJNI.opt_s_sparse_get(swigCPtr, this);
  }

  public void setNthread(SWIGTYPE_p_uint32_t value) {
    WapitiJNI.opt_s_nthread_set(swigCPtr, this, SWIGTYPE_p_uint32_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint32_t getNthread() {
    return new SWIGTYPE_p_uint32_t(WapitiJNI.opt_s_nthread_get(swigCPtr, this), true);
  }

  public void setJobsize(SWIGTYPE_p_uint32_t value) {
    WapitiJNI.opt_s_jobsize_set(swigCPtr, this, SWIGTYPE_p_uint32_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint32_t getJobsize() {
    return new SWIGTYPE_p_uint32_t(WapitiJNI.opt_s_jobsize_get(swigCPtr, this), true);
  }

  public void setMaxiter(SWIGTYPE_p_uint32_t value) {
    WapitiJNI.opt_s_maxiter_set(swigCPtr, this, SWIGTYPE_p_uint32_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint32_t getMaxiter() {
    return new SWIGTYPE_p_uint32_t(WapitiJNI.opt_s_maxiter_get(swigCPtr, this), true);
  }

  public void setRho1(double value) {
    WapitiJNI.opt_s_rho1_set(swigCPtr, this, value);
  }

  public double getRho1() {
    return WapitiJNI.opt_s_rho1_get(swigCPtr, this);
  }

  public void setRho2(double value) {
    WapitiJNI.opt_s_rho2_set(swigCPtr, this, value);
  }

  public double getRho2() {
    return WapitiJNI.opt_s_rho2_get(swigCPtr, this);
  }

  public void setObjwin(SWIGTYPE_p_uint32_t value) {
    WapitiJNI.opt_s_objwin_set(swigCPtr, this, SWIGTYPE_p_uint32_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint32_t getObjwin() {
    return new SWIGTYPE_p_uint32_t(WapitiJNI.opt_s_objwin_get(swigCPtr, this), true);
  }

  public void setStopwin(SWIGTYPE_p_uint32_t value) {
    WapitiJNI.opt_s_stopwin_set(swigCPtr, this, SWIGTYPE_p_uint32_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint32_t getStopwin() {
    return new SWIGTYPE_p_uint32_t(WapitiJNI.opt_s_stopwin_get(swigCPtr, this), true);
  }

  public void setStopeps(double value) {
    WapitiJNI.opt_s_stopeps_set(swigCPtr, this, value);
  }

  public double getStopeps() {
    return WapitiJNI.opt_s_stopeps_get(swigCPtr, this);
  }

  public void setLabel(boolean value) {
    WapitiJNI.opt_s_label_set(swigCPtr, this, value);
  }

  public boolean getLabel() {
    return WapitiJNI.opt_s_label_get(swigCPtr, this);
  }

  public void setCheck(boolean value) {
    WapitiJNI.opt_s_check_set(swigCPtr, this, value);
  }

  public boolean getCheck() {
    return WapitiJNI.opt_s_check_get(swigCPtr, this);
  }

  public void setOutsc(boolean value) {
    WapitiJNI.opt_s_outsc_set(swigCPtr, this, value);
  }

  public boolean getOutsc() {
    return WapitiJNI.opt_s_outsc_get(swigCPtr, this);
  }

  public void setLblpost(boolean value) {
    WapitiJNI.opt_s_lblpost_set(swigCPtr, this, value);
  }

  public boolean getLblpost() {
    return WapitiJNI.opt_s_lblpost_get(swigCPtr, this);
  }

  public void setNbest(SWIGTYPE_p_uint32_t value) {
    WapitiJNI.opt_s_nbest_set(swigCPtr, this, SWIGTYPE_p_uint32_t.getCPtr(value));
  }

  public SWIGTYPE_p_uint32_t getNbest() {
    return new SWIGTYPE_p_uint32_t(WapitiJNI.opt_s_nbest_get(swigCPtr, this), true);
  }

  public void setForce(boolean value) {
    WapitiJNI.opt_s_force_set(swigCPtr, this, value);
  }

  public boolean getForce() {
    return WapitiJNI.opt_s_force_get(swigCPtr, this);
  }

  public void setPrec(int value) {
    WapitiJNI.opt_s_prec_set(swigCPtr, this, value);
  }

  public int getPrec() {
    return WapitiJNI.opt_s_prec_get(swigCPtr, this);
  }

  public void setAll(boolean value) {
    WapitiJNI.opt_s_all_set(swigCPtr, this, value);
  }

  public boolean getAll() {
    return WapitiJNI.opt_s_all_get(swigCPtr, this);
  }

  public opt_s() {
    this(WapitiJNI.new_opt_s(), true);
  }

}
