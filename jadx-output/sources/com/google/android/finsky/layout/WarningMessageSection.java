package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.api.model.Document;

/* loaded from: classes.dex */
public class WarningMessageSection extends LinearLayout implements com.google.android.finsky.detailspage.bp, com.google.android.finsky.detailspage.bq {

    /* renamed from: a, reason: collision with root package name */
    public TextView f3100a;

    /* renamed from: b, reason: collision with root package name */
    public TextView f3101b;
    public ImageView c;
    public boolean d;

    public WarningMessageSection(Context context) {
        super(context);
    }

    public WarningMessageSection(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f3100a = (TextView) findViewById(R.id.details_warning_info_first_line);
        this.f3101b = (TextView) findViewById(R.id.details_warning_info_second_line);
        this.c = (ImageView) findViewById(R.id.details_warning_info_icon);
    }

    public static boolean a(Document document) {
        return document.E() != null && document.E().P;
    }

    public static boolean a(Document document, com.google.android.finsky.g.a aVar) {
        if (document.f1963a.e != 1) {
            return false;
        }
        for (com.google.android.finsky.protos.ea eaVar : document.f1963a.u) {
            if (eaVar.E != null && (eaVar.d > 0 || eaVar.y)) {
                return !com.google.android.finsky.utils.cy.a(document, aVar);
            }
        }
        return false;
    }
}
