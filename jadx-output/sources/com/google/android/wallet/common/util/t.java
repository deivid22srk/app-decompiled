package com.google.android.wallet.common.util;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.telephony.SmsMessage;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class t {
    public static String a(SmsMessage[] smsMessageArr) {
        if (smsMessageArr.length == 1) {
            return a(smsMessageArr[0].getDisplayMessageBody());
        }
        StringBuilder sb = new StringBuilder();
        for (SmsMessage smsMessage : smsMessageArr) {
            try {
                sb.append(smsMessage.getDisplayMessageBody());
            } catch (NullPointerException e) {
            }
        }
        return a(sb.toString());
    }

    private static String a(String str) {
        return str == null ? "" : str.replace('\f', '\n');
    }

    public static ArrayList<ContentValues> a(Context context, long j, Pattern pattern) {
        ArrayList<ContentValues> arrayList = new ArrayList<>();
        StringBuilder sb = new StringBuilder(30);
        sb.append("date > ").append(j);
        Cursor query = context.getContentResolver().query(Uri.parse("content://sms/inbox"), new String[]{"address", "date", "body"}, sb.toString(), null, null);
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    String string = query.getString(0);
                    if (pattern == null || pattern.matcher(string).matches()) {
                        ContentValues contentValues = new ContentValues(3);
                        contentValues.put("address", string);
                        contentValues.put("date", Long.valueOf(query.getLong(1)));
                        contentValues.put("body", query.getString(2));
                        arrayList.add(contentValues);
                    }
                } finally {
                    query.close();
                }
            }
        }
        return arrayList;
    }
}
