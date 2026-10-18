package com.google.android.finsky.layout.play;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.android.vending.R;
import com.google.android.finsky.FinskyApp;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.utils.ik;
import com.google.android.gms.common.people.data.AudienceMember;
import java.util.List;

/* loaded from: classes.dex */
public class PlayCirclesButton extends ProfileButton implements View.OnClickListener, com.google.android.finsky.i.c {

    /* renamed from: b, reason: collision with root package name */
    private cy f3348b;
    private com.google.android.finsky.i.a c;
    private final boolean d;

    public PlayCirclesButton(Context context) {
        this(context, null);
    }

    public PlayCirclesButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.android.vending.b.PlayCirclesButton);
        this.d = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    public final void a(Document document, String str, cy cyVar) {
        this.f3348b = cyVar;
        if (this.c == null) {
            this.c = FinskyApp.a().a(str).a(document, str);
            this.c.d = this;
            this.c.a(FinskyApp.a().getApplicationContext(), ((com.google.android.finsky.e.t) getContext()).l());
            setOnClickListener(this);
        }
        b(this.c.c);
    }

    @Override // com.google.android.finsky.i.c
    public final void a(List<AudienceMember> list) {
        b(list);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this && (view.getContext() instanceof android.support.v4.app.t)) {
            FinskyApp.a().h().a(280, (byte[]) null, this.f3348b);
            this.c.a((android.support.v4.app.t) view.getContext());
        }
    }

    private void b(List<AudienceMember> list) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = R.drawable.play_highlight_overlay_light;
        boolean z = (list == null || list.isEmpty()) ? false : true;
        Resources resources = getResources();
        String a2 = com.google.android.finsky.utils.bp.a(list, resources);
        if (ik.b()) {
            if (this.d) {
                i3 = z ? R.raw.ic_circles_big : R.raw.ic_add_person;
                i4 = z ? R.color.person_follow_green : R.color.play_fg_primary;
            } else {
                i5 = z ? R.drawable.btn_follow_green_with_highlight : R.drawable.btn_follow_blue_with_highlight;
                i3 = z ? R.raw.ic_circles_big : 0;
                i4 = z ? R.color.white : 0;
            }
            this.f3372a = i3 > 0 ? com.caverock.androidsvg.q.a(getResources(), i3, i4) : null;
            super.a(a2, i5);
        } else {
            if (this.d) {
                i = z ? R.drawable.ic_circles__big_green : R.drawable.ic_add_person;
                i2 = R.drawable.play_highlight_overlay_light;
            } else {
                int i6 = z ? R.drawable.btn_follow_green_with_highlight : R.drawable.btn_follow_blue_with_highlight;
                i = z ? R.drawable.ic_circles_white : 0;
                i2 = i6;
            }
            a(a2, i, i2);
        }
        setContentDescription(z ? a2 : resources.getString(R.string.content_description_add_on_gplus, this.c.f2850a.f1963a.i));
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        if (this.c != null) {
            this.c.d = null;
            this.c = null;
        }
        super.onDetachedFromWindow();
    }
}
