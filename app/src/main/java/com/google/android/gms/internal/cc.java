package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;

@gw
/* loaded from: classes.dex */
public final class cc {
    private final int c;
    private final cb d = new ch();

    /* renamed from: b, reason: collision with root package name */
    private final int f5917b = 6;

    /* renamed from: a, reason: collision with root package name */
    final int f5916a = 0;

    public cc(int i) {
        this.c = i;
    }

    final String a(String str) {
        String[] split = str.split("\n");
        if (split.length == 0) {
            return "";
        }
        cf cfVar = new cf();
        Arrays.sort(split, new cd(this));
        for (int i = 0; i < split.length && i < this.c; i++) {
            if (split[i].trim().length() != 0) {
                try {
                    cfVar.a(this.d.a(split[i]));
                } catch (IOException e) {
                    com.google.android.gms.ads.internal.util.client.b.b("Error while writing hash to byteStream", e);
                }
            }
        }
        return cfVar.toString();
    }

    final String b(String str) {
        String[] split = str.split("\n");
        if (split.length == 0) {
            return "";
        }
        cf cfVar = new cf();
        PriorityQueue priorityQueue = new PriorityQueue(this.c, new ce(this));
        for (String str2 : split) {
            String[] b2 = cg.b(str2);
            if (b2.length >= this.f5917b) {
                ci.a(b2, this.c, this.f5917b, (PriorityQueue<cj>) priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                cfVar.a(this.d.a(((cj) it.next()).f5924b));
            } catch (IOException e) {
                com.google.android.gms.ads.internal.util.client.b.b("Error while writing hash to byteStream", e);
            }
        }
        return cfVar.toString();
    }
}
