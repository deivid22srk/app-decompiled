package com.google.android.play.dfe.a;

import com.google.protobuf.nano.c;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<Class<?>, Field> f6835a = new HashMap();

    public static <X extends c, Y extends c> void a(X x, Class<X> cls, Y y, Class<Y> cls2) {
        try {
            a(cls, cls2).set(x, y);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static <X extends c, Y extends c> Y a(X x, Class<X> cls, Class<Y> cls2) {
        try {
            return (Y) a(cls, cls2).get(x);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static Field a(Class<?> cls, Class<?> cls2) {
        Field field = f6835a.get(cls2);
        if (field == null) {
            Field[] fields = cls.getFields();
            int length = fields.length;
            for (int i = 0; i < length; i++) {
                field = fields[i];
                if (field.getType().equals(cls2) && Modifier.isPublic(field.getModifiers())) {
                    f6835a.put(cls2, field);
                }
            }
            throw new IllegalArgumentException("No field for " + cls2 + " in " + cls);
        }
        return field;
    }
}
