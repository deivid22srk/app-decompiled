package com.a.a.apkg;

import com.a.a.aa;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
final class i extends g {

    /* renamed from: a, reason: collision with root package name */
    public final Method f995a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f996b;
    public final Method c;
    public final Class<?> d;
    public final Class<?> e;

    public i(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.f995a = method;
        this.f996b = method2;
        this.c = method3;
        this.d = cls;
        this.e = cls2;
    }

    @Override // com.a.a.apkg.g
    public final void a(SSLSocket sSLSocket, String str, List<aa> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            aa aaVar = list.get(i);
            if (aaVar != aa.HTTP_1_0) {
                arrayList.add(aaVar.toString());
            }
        }
        try {
            this.f995a.invoke(null, sSLSocket, Proxy.newProxyInstance(g.class.getClassLoader(), new Class[]{this.d, this.e}, new j(arrayList)));
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // com.a.a.apkg.g
    public final void a(SSLSocket sSLSocket) {
        try {
            this.c.invoke(null, sSLSocket);
        } catch (IllegalAccessException e) {
            throw new AssertionError();
        } catch (InvocationTargetException e2) {
            throw new AssertionError();
        }
    }

    @Override // com.a.a.apkg.g
    public final String b(SSLSocket sSLSocket) {
        boolean z;
        boolean z2;
        String str;
        String str2;
        try {
            j jVar = (j) Proxy.getInvocationHandler(this.f996b.invoke(null, sSLSocket));
            z = jVar.f998b;
            if (!z) {
                str2 = jVar.c;
                if (str2 == null) {
                    a.f886a.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                    return null;
                }
            }
            z2 = jVar.f998b;
            if (z2) {
                return null;
            }
            str = jVar.c;
            return str;
        } catch (IllegalAccessException e) {
            throw new AssertionError();
        } catch (InvocationTargetException e2) {
            throw new AssertionError();
        }
    }
}
