package edu.uiowa.jopenmm;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
import com.sun.jna.Pointer;
import com.sun.jna.PointerType;
import com.sun.jna.ptr.PointerByReference;

/**
 * JNA Wrapper for library <b>OpenMMMeld</b><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a
 * href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource
 * projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a
 * href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class OpenMMMeldLibrary implements Library {
  public static final String JNA_LIBRARY_NAME = "MeldPlugin";
  public static final NativeLibrary JNA_NATIVE_LIB =
      NativeLibrary.getInstance(OpenMMMeldLibrary.JNA_LIBRARY_NAME);

  static {
    Native.register(OpenMMMeldLibrary.class, OpenMMMeldLibrary.JNA_NATIVE_LIB);
  }
  /**
   * MeldForce<br>
   * Original signature : <code>OpenMM_MeldForce* OpenMM_MeldForce_create()</code>
   */
  public static native PointerByReference OpenMM_MeldForce_create();
  /** Original signature : <code>void OpenMM_MeldForce_destroy(OpenMM_MeldForce*)</code> */
  public static native void OpenMM_MeldForce_destroy(PointerByReference target);
  /**
   * Original signature : <code>
   * int OpenMM_MeldForce_addDistanceRestraint(OpenMM_MeldForce*, int, int, float, float, float, float, float)
   * </code>
   */
  public static native int OpenMM_MeldForce_addDistanceRestraint(
      PointerByReference target,
      int particle1,
      int particle2,
      float r1,
      float r2,
      float r3,
      float r4,
      float force_constant);
  /**
   * Original signature : <code>
   * void OpenMM_MeldForce_modifyDistanceRestraint(OpenMM_MeldForce*, int, int, int, float, float, float, float, float)
   * </code>
   */
  public static native void OpenMM_MeldForce_modifyDistanceRestraint(
      PointerByReference target,
      int index,
      int particle1,
      int particle2,
      float r1,
      float r2,
      float r3,
      float r4,
      float force_constant);
  /**
   * Original signature : <code>
   * int OpenMM_MeldForce_addHyperbolicDistanceRestraint(OpenMM_MeldForce*, int, int, float, float, float, float, float, float)
   * </code>
   */
  public static native int OpenMM_MeldForce_addHyperbolicDistanceRestraint(
      PointerByReference target,
      int particle1,
      int particle2,
      float r1,
      float r2,
      float r3,
      float r4,
      float force_constant,
      float asymptote);
  /**
   * Original signature : <code>
   * void OpenMM_MeldForce_modifyHyperbolicDistanceRestraint(OpenMM_MeldForce*, int, int, int, float, float, float, float, float, float)
   * </code>
   */
  public static native void OpenMM_MeldForce_modifyHyperbolicDistanceRestraint(
      PointerByReference target,
      int index,
      int particle1,
      int particle2,
      float r1,
      float r2,
      float r3,
      float r4,
      float force_constant,
      float asymptote);
  /**
   * Original signature : <code>
   * int OpenMM_MeldForce_addTorsionRestraint(OpenMM_MeldForce*, int, int, int, int, float, float, float)
   * </code>
   */
  public static native int OpenMM_MeldForce_addTorsionRestraint(
      PointerByReference target,
      int atom1,
      int atom2,
      int atom3,
      int atom4,
      float phi,
      float deltaPhi,
      float forceConstant);
  /**
   * Original signature : <code>
   * void OpenMM_MeldForce_modifyTorsionRestraint(OpenMM_MeldForce*, int, int, int, int, int, float, float, float)
   * </code>
   */
  public static native void OpenMM_MeldForce_modifyTorsionRestraint(
      PointerByReference target,
      int index,
      int atom1,
      int atom2,
      int atom3,
      int atom4,
      float phi,
      float deltaPhi,
      float forceConstant);
  /**
   * Original signature : <code>
   * int OpenMM_MeldForce_addGroup(OpenMM_MeldForce*, OpenMM_IntArray*, int)</code>
   */
  public static native int OpenMM_MeldForce_addGroup(
      PointerByReference target, PointerByReference restraint_indices, int n_active);
  /**
   * Original signature : <code>
   * int OpenMM_MeldForce_addCollection(OpenMM_MeldForce*, OpenMM_IntArray*, int)</code>
   */
  public static native int OpenMM_MeldForce_addCollection(
      PointerByReference target, PointerByReference group_indices, int n_active);
  /**
   * Original signature : <code>
   * void OpenMM_MeldForce_updateParametersInContext(OpenMM_MeldForce*, OpenMM_Context*)</code>
   */
  public static native void OpenMM_MeldForce_updateParametersInContext(
      PointerByReference target, PointerByReference context);

  public static class OpenMM_MeldForce extends PointerType {
    public OpenMM_MeldForce(Pointer address) {
      super(address);
    }

    public OpenMM_MeldForce() {
      super();
    }
  };
}
