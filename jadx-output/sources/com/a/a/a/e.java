package com.a.a.a;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* loaded from: classes.dex */
final class e implements d {
    e() {
    }

    @Override // com.a.a.a.d
    public final InetAddress[] a(String str) {
        if (str == null) {
            throw new UnknownHostException("host == null");
        }
        return InetAddress.getAllByName(str);
    }
}
