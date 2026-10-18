package com.google.android.finsky.utils;

import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import android.os.UserManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes.dex */
final class jl extends jk {

    /* renamed from: a, reason: collision with root package name */
    private UserManager f5030a;

    /* renamed from: b, reason: collision with root package name */
    private ar f5031b;
    private Method c;
    private Method d;

    public jl(Context context, ar arVar) {
        super((byte) 0);
        this.f5030a = (UserManager) context.getSystemService("user");
        this.f5031b = arVar;
        Class<?> cls = this.f5030a.getClass();
        Class<?>[] clsArr = new Class[0];
        Method method = cls.getMethod("getUsers", clsArr);
        Class<?> returnType = method.getReturnType();
        if (returnType.equals(List.class)) {
            this.c = method;
        } else {
            FinskyLog.e("Return type %s is not correct for getUsers", returnType);
            this.c = null;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            Method method2 = cls.getMethod("isLinkedUser", clsArr);
            Class<?> returnType2 = method2.getReturnType();
            if (returnType2.equals(Boolean.TYPE)) {
                this.d = method2;
            } else {
                FinskyLog.e("Return type %s is not correct for isLimited", returnType2);
                this.d = null;
            }
        }
    }

    @Override // com.google.android.finsky.utils.jk
    public final boolean b() {
        if (this.d == null) {
            return super.b();
        }
        try {
            return ((Boolean) this.d.invoke(this.f5030a, null)).booleanValue();
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            return false;
        }
    }

    @Override // com.google.android.finsky.utils.jk
    public final boolean a() {
        if (this.c == null) {
            return super.a();
        }
        try {
            return ((List) this.c.invoke(this.f5030a, null)).size() > 1;
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            return false;
        }
    }

    @Override // com.google.android.finsky.utils.jk
    public final boolean c() {
        return a() || this.f5031b.a((Account) null);
    }
}
