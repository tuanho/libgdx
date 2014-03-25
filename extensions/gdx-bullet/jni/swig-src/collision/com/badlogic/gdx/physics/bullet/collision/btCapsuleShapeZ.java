/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btCapsuleShapeZ extends btCapsuleShape {
	private long swigCPtr;
	
	protected btCapsuleShapeZ(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, CollisionJNI.btCapsuleShapeZ_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btCapsuleShapeZ, normally you should not need this constructor it's intended for low-level usage. */
	public btCapsuleShapeZ(long cPtr, boolean cMemoryOwn) {
		this("btCapsuleShapeZ", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(CollisionJNI.btCapsuleShapeZ_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btCapsuleShapeZ obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CollisionJNI.delete_btCapsuleShapeZ(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public btCapsuleShapeZ(float radius, float height) {
    this(CollisionJNI.new_btCapsuleShapeZ(radius, height), true);
  }

}
