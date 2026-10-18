package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class bn {
    Notification A;
    public ArrayList<String> C;

    /* renamed from: a, reason: collision with root package name */
    public Context f200a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f201b;
    public CharSequence c;
    public PendingIntent d;
    PendingIntent e;
    RemoteViews f;
    public Bitmap g;
    public CharSequence h;
    public int i;
    public int j;
    public boolean l;
    public bz m;
    public CharSequence n;
    int o;
    int p;
    boolean q;
    String r;
    boolean s;
    String t;
    public String w;
    Bundle x;
    boolean k = true;
    public ArrayList<bj> u = new ArrayList<>();
    public boolean v = false;
    public int y = 0;
    public int z = 0;
    public Notification B = new Notification();

    public bn(Context context) {
        this.f200a = context;
        this.B.when = System.currentTimeMillis();
        this.B.audioStreamType = -1;
        this.j = 0;
        this.C = new ArrayList<>();
    }

    public final bn a(int i) {
        this.B.icon = i;
        return this;
    }

    public final bn a(CharSequence charSequence) {
        this.f201b = d(charSequence);
        return this;
    }

    public final bn b(CharSequence charSequence) {
        this.c = d(charSequence);
        return this;
    }

    public final bn a(int i, int i2, boolean z) {
        this.o = i;
        this.p = i2;
        this.q = z;
        return this;
    }

    public final bn c(CharSequence charSequence) {
        this.B.tickerText = d(charSequence);
        return this;
    }

    public final void b(int i) {
        this.B.flags |= i;
    }

    public final bn a(bz bzVar) {
        if (this.m != bzVar) {
            this.m = bzVar;
            if (this.m != null) {
                bz bzVar2 = this.m;
                if (bzVar2.d != this) {
                    bzVar2.d = this;
                    if (bzVar2.d != null) {
                        bzVar2.d.a(bzVar2);
                    }
                }
            }
        }
        return this;
    }

    public final Notification a() {
        bq bqVar;
        bqVar = bi.f194a;
        new bo();
        return bqVar.a(this);
    }

    protected static CharSequence d(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 5120) {
            return charSequence.subSequence(0, 5120);
        }
        return charSequence;
    }
}
