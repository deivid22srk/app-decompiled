package com.google.android.finsky.setup;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.android.vending.R;

@TargetApi(19)
/* loaded from: classes.dex */
public class SetupWizardNavBar extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    public Button f4642a;

    /* renamed from: b, reason: collision with root package name */
    public Button f4643b;
    private ViewGroup c;

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Activity activity = getActivity();
        TypedArray obtainStyledAttributes = getActivity().obtainStyledAttributes(new int[]{R.attr.setup_wizard_navbar_theme, android.R.attr.colorForeground, android.R.attr.colorBackground});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId == 0) {
            float[] fArr = new float[3];
            float[] fArr2 = new float[3];
            Color.colorToHSV(obtainStyledAttributes.getColor(1, 0), fArr);
            Color.colorToHSV(obtainStyledAttributes.getColor(2, 0), fArr2);
            resourceId = (fArr[2] > fArr2[2] ? 1 : (fArr[2] == fArr2[2] ? 0 : -1)) > 0 ? R.style.SetupWizardNavbarThemeDark : R.style.SetupWizardNavbarThemeLight;
        }
        obtainStyledAttributes.recycle();
        this.c = (ViewGroup) LayoutInflater.from(new ContextThemeWrapper(activity, resourceId)).inflate(R.layout.setup_wizard_navbar_layout, viewGroup, false);
        this.f4642a = (Button) this.c.findViewById(R.id.positive_button);
        this.f4643b = (Button) this.c.findViewById(R.id.negative_button);
        a();
        return this.c;
    }

    public final void a() {
        this.f4642a = (Button) this.c.findViewById(R.id.positive_button);
        this.f4642a.setText(R.string.setup_wizard_next_button_label);
        this.f4642a.setOnClickListener(null);
        this.f4642a.setEnabled(true);
        this.f4643b.setOnClickListener(new q(this));
        this.f4643b.setEnabled(true);
    }

    public class NavButton extends Button {

        /* renamed from: a, reason: collision with root package name */
        private float f4644a;

        @TargetApi(21)
        public NavButton(Context context, AttributeSet attributeSet, int i, int i2) {
            super(context, attributeSet, i, i2);
            a();
        }

        public NavButton(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            a();
        }

        public NavButton(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            a();
        }

        public NavButton(Context context) {
            super(context);
            a();
        }

        private void a() {
            TypedValue typedValue = new TypedValue();
            getResources().getValue(R.dimen.setup_wizard_navbar_positive_button_disabled_alpha, typedValue, true);
            this.f4644a = typedValue.getFloat();
        }

        @Override // android.widget.TextView, android.view.View
        public void setEnabled(boolean z) {
            super.setEnabled(z);
            setAlpha(z ? 1.0f : this.f4644a);
        }

        @Override // android.widget.TextView
        public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
            if (getId() == R.id.negative_button) {
                charSequence = "";
            }
            super.setText(charSequence, bufferType);
        }
    }
}
