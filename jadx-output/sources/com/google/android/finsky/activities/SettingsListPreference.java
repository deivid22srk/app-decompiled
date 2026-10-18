package com.google.android.finsky.activities;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.preference.ListPreference;
import android.preference.Preference;
import android.text.TextUtils;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class SettingsListPreference extends ListPreference {
    public SettingsListPreference(Context context) {
        super(context);
    }

    public SettingsListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(gi[] giVarArr) {
        int length = giVarArr.length;
        CharSequence[] charSequenceArr = new CharSequence[length];
        CharSequence[] charSequenceArr2 = new CharSequence[length];
        for (int i = 0; i < length; i++) {
            gi giVar = giVarArr[i];
            charSequenceArr[i] = getContext().getString(giVar.a());
            charSequenceArr2[i] = giVar.toString();
        }
        setEntries(charSequenceArr);
        setEntryValues(charSequenceArr2);
    }

    public final void a(gi giVar) {
        setValue(giVar.toString());
        a();
    }

    public final void a() {
        setSummary(getEntry());
    }

    @Override // android.preference.ListPreference, android.preference.DialogPreference, android.preference.Preference
    protected void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        setEntries(savedState.f1525a);
        setEntryValues(savedState.f1526b);
        setValue(savedState.c);
        setSummary(savedState.d);
        super.onRestoreInstanceState(savedState.getSuperState());
    }

    @Override // android.preference.ListPreference, android.preference.DialogPreference, android.preference.Preference
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1525a = getEntries();
        savedState.f1526b = getEntryValues();
        savedState.c = getValue();
        savedState.d = getSummary();
        return savedState;
    }

    class SavedState extends Preference.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new gh();

        /* renamed from: a, reason: collision with root package name */
        private CharSequence[] f1525a;

        /* renamed from: b, reason: collision with root package name */
        private CharSequence[] f1526b;
        private String c;
        private CharSequence d;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f1525a = a(parcel);
            this.f1526b = a(parcel);
            this.c = parcel.readString();
            this.d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            a(parcel, this.f1525a);
            a(parcel, this.f1526b);
            parcel.writeString(this.c);
            TextUtils.writeToParcel(this.d, parcel, 0);
        }

        private static void a(Parcel parcel, CharSequence[] charSequenceArr) {
            if (charSequenceArr != null) {
                parcel.writeInt(charSequenceArr.length);
                for (CharSequence charSequence : charSequenceArr) {
                    TextUtils.writeToParcel(charSequence, parcel, 0);
                }
                return;
            }
            parcel.writeInt(-1);
        }

        private static CharSequence[] a(Parcel parcel) {
            int readInt = parcel.readInt();
            CharSequence[] charSequenceArr = new CharSequence[readInt];
            for (int i = 0; i < readInt; i++) {
                charSequenceArr[i] = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            }
            return charSequenceArr;
        }
    }
}
