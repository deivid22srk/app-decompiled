package com.google.android.play.search;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.EditText;

/* loaded from: classes.dex */
public class PlaySearchEditText extends EditText {
    public PlaySearchEditText(Context context) {
        super(context);
    }

    public PlaySearchEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (Build.VERSION.SDK_INT < 11 || Build.VERSION.SDK_INT > 22) {
            return;
        }
        setCustomSelectionActionModeCallback(new m(this));
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i == 4 && hasFocus() && keyEvent.getAction() == 1) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState != null) {
                keyDispatcherState.handleUpEvent(keyEvent);
            }
            if (!keyEvent.isCanceled()) {
                clearFocus();
                return true;
            }
        }
        return super.onKeyPreIme(i, keyEvent);
    }
}
