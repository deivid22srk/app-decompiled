package android.support.v7.a;

import android.R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/* loaded from: classes.dex */
final class w extends ArrayAdapter<CharSequence> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ListView f545a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ v f546b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(v vVar, Context context, int i, CharSequence[] charSequenceArr, ListView listView) {
        super(context, i, R.id.text1, charSequenceArr);
        this.f546b = vVar;
        this.f545a = listView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (this.f546b.C != null && this.f546b.C[i]) {
            this.f545a.setItemChecked(i, true);
        }
        return view2;
    }
}
