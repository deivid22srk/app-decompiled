package com.google.android.gms.internal;

import java.util.PriorityQueue;

@gw
/* loaded from: classes.dex */
public final class ci {
    private static long a(long j, int i) {
        if (i == 0) {
            return 1L;
        }
        return i != 1 ? i % 2 == 0 ? a((j * j) % 1073807359, i / 2) % 1073807359 : ((a((j * j) % 1073807359, i / 2) % 1073807359) * j) % 1073807359 : j;
    }

    private static String a(String[] strArr, int i, int i2) {
        if (strArr.length < i + i2) {
            com.google.android.gms.ads.internal.util.client.b.b("Unable to construct shingle");
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = i; i3 < (i + i2) - 1; i3++) {
            stringBuffer.append(strArr[i3]);
            stringBuffer.append(' ');
        }
        stringBuffer.append(strArr[(i + i2) - 1]);
        return stringBuffer.toString();
    }

    private static void a(int i, long j, String str, PriorityQueue<cj> priorityQueue) {
        cj cjVar = new cj(j, str);
        if ((priorityQueue.size() != i || priorityQueue.peek().f5923a <= cjVar.f5923a) && !priorityQueue.contains(cjVar)) {
            priorityQueue.add(cjVar);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    public static void a(String[] strArr, int i, int i2, PriorityQueue<cj> priorityQueue) {
        long a2 = (cg.a(strArr[0]) + 2147483647L) % 1073807359;
        for (int i3 = 1; i3 < i2 + 0; i3++) {
            a2 = (((a2 * 16785407) % 1073807359) + ((cg.a(strArr[i3]) + 2147483647L) % 1073807359)) % 1073807359;
        }
        a(i, a2, a(strArr, 0, i2), priorityQueue);
        long a3 = a(16785407L, i2 - 1);
        for (int i4 = 1; i4 < (strArr.length - i2) + 1; i4++) {
            a2 = ((((((a2 + 1073807359) - ((((cg.a(strArr[i4 - 1]) + 2147483647L) % 1073807359) * a3) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((cg.a(strArr[(i4 + i2) - 1]) + 2147483647L) % 1073807359)) % 1073807359;
            a(i, a2, a(strArr, i4, i2), priorityQueue);
        }
    }
}
