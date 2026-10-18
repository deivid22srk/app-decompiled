package com.android.ex.photo;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public Integer f1159a;

    /* renamed from: b, reason: collision with root package name */
    public String f1160b;
    public String[] c;
    public String d;
    public boolean e;
    public boolean f;
    private final Intent g;
    private String h;
    private String i;
    private Float j;
    private boolean k;
    private boolean l;
    private boolean m;
    private int n;
    private int o;
    private int p;
    private int q;

    public /* synthetic */ f(Context context, Class cls, byte b2) {
        this(context, cls);
    }

    private f(Context context, Class<?> cls) {
        this.g = new Intent(context, cls);
        this.m = false;
        this.e = false;
        this.f = false;
        this.k = true;
    }

    public final f a(float f) {
        this.j = Float.valueOf(f);
        return this;
    }

    public final Intent a() {
        this.g.setAction("android.intent.action.VIEW");
        this.g.setFlags(67633152);
        if (this.f1159a != null) {
            this.g.putExtra("photo_index", this.f1159a.intValue());
        }
        if (this.h != null) {
            this.g.putExtra("initial_photo_uri", this.h);
        }
        if (this.h != null && this.f1159a != null) {
            throw new IllegalStateException("specified both photo index and photo uri");
        }
        if (this.i != null) {
            this.g.putExtra("photos_uri", this.i);
            this.g.setData(Uri.parse(this.i));
        }
        if (this.f1160b != null) {
            this.g.putExtra("resolved_photo_uri", this.f1160b);
        }
        if (this.c != null) {
            this.g.putExtra("projection", this.c);
        }
        if (this.d != null) {
            this.g.putExtra("thumbnail_uri", this.d);
        }
        if (this.j != null) {
            this.g.putExtra("max_scale", this.j);
        }
        this.g.putExtra("watch_network", this.l);
        this.g.putExtra("scale_up_animation", this.m);
        if (this.m) {
            this.g.putExtra("start_x_extra", this.n);
            this.g.putExtra("start_y_extra", this.o);
            this.g.putExtra("start_width_extra", this.p);
            this.g.putExtra("start_height_extra", this.q);
        }
        this.g.putExtra("action_bar_hidden_initially", this.e);
        this.g.putExtra("display_thumbs_fullscreen", this.f);
        this.g.putExtra("enable_timer_lights_out", this.k);
        return this.g;
    }
}
