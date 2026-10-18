package android.support.v7.view;

import android.content.Context;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public Context f556a;

    public static a a(Context context) {
        return new a(context);
    }

    private a(Context context) {
        this.f556a = context;
    }

    public final boolean a() {
        return this.f556a.getApplicationInfo().targetSdkVersion >= 16 ? this.f556a.getResources().getBoolean(android.support.v7.b.c.abc_action_bar_embed_tabs) : this.f556a.getResources().getBoolean(android.support.v7.b.c.abc_action_bar_embed_tabs_pre_jb);
    }
}
