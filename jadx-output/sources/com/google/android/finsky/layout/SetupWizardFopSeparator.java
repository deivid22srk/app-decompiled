package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.deivid22srk.store.R;

/* loaded from: classes.dex */
public class SetupWizardFopSeparator extends SeparatorLinearLayout {
    public SetupWizardFopSeparator(Context context) {
        this(context, null);
    }

    public SetupWizardFopSeparator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.finsky.layout.SeparatorLinearLayout
    public final int a(Resources resources) {
        return resources.getColor(R.color.setup_wizard_divider_color);
    }
}
