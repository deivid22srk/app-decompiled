package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* loaded from: classes.dex */
public class MultiLineDoneButtonEditText extends android.support.v7.widget.as {
    public MultiLineDoneButtonEditText(Context context) {
        super(context);
    }

    public MultiLineDoneButtonEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        editorInfo.imeOptions = (editorInfo.imeOptions & (-1073741825)) | 6;
        return onCreateInputConnection;
    }
}
