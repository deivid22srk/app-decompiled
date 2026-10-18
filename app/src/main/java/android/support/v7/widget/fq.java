package android.support.v7.widget;

import com.deivid22srk.store.R;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes.dex */
final class fq {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f823a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f824b;
    public final ImageView c;
    public final ImageView d;
    public final ImageView e;

    public fq(View view) {
        this.f823a = (TextView) view.findViewById(android.R.id.text1);
        this.f824b = (TextView) view.findViewById(R.id.text2);
        this.c = (ImageView) view.findViewById(android.R.id.icon1);
        this.d = (ImageView) view.findViewById(android.R.id.icon2);
        this.e = (ImageView) view.findViewById(android.support.v7.b.g.edit_query);
    }
}
