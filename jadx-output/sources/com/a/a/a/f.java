package com.a.a.a;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
final class f<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<?> f990a;

    /* renamed from: b, reason: collision with root package name */
    private final String f991b;
    private final Class[] c;

    public f(Class<?> cls, String str, Class... clsArr) {
        this.f990a = cls;
        this.f991b = str;
        this.c = clsArr;
    }

    public final boolean a(T t) {
        return a(t.getClass()) != null;
    }

    private Object c(T t, Object... objArr) {
        Method a2 = a(t.getClass());
        if (a2 == null) {
            return null;
        }
        try {
            return a2.invoke(t, objArr);
        } catch (IllegalAccessException e) {
            return null;
        }
    }

    public final Object a(T t, Object... objArr) {
        try {
            return c(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    private Object d(T t, Object... objArr) {
        Method a2 = a(t.getClass());
        if (a2 == null) {
            throw new AssertionError("Method " + this.f991b + " not supported for object " + t);
        }
        try {
            return a2.invoke(t, objArr);
        } catch (IllegalAccessException e) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + a2);
            assertionError.initCause(e);
            throw assertionError;
        }
    }

    public final Object b(T t, Object... objArr) {
        try {
            return d(t, objArr);
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    private Method a(Class<?> cls) {
        if (this.f991b == null) {
            return null;
        }
        Method a2 = a(cls, this.f991b, this.c);
        if (a2 == null || this.f990a == null || this.f990a.isAssignableFrom(a2.getReturnType())) {
            return a2;
        }
        return null;
    }

    private static Method a(Class<?> cls, String str, Class[] clsArr) {
        try {
            Method method = cls.getMethod(str, clsArr);
            try {
                if ((method.getModifiers() & 1) == 0) {
                    return null;
                }
                return method;
            } catch (NoSuchMethodException e) {
                return method;
            }
        } catch (NoSuchMethodException e2) {
            return null;
        }
    }
}
