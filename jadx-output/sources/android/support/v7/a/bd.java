package android.support.v7.a;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class bd extends Dialog implements af {

    /* renamed from: a, reason: collision with root package name */
    private ag f496a;

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        a().i();
        super.onCreate(bundle);
        a().a(bundle);
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        a().a(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().a(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().a(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().a(charSequence);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        a().a(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().b(view, layoutParams);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        a().d();
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        a().f();
    }

    public final ag a() {
        if (this.f496a == null) {
            this.f496a = ag.a(this, this);
        }
        return this.f496a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bd(android.content.Context r5, int r6) {
        /*
            r4 = this;
            if (r6 != 0) goto L13
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.res.Resources$Theme r1 = r5.getTheme()
            int r2 = android.support.v7.b.b.dialogTheme
            r3 = 1
            r1.resolveAttribute(r2, r0, r3)
            int r6 = r0.resourceId
        L13:
            r4.<init>(r5, r6)
            android.support.v7.a.ag r0 = r4.a()
            r1 = 0
            r0.a(r1)
            android.support.v7.a.ag r0 = r4.a()
            r0.j()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.a.bd.<init>(android.content.Context, int):void");
    }
}
