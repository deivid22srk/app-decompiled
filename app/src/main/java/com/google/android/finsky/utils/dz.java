package com.google.android.finsky.utils;

import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.text.TextUtils;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class dz {

    /* renamed from: a, reason: collision with root package name */
    protected static final String[] f4840a = {"android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR"};

    /* renamed from: b, reason: collision with root package name */
    protected static final String[] f4841b = {"android.permission.CAMERA"};
    protected static final String[] c = {"android.permission.GET_ACCOUNTS", "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"};
    protected static final String[] d = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "com.google.android.gms.permission.CAR_SPEED"};
    protected static final String[] e = {"android.permission.RECORD_AUDIO"};
    protected static final String[] f = {"android.permission.CALL_PHONE", "android.permission.PROCESS_OUTGOING_CALLS", "android.permission.READ_CALL_LOG", "android.permission.READ_PHONE_STATE", "android.permission.USE_SIP", "android.permission.WRITE_CALL_LOG", "com.android.voicemail.permission.ADD_VOICEMAIL"};
    protected static final String[] g = {"android.permission.BODY_SENSORS"};
    protected static final String[] h = {"android.permission.READ_SMS", "android.permission.READ_CELL_BROADCASTS", "android.permission.RECEIVE_SMS", "android.permission.RECEIVE_MMS", "android.permission.RECEIVE_WAP_PUSH", "android.permission.SEND_SMS"};
    protected static final String[] i = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
    private static Map<String, Integer> j = null;

    public static ep a(String[] strArr, Set<String> set) {
        Map<String, Integer> unmodifiableMap;
        eo[] eoVarArr = new eo[10];
        if (strArr == null) {
            return new ep(eoVarArr, 9, false);
        }
        if (j != null) {
            unmodifiableMap = j;
        } else {
            HashMap hashMap = new HashMap();
            for (String str : f4841b) {
                hashMap.put(str, 1);
            }
            for (String str2 : f4840a) {
                hashMap.put(str2, 0);
            }
            for (String str3 : c) {
                hashMap.put(str3, 2);
            }
            for (String str4 : d) {
                hashMap.put(str4, 3);
            }
            for (String str5 : e) {
                hashMap.put(str5, 4);
            }
            for (String str6 : f) {
                hashMap.put(str6, 5);
            }
            for (String str7 : g) {
                hashMap.put(str7, 6);
            }
            for (String str8 : h) {
                hashMap.put(str8, 7);
            }
            for (String str9 : i) {
                hashMap.put(str9, 8);
            }
            unmodifiableMap = Collections.unmodifiableMap(hashMap);
            j = unmodifiableMap;
        }
        Set a2 = ht.a(strArr);
        if (set != null) {
            a2.removeAll(set);
        }
        a(unmodifiableMap, a2, true, eoVarArr);
        if (set != null) {
            a(unmodifiableMap, set, false, eoVarArr);
        }
        return new ep(eoVarArr, 9, false);
    }

    private static void a(Map<String, Integer> map, Set<String> set, boolean z, eo[] eoVarArr) {
        PermissionInfo permissionInfo;
        boolean z2;
        boolean booleanValue = com.google.android.finsky.cpkg.d.H.b().booleanValue();
        String[] d2 = jm.d(com.google.android.finsky.cpkg.d.I.b());
        for (String str : set) {
            try {
                permissionInfo = FinskyApp.a().getPackageManager().getPermissionInfo(str, 0);
            } catch (PackageManager.NameNotFoundException e2) {
                permissionInfo = null;
            }
            if (permissionInfo != null) {
                Integer num = map.get(str);
                if (num == null) {
                    int i2 = permissionInfo.protectionLevel & 15;
                    if (!booleanValue || i2 == 1) {
                        if (i2 != 2 || "android.permission.SYSTEM_ALERT_WINDOW".equals(str)) {
                            switch (str) {
                                case "android.permission.READ_PROFILE":
                                case "android.permission.WRITE_PROFILE":
                                case "android.permission.READ_SOCIAL_STREAM":
                                case "android.permission.WRITE_SOCIAL_STREAM":
                                case "android.permission.READ_USER_DICTIONARY":
                                case "android.permission.WRITE_USER_DICTIONARY":
                                case "android.permission.WRITE_SMS":
                                case "com.android.browser.permission.READ_HISTORY_BOOKMARKS":
                                case "com.android.browser.permission.WRITE_HISTORY_BOOKMARKS":
                                case "android.permission.AUTHENTICATE_ACCOUNTS":
                                case "android.permission.MANAGE_ACCOUNTS":
                                case "android.permission.USE_CREDENTIALS":
                                case "android.permission.SUBSCRIBED_FEEDS_READ":
                                case "android.permission.SUBSCRIBED_FEEDS_WRITE":
                                    z2 = true;
                                    break;
                                default:
                                    int length = d2.length;
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 < length) {
                                            if (!d2[i3].equals(str)) {
                                                i3++;
                                            } else {
                                                z2 = true;
                                                break;
                                            }
                                        } else {
                                            z2 = false;
                                            break;
                                        }
                                    }
                            }
                            if (z2) {
                                continue;
                            } else {
                                num = 9;
                            }
                        }
                    }
                }
                eo eoVar = eoVarArr[num.intValue()];
                if (eoVar == null) {
                    switch (num.intValue()) {
                        case 0:
                            eoVar = new eo(0, R.drawable.ic_perm_cal, R.string.optional_permission_bucket_calendar_title, R.string.optional_permission_bucket_calendar_description);
                            break;
                        case 1:
                            eoVar = new eo(1, R.drawable.ic_perm_camera, R.string.optional_permission_bucket_camera_title, R.string.optional_permission_bucket_camera_description);
                            break;
                        case 2:
                            eoVar = new eo(2, R.drawable.ic_perm_contacts, R.string.optional_permission_bucket_contacts_title, R.string.optional_permission_bucket_contacts_description);
                            break;
                        case 3:
                            eoVar = new eo(3, R.drawable.ic_perm_location, R.string.optional_permission_bucket_location_title, R.string.optional_permission_bucket_location_description);
                            break;
                        case 4:
                            eoVar = new eo(4, R.drawable.ic_perm_microphone, R.string.optional_permission_bucket_mic_title, R.string.optional_permission_bucket_mic_description);
                            break;
                        case 5:
                            eoVar = new eo(5, R.drawable.ic_perm_phone, R.string.optional_permission_bucket_phone_title, R.string.optional_permission_bucket_phone_description);
                            break;
                        case 6:
                            eoVar = new eo(6, R.drawable.ic_perm_body_motion, R.string.optional_permission_bucket_sensors_title, R.string.optional_permission_bucket_sensors_description);
                            break;
                        case 7:
                            eoVar = new eo(7, R.drawable.ic_perm_messaging, R.string.optional_permission_bucket_sms_title, R.string.optional_permission_bucket_sms_description);
                            break;
                        case 8:
                            eoVar = new eo(8, R.drawable.ic_perm_media, R.string.optional_permission_bucket_storage_title, R.string.optional_permission_bucket_storage_description);
                            break;
                        case 9:
                            eoVar = new eo(9, R.drawable.ic_perm_unknown, R.string.optional_permission_bucket_other_title, R.string.optional_permission_bucket_other_description);
                            break;
                        default:
                            throw new IllegalStateException("invalid permission bucket.");
                    }
                    eoVarArr[num.intValue()] = eoVar;
                }
                CharSequence loadLabel = permissionInfo.loadLabel(FinskyApp.a().getPackageManager());
                String charSequence = loadLabel == null ? null : loadLabel.toString();
                if (!TextUtils.isEmpty(charSequence)) {
                    if (z) {
                        eoVar.f.add(charSequence);
                    } else {
                        eoVar.e.add(charSequence);
                    }
                }
            }
        }
    }
}
