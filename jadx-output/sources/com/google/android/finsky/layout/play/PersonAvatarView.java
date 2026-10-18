package com.google.android.finsky.layout.play;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.android.vending.R;
import com.google.android.finsky.api.model.Document;
import com.google.android.finsky.protos.ds;
import com.google.android.finsky.protos.gx;
import com.google.android.play.image.FifeImageView;

/* loaded from: classes.dex */
public class PersonAvatarView extends FifeImageView {
    public PersonAvatarView(Context context) {
        this(context, null);
    }

    public PersonAvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PersonAvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void a(gx gxVar, com.google.android.finsky.navigationmanager.b bVar, com.google.android.play.image.e eVar, cy cyVar) {
        a(gxVar, gxVar.E ? bVar.a(new Document(gxVar), cyVar) : null, eVar);
    }

    public final void a(gx gxVar, View.OnClickListener onClickListener, com.google.android.play.image.e eVar) {
        ds a2 = com.google.android.play.utils.c.a(gxVar, 4);
        a(a2.f, a2.l, eVar);
        if (gxVar.E && onClickListener != null) {
            setOnClickListener(onClickListener);
            setContentDescription(getResources().getString(R.string.content_description_view_gplus_profile, gxVar.i));
            setFocusable(true);
        } else {
            setOnClickListener(null);
            setClickable(false);
            setContentDescription(null);
            setFocusable(false);
        }
    }
}
