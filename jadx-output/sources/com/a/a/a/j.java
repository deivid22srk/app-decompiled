package com.a.a.a;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes.dex */
final class j implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    private final List<String> f997a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f998b;
    private String c;

    public j(List<String> list) {
        this.f997a = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (objArr == null) {
            objArr = l.f1001b;
        }
        if (name.equals("supports") && Boolean.TYPE == returnType) {
            return true;
        }
        if (name.equals("unsupported") && Void.TYPE == returnType) {
            this.f998b = true;
            return null;
        }
        if (name.equals("protocols") && objArr.length == 0) {
            return this.f997a;
        }
        if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
            List list = (List) objArr[0];
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (this.f997a.contains(list.get(i))) {
                    String str = (String) list.get(i);
                    this.c = str;
                    return str;
                }
            }
            String str2 = this.f997a.get(0);
            this.c = str2;
            return str2;
        }
        if ((name.equals("protocolSelected") || name.equals("selected")) && objArr.length == 1) {
            this.c = (String) objArr[0];
            return null;
        }
        return method.invoke(this, objArr);
    }
}
