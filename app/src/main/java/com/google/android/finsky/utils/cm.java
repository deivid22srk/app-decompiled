package com.google.android.finsky.utils;

import android.opengl.GLES10;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* loaded from: classes.dex */
public final class cm {

    /* renamed from: a, reason: collision with root package name */
    private boolean f4804a = jo.a();

    private static void a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int[] iArr, int[] iArr2, Set<String> set) {
        EGLContext eglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, iArr2);
        if (eglCreateContext != EGL10.EGL_NO_CONTEXT) {
            EGLSurface eglCreatePbufferSurface = egl10.eglCreatePbufferSurface(eGLDisplay, eGLConfig, iArr);
            if (eglCreatePbufferSurface == EGL10.EGL_NO_SURFACE) {
                egl10.eglDestroyContext(eGLDisplay, eglCreateContext);
                return;
            }
            egl10.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext);
            String glGetString = GLES10.glGetString(7939);
            if (!TextUtils.isEmpty(glGetString)) {
                String[] split = glGetString.split(" ");
                for (String str : split) {
                    set.add(str);
                }
            }
            egl10.eglMakeCurrent(eGLDisplay, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
            egl10.eglDestroySurface(eGLDisplay, eglCreatePbufferSurface);
            egl10.eglDestroyContext(eGLDisplay, eglCreateContext);
        }
    }

    public final List<String> a() {
        HashSet hashSet;
        ArrayList arrayList = new ArrayList();
        String a2 = jn.f5035b.a();
        if (!this.f4804a && !TextUtils.isEmpty(a2)) {
            arrayList.addAll(Arrays.asList(a2.split(" ")));
        } else {
            if (!jn.c.a().booleanValue() || this.f4804a) {
                jn.c.a((com.google.android.finsky.cpkg.o<Boolean>) true);
                hashSet = new HashSet();
                EGL10 egl10 = (EGL10) EGLContext.getEGL();
                if (egl10 == null) {
                    FinskyLog.d("Couldn't get EGL", new Object[0]);
                } else {
                    EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
                    egl10.eglInitialize(eglGetDisplay, new int[2]);
                    int[] iArr = new int[1];
                    if (!egl10.eglGetConfigs(eglGetDisplay, null, 0, iArr)) {
                        FinskyLog.d("Couldn't get EGL config count", new Object[0]);
                    } else {
                        EGLConfig[] eGLConfigArr = new EGLConfig[iArr[0]];
                        if (!egl10.eglGetConfigs(eglGetDisplay, eGLConfigArr, iArr[0], iArr)) {
                            FinskyLog.d("Couldn't get EGL configs", new Object[0]);
                        } else {
                            int[] iArr2 = {12375, 1, 12374, 1, 12344};
                            int[] iArr3 = {12440, 2, 12344};
                            int[] iArr4 = new int[1];
                            int i = 0;
                            while (true) {
                                int i2 = i;
                                if (i2 >= iArr[0]) {
                                    break;
                                }
                                egl10.eglGetConfigAttrib(eglGetDisplay, eGLConfigArr[i2], 12327, iArr4);
                                if (iArr4[0] != 12368) {
                                    egl10.eglGetConfigAttrib(eglGetDisplay, eGLConfigArr[i2], 12339, iArr4);
                                    if ((iArr4[0] & 1) != 0) {
                                        egl10.eglGetConfigAttrib(eglGetDisplay, eGLConfigArr[i2], 12352, iArr4);
                                        if ((iArr4[0] & 1) != 0) {
                                            a(egl10, eglGetDisplay, eGLConfigArr[i2], iArr2, null, hashSet);
                                        }
                                        if ((iArr4[0] & 4) != 0) {
                                            a(egl10, eglGetDisplay, eGLConfigArr[i2], iArr2, iArr3, hashSet);
                                        }
                                    }
                                }
                                i = i2 + 1;
                            }
                            egl10.eglTerminate(eglGetDisplay);
                        }
                    }
                }
                jn.c.c();
            } else {
                hashSet = new HashSet();
                hashSet.add("_android_driver_crashed");
            }
            arrayList.addAll(hashSet);
            Collections.sort(arrayList);
            jn.f5035b.a((com.google.android.finsky.cpkg.o<String>) TextUtils.join(" ", arrayList));
        }
        return arrayList;
    }
}
