package com.google.android.finsky.activities;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.deivid22srk.store.R;
import com.google.android.play.layout.ForegroundRelativeLayout;

/* loaded from: classes.dex */
public class FamilyLibrarySettingsRowView extends ForegroundRelativeLayout implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    CheckBox f1516a;

    /* renamed from: b, reason: collision with root package name */
    TextView f1517b;
    ImageView c;

    public FamilyLibrarySettingsRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FamilyLibrarySettingsRowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f1517b = (TextView) findViewById(R.id.vertical_name);
        this.c = (ImageView) findViewById(R.id.vertical_icon);
        this.f1516a = (CheckBox) findViewById(R.id.vertical_checkbox);
        setOnClickListener(this);
        this.f1516a.setSaveEnabled(false);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f1516a.setChecked(!this.f1516a.isChecked());
    }
}
