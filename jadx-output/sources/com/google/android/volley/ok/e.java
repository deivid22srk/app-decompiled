package com.google.android.volley.ok;

import android.os.SystemClock;
import com.a.a.y;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    private int f7215a = 10;

    /* renamed from: b, reason: collision with root package name */
    private Map<Integer, f> f7216b = new HashMap(10);
    private final y c;

    e(y yVar) {
        this.c = yVar;
    }

    public final synchronized y a(int i) {
        y clone;
        Integer num;
        long j;
        f fVar = this.f7216b.get(Integer.valueOf(i));
        if (fVar == null) {
            if (this.f7216b.size() >= this.f7215a) {
                long j2 = Long.MAX_VALUE;
                Integer num2 = null;
                for (Map.Entry<Integer, f> entry : this.f7216b.entrySet()) {
                    if (entry.getValue().f7218b < j2) {
                        j = entry.getValue().f7218b;
                        num = entry.getKey();
                    } else {
                        num = num2;
                        j = j2;
                    }
                    j2 = j;
                    num2 = num;
                }
                this.f7216b.remove(num2);
            }
            clone = this.c.clone();
            long j3 = i;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (j3 < 0) {
                throw new IllegalArgumentException("timeout < 0");
            }
            if (timeUnit == null) {
                throw new IllegalArgumentException("unit == null");
            }
            long millis = timeUnit.toMillis(j3);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException("Timeout too large.");
            }
            clone.y = (int) millis;
            long j4 = i;
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            if (j4 < 0) {
                throw new IllegalArgumentException("timeout < 0");
            }
            if (timeUnit2 == null) {
                throw new IllegalArgumentException("unit == null");
            }
            long millis2 = timeUnit2.toMillis(j4);
            if (millis2 > 2147483647L) {
                throw new IllegalArgumentException("Timeout too large.");
            }
            clone.x = (int) millis2;
            TimeUnit timeUnit3 = TimeUnit.MILLISECONDS;
            if (5000 < 0) {
                throw new IllegalArgumentException("timeout < 0");
            }
            if (timeUnit3 == null) {
                throw new IllegalArgumentException("unit == null");
            }
            long millis3 = timeUnit3.toMillis(5000L);
            if (millis3 > 2147483647L) {
                throw new IllegalArgumentException("Timeout too large.");
            }
            clone.w = (int) millis3;
            this.f7216b.put(Integer.valueOf(i), new f(clone));
        } else {
            fVar.f7218b = SystemClock.elapsedRealtime();
            clone = fVar.f7217a;
        }
        return clone;
    }
}
