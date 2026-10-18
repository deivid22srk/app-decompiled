package com.google.android.finsky.detailspage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.android.vending.R;
import com.google.android.finsky.layout.AccessibleLinearLayout;

/* loaded from: classes.dex */
public class ArtistRadioModuleLayout extends AccessibleLinearLayout implements View.OnClickListener, bp, bq {

    /* renamed from: a, reason: collision with root package name */
    h f2478a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f2479b;

    public ArtistRadioModuleLayout(Context context) {
        this(context, null);
    }

    public ArtistRadioModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        setOnClickListener(this);
        this.f2479b = (TextView) findViewById(R.id.artist_radio_station_button_text);
        this.f2479b.setText(getContext().getString(R.string.artist_radio_station_text).toUpperCase());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f2478a != null) {
            this.f2478a.a();
        }
    }
}
