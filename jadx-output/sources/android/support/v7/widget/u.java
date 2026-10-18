package android.support.v7.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewDebug;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class u extends cn {

    /* renamed from: a, reason: collision with root package name */
    @ViewDebug.ExportedProperty
    public boolean f866a;

    /* renamed from: b, reason: collision with root package name */
    @ViewDebug.ExportedProperty
    public int f867b;

    @ViewDebug.ExportedProperty
    public int c;

    @ViewDebug.ExportedProperty
    public boolean d;

    @ViewDebug.ExportedProperty
    public boolean e;
    boolean f;

    public u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public u(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public u(u uVar) {
        super(uVar);
        this.f866a = uVar.f866a;
    }

    public u() {
        super(-2, -2);
        this.f866a = false;
    }
}
