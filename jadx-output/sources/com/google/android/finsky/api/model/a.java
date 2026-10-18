package com.google.android.finsky.api.model;

import android.content.Context;
import com.android.volley.ServerError;
import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.jm;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class a<T extends com.google.protobuf.nano.c> extends j implements com.android.volley.t<T> {

    /* renamed from: a, reason: collision with root package name */
    final File f1965a;

    /* renamed from: b, reason: collision with root package name */
    public T f1966b;
    private final Method c;

    public a(Context context, Class<T> cls) {
        this.f1965a = new File(context.getCacheDir(), cls.getSimpleName());
        Method method = null;
        try {
            method = cls.getMethod("parseFrom", byte[].class);
        } catch (NoSuchMethodException e) {
            FinskyLog.c("Cannot find parseFrom method in given class, verify it is a proto.", e);
        }
        this.c = method;
    }

    @Override // com.google.android.finsky.api.model.j, com.android.volley.s
    public final void a(VolleyError volleyError) {
        if ((volleyError instanceof ServerError) && volleyError.f1195b != null) {
            super.a(volleyError);
        } else {
            jm.a(new b(this), volleyError);
        }
    }

    @Override // com.android.volley.t
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void a_(T t) {
        jm.a(new c(this), com.google.protobuf.nano.c.a(t));
        b((a<T>) t);
    }

    protected final void b(T t) {
        this.f1966b = t;
        l();
    }

    @Override // com.google.android.finsky.api.model.j
    public final boolean a() {
        return this.f1966b != null;
    }

    protected final T b() {
        if (c()) {
            try {
                return (T) this.c.invoke(null, jm.a((InputStream) new FileInputStream(this.f1965a)));
            } catch (InvalidProtocolBufferNanoException e) {
                FinskyLog.c("Failed to load response proto, bad proto.", e);
                this.f1965a.delete();
            } catch (FileNotFoundException e2) {
                FinskyLog.c("Failed to load response proto, file not found.", e2);
            } catch (IOException e3) {
                FinskyLog.c("Failed to load response proto.", e3);
            } catch (IllegalAccessException e4) {
                FinskyLog.c("Failed to parse response proto, parseFrom method private.", e4);
            } catch (InvocationTargetException e5) {
                FinskyLog.c("Failed to parse response proto, parseFrom method missing.", e5);
            }
        }
        return null;
    }

    protected final boolean c() {
        return this.f1965a.exists() && this.f1965a.canRead();
    }
}
