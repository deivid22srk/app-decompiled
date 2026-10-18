package android.support.v7.a;

import android.R;
import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.ListView;

/* loaded from: classes.dex */
final class x extends CursorAdapter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ListView f547a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p f548b;
    final /* synthetic */ v c;
    private final int d;
    private final int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(v vVar, Context context, Cursor cursor, ListView listView, p pVar) {
        super(context, cursor, false);
        this.c = vVar;
        this.f547a = listView;
        this.f548b = pVar;
        Cursor cursor2 = getCursor();
        this.d = cursor2.getColumnIndexOrThrow(this.c.I);
        this.e = cursor2.getColumnIndexOrThrow(this.c.J);
    }

    @Override // android.widget.CursorAdapter
    public final void bindView(View view, Context context, Cursor cursor) {
        ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.d));
        this.f547a.setItemChecked(cursor.getPosition(), cursor.getInt(this.e) == 1);
    }

    @Override // android.widget.CursorAdapter
    public final View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.c.f544b.inflate(this.f548b.I, viewGroup, false);
    }
}
