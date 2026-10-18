package android.support.v7.widget;

import android.R;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* loaded from: classes.dex */
final class bd extends az {
    private static final int[] c = {R.attr.thumb};
    private final SeekBar d;

    bd(SeekBar seekBar, ao aoVar) {
        super(seekBar, aoVar);
        this.d = seekBar;
    }

    @Override // android.support.v7.widget.az
    final void a(AttributeSet attributeSet, int i) {
        super.a(attributeSet, i);
        fx a2 = fx.a(this.d.getContext(), attributeSet, c, i);
        Drawable b2 = a2.b(0);
        if (b2 != null) {
            this.d.setThumb(b2);
        }
        a2.f836a.recycle();
    }
}
