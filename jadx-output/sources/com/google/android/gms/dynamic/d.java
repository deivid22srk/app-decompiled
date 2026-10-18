package com.google.android.gms.dynamic;

import android.os.IBinder;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class d<T> extends b {

    /* renamed from: a, reason: collision with root package name */
    private final T f5792a;

    private d(T t) {
        this.f5792a = t;
    }

    public static <T> a a(T t) {
        return new d(t);
    }

    public static <T> T a(a aVar) {
        if (aVar instanceof d) {
            return ((d) aVar).f5792a;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        if (declaredFields.length != 1) {
            throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
        }
        Field field = declaredFields[0];
        if (field.isAccessible()) {
            throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
        }
        field.setAccessible(true);
        try {
            return (T) field.get(asBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (IllegalArgumentException e2) {
            throw new IllegalArgumentException("remoteBinder is the wrong class.", e2);
        } catch (NullPointerException e3) {
            throw new IllegalArgumentException("Binder object is null.", e3);
        }
    }
}
