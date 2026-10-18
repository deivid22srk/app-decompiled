package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* loaded from: classes.dex */
interface i {
    Drawable a(CompoundButton compoundButton);

    void a(CompoundButton compoundButton, ColorStateList colorStateList);

    void a(CompoundButton compoundButton, PorterDuff.Mode mode);
}
