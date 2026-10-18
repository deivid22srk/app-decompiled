package android.support.v7.a;

import android.content.Context;
import android.widget.ArrayAdapter;

/* loaded from: classes.dex */
final class ab extends ArrayAdapter<CharSequence> {
    public ab(Context context, int i, CharSequence[] charSequenceArr) {
        super(context, i, android.R.id.text1, charSequenceArr);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }
}
