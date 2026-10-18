package android.support.v4.c.apkg;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class m extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    int f268a;

    /* renamed from: b, reason: collision with root package name */
    Drawable.ConstantState f269b;
    ColorStateList c;
    PorterDuff.Mode d;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public abstract Drawable newDrawable(Resources resources);

    m(m mVar) {
        this.c = null;
        this.d = l.f266a;
        if (mVar != null) {
            this.f268a = mVar.f268a;
            this.f269b = mVar.f269b;
            this.c = mVar.c;
            this.d = mVar.d;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return (this.f269b != null ? this.f269b.getChangingConfigurations() : 0) | this.f268a;
    }
}
