package android.support.v7.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* loaded from: classes.dex */
public final class e extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public int f558a;

    /* renamed from: b, reason: collision with root package name */
    private Resources.Theme f559b;
    private LayoutInflater c;

    public e(Context context, int i) {
        super(context);
        this.f558a = i;
    }

    public e(Context context, Resources.Theme theme) {
        super(context);
        this.f559b = theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f558a != i) {
            this.f558a = i;
            a();
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        if (this.f559b != null) {
            return this.f559b;
        }
        if (this.f558a == 0) {
            this.f558a = android.support.v7.b.k.Theme_AppCompat_Light;
        }
        a();
        return this.f559b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.c == null) {
            this.c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.c;
    }

    private void a() {
        if (this.f559b == null) {
            this.f559b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f559b.setTo(theme);
            }
        }
        this.f559b.applyStyle(this.f558a, true);
    }
}
