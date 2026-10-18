package android.support.a.a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* loaded from: classes.dex */
final class n extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    private final Drawable.ConstantState f54a;

    public n(Drawable.ConstantState constantState) {
        this.f54a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        g gVar = new g((byte) 0);
        gVar.f44a = (VectorDrawable) this.f54a.newDrawable();
        return gVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        g gVar = new g((byte) 0);
        gVar.f44a = (VectorDrawable) this.f54a.newDrawable(resources);
        return gVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        g gVar = new g((byte) 0);
        gVar.f44a = (VectorDrawable) this.f54a.newDrawable(resources, theme);
        return gVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f54a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f54a.getChangingConfigurations();
    }
}
