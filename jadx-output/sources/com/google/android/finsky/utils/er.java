package com.google.android.finsky.utils;

import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.text.TextUtils;
import com.deivid22srk.store.R;
import com.google.android.finsky.FinskyApp;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class er {

    /* renamed from: a, reason: collision with root package name */
    protected static final String[] f4857a = {"com.deivid22srk.store.BILLING"};

    /* renamed from: b, reason: collision with root package name */
    protected static final String[] f4858b = {"android.permission.GET_ACCOUNTS", "android.permission.MANAGE_ACCOUNTS", "android.permission.READ_PROFILE", "android.permission.WRITE_PROFILE"};
    protected static final String[] c = {"android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR"};
    protected static final String[] d = {"android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"};
    protected static final String[] e = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_LOCATION_EXTRA_COMMANDS", "android.permission.ACCESS_GPS", "com.google.android.gms.permission.CAR_SPEED"};
    protected static final String[] f = {"android.permission.RECEIVE_SMS", "android.permission.READ_SMS", "android.permission.WRITE_SMS", "android.permission.SEND_SMS", "android.permission.RECEIVE_MMS", "android.permission.RECEIVE_WAP_PUSH"};
    protected static final String[] g = {"android.permission.CALL_PHONE", "android.permission.WRITE_CALL_LOG", "android.permission.READ_CALL_LOG", "android.permission.CALL_PRIVILEGED", "android.permission.PROCESS_OUTGOING_CALLS", "android.permission.MODIFY_PHONE_STATE"};
    protected static final String[] h = {"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.MOUNT_FORMAT_FILESYSTEMS", "android.permission.MOUNT_UNMOUNT_FILESYSTEMS"};
    protected static final String[] i = {"android.permission.CAMERA", "android.permission.RECORD_VIDEO"};
    protected static final String[] j = {"android.permission.RECORD_AUDIO"};
    protected static final String[] k = {"android.permission.READ_LOGS", "android.permission.GET_TASKS", "android.permission.DUMP", "com.android.browser.permission.READ_HISTORY_BOOKMARKS"};
    protected static final String[] l = {"android.permission.WRITE_APN_SETTINGS"};
    protected static final String[] m = {"android.permission.ACCESS_WIFI_STATE"};
    protected static final String[] n = {"android.permission.BLUETOOTH_ADMIN"};
    protected static final String[] o = {"android.permission.READ_PHONE_STATE"};
    protected static final String[] p = {"android.permission.BODY_SENSORS"};
    protected static final String[] q = {"android.permission.ACCESS_MOCK_LOCATION", "android.permission.ACCESS_NETWORK_STATE", "android.permission.ACCOUNT_MANAGER", "android.permission.AUTHENTICATE_ACCOUNTS", "android.permission.BATTERY_STATS", "android.permission.BLUETOOTH", "android.permission.BROADCAST_STICKY", "android.permission.CHANGE_CONFIGURATION", "android.permission.CHANGE_NETWORK_STATE", "android.permission.CHANGE_WIFI_MULTICAST_STATE", "android.permission.CHANGE_WIFI_STATE", "android.permission.CHANGE_WIMAX_STATE", "android.permission.CLEAR_APP_CACHE", "android.permission.DISABLE_KEYGUARD", "android.permission.EXPAND_STATUS_BAR", "android.permission.FLASHLIGHT", "android.permission.GET_PACKAGE_SIZE", "android.permission.INTERNET", "android.permission.KILL_BACKGROUND_PROCESSES", "android.permission.MODIFY_AUDIO_SETTINGS", "android.permission.NFC", "android.permission.PERSISTENT_ACTIVITY", "android.permission.READ_SYNC_SETTINGS", "android.permission.READ_USER_DICTIONARY", "android.permission.RECEIVE_BOOT_COMPLETED", "android.permission.REORDER_TASKS", "android.permission.SERIAL_PORT", "android.permission.SET_ALWAYS_FINISH", "android.permission.SET_ANIMATION_SCALE", "android.permission.SET_DEBUG_APP", "android.permission.SET_PREFERRED_APPLICATIONS", "android.permission.SET_PROCESS_LIMIT", "android.permission.SET_TIME_ZONE", "android.permission.SET_WALLPAPER", "android.permission.SIGNAL_PERSISTENT_PROCESSES", "android.permission.SYSTEM_ALERT_WINDOW", "android.permission.USE_CREDENTIALS", "android.permission.USE_SIP", "android.permission.VIBRATE", "android.permission.WAKE_LOCK", "android.permission.WRITE_SETTINGS", "android.permission.WRITE_SYNC_SETTINGS", "android.permission.WRITE_USER_DICTIONARY", "com.android.alarm.permission.SET_ALARM", "com.android.browser.permission.WRITE_HISTORY_BOOKMARKS", "com.android.launcher.permission.INSTALL_SHORTCUT", "com.android.launcher.permission.UNINSTALL_SHORTCUT", "com.deivid22srk.store.CHECK_LICENSE", "com.google.android.providers.gsf.permission.READ_GSERVICES"};
    private static Map<String, Integer> r = null;
    private static Set<String> s = null;

    public static ep a(String[] strArr, Set<String> set, boolean z) {
        return a(strArr, set, z, false);
    }

    public static ep a(String[] strArr, Set<String> set, boolean z, boolean z2) {
        Map<String, Integer> map;
        Set a2;
        boolean z3;
        boolean z4;
        boolean z5;
        eo[] eoVarArr = new eo[17];
        if (strArr == null) {
            return new ep(eoVarArr, 16, false);
        }
        if (r != null) {
            map = r;
        } else {
            HashMap hashMap = new HashMap();
            for (String str : f4857a) {
                hashMap.put(str, 0);
            }
            for (String str2 : f4858b) {
                hashMap.put(str2, 3);
            }
            for (String str3 : d) {
                hashMap.put(str3, 5);
            }
            for (String str4 : c) {
                hashMap.put(str4, 4);
            }
            for (String str5 : e) {
                hashMap.put(str5, 6);
            }
            for (String str6 : f) {
                hashMap.put(str6, 7);
            }
            for (String str7 : g) {
                hashMap.put(str7, 8);
            }
            for (String str8 : h) {
                hashMap.put(str8, 9);
            }
            for (String str9 : i) {
                hashMap.put(str9, 10);
            }
            for (String str10 : j) {
                hashMap.put(str10, 11);
            }
            for (String str11 : k) {
                hashMap.put(str11, 1);
            }
            for (String str12 : l) {
                hashMap.put(str12, 2);
            }
            for (String str13 : m) {
                hashMap.put(str13, 12);
            }
            for (String str14 : n) {
                hashMap.put(str14, 13);
            }
            for (String str15 : o) {
                hashMap.put(str15, 14);
            }
            for (String str16 : p) {
                hashMap.put(str16, 15);
            }
            Map<String, Integer> unmodifiableMap = Collections.unmodifiableMap(hashMap);
            r = unmodifiableMap;
            map = unmodifiableMap;
        }
        if (!z) {
            if (set != null) {
                Set a3 = ht.a(strArr);
                a3.removeAll(set);
                Set<String> keySet = map.keySet();
                Iterator it = a3.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (keySet.contains((String) it.next())) {
                            z5 = true;
                            break;
                        }
                    } else {
                        HashSet a4 = ht.a(a3);
                        a4.removeAll(keySet);
                        Iterator it2 = a4.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z5 = false;
                                break;
                            }
                            if (a((String) it2.next())) {
                                z5 = true;
                                break;
                            }
                        }
                    }
                }
                if (!z5) {
                    return new ep(eoVarArr, 16, false);
                }
                z4 = true;
            } else {
                z4 = false;
            }
            set = null;
            z3 = z4;
            a2 = ht.a(strArr);
        } else {
            a2 = ht.a(strArr);
            if (set != null) {
                a2.removeAll(set);
            }
            z3 = false;
        }
        a(map, a2, z2, true, eoVarArr);
        if (set != null) {
            a(map, set, z2, false, eoVarArr);
        }
        return new ep(eoVarArr, 16, z3);
    }

    public static void a(com.google.android.finsky.b.s sVar, String str) {
        sVar.f(str, 1);
    }

    public static boolean b(com.google.android.finsky.b.s sVar, String str) {
        com.google.android.finsky.b.y a2;
        com.google.android.finsky.b.t a3 = sVar.a(str);
        boolean z = a3 != null && a3.s == 1;
        if (!z && (a2 = FinskyApp.a().v.a(str)) != null) {
            return a2.d;
        }
        return z;
    }

    private static void a(Map<String, Integer> map, Set<String> set, boolean z, boolean z2, eo[] eoVarArr) {
        for (String str : set) {
            Integer num = map.get(str);
            if (num == null) {
                if (s == null) {
                    s = ht.a(q);
                    if (FinskyApp.a().e().a(12607368L)) {
                        s.remove("android.permission.SYSTEM_ALERT_WINDOW");
                    }
                }
                boolean contains = s.contains(str);
                if ((contains && z) || (!contains && a(str))) {
                    num = 16;
                }
            }
            eo eoVar = eoVarArr[num.intValue()];
            if (eoVar == null) {
                switch (num.intValue()) {
                    case 0:
                        eoVar = new eo(0, R.drawable.ic_perm_in_app_purchases, R.string.permission_bucket_in_app_purchases_title, R.string.permission_bucket_in_app_purchases_description);
                        break;
                    case 1:
                        eoVar = new eo(1, R.drawable.ic_perm_history, R.string.permission_bucket_device_and_app_history_title, R.string.permission_bucket_device_and_app_history_description);
                        break;
                    case 2:
                        eoVar = new eo(2, R.drawable.ic_perm_data_setting, R.string.permission_bucket_redirect_internet_traffic_title, R.string.permission_bucket_redirect_internet_traffic_description);
                        break;
                    case 3:
                        eoVar = new eo(3, R.drawable.ic_perm_identity, R.string.permission_bucket_identity_title, R.string.permission_bucket_identity_description);
                        break;
                    case 4:
                        eoVar = new eo(4, R.drawable.ic_perm_cal, R.string.permission_bucket_calendar_title, R.string.permission_bucket_calendar_description);
                        break;
                    case 5:
                        eoVar = new eo(5, R.drawable.ic_perm_contacts, R.string.permission_bucket_contacts_title, R.string.permission_bucket_contacts_description);
                        break;
                    case 6:
                        eoVar = new eo(6, R.drawable.ic_perm_location, R.string.permission_bucket_location_title, R.string.permission_bucket_location_description);
                        break;
                    case 7:
                        eoVar = new eo(7, R.drawable.ic_perm_messaging, R.string.permission_bucket_sms_title, R.string.permission_bucket_sms_description);
                        break;
                    case 8:
                        eoVar = new eo(8, R.drawable.ic_perm_phone, R.string.permission_bucket_phone_title, R.string.permission_bucket_phone_description);
                        break;
                    case 9:
                        eoVar = new eo(9, R.drawable.ic_perm_media, R.string.permission_bucket_photos_media_files_title, R.string.permission_bucket_photos_media_files_description);
                        break;
                    case 10:
                        eoVar = new eo(10, R.drawable.ic_perm_camera, R.string.permission_bucket_camera_title, R.string.permission_bucket_camera_description);
                        break;
                    case 11:
                        eoVar = new eo(11, R.drawable.ic_perm_microphone, R.string.permission_bucket_mic_title, R.string.permission_bucket_mic_description);
                        break;
                    case 12:
                        eoVar = new eo(12, R.drawable.ic_perm_scan_wifi, R.string.permission_bucket_wifi_connection_info_title, R.string.permission_bucket_wifi_connection_info_desc);
                        break;
                    case 13:
                        eoVar = new eo(13, R.drawable.ic_perm_bluetooth_discovery, R.string.permission_bucket_bluetooth_connection_info_title, R.string.permission_bucket_bluetooth_connection_info_desc);
                        break;
                    case 14:
                        eoVar = new eo(14, R.drawable.ic_perm_deviceid, R.string.permission_bucket_device_id_and_call_information_title, R.string.permission_bucket_device_id_and_call_information_description);
                        break;
                    case 15:
                        eoVar = new eo(15, R.drawable.ic_perm_body_motion, R.string.permission_bucket_wearables_title, R.string.permissions_bucket_wearables_description);
                        break;
                    case 16:
                        eoVar = new eo(16, R.drawable.ic_perm_unknown, R.string.permission_bucket_other_title, R.string.permission_bucket_other_description);
                        break;
                    default:
                        throw new IllegalStateException("invalid permission bucket.");
                }
                eoVarArr[num.intValue()] = eoVar;
            }
            String b2 = b(str);
            if (!TextUtils.isEmpty(b2)) {
                if (z2) {
                    eoVar.f.add(b2);
                } else {
                    eoVar.e.add(b2);
                }
            }
        }
    }

    private static boolean a(String str) {
        try {
            PermissionInfo permissionInfo = FinskyApp.a().getPackageManager().getPermissionInfo(str, 0);
            if (permissionInfo != null) {
                if (permissionInfo.protectionLevel == 1) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException e2) {
        }
        return false;
    }

    private static String b(String str) {
        CharSequence loadLabel;
        try {
            PermissionInfo permissionInfo = FinskyApp.a().getPackageManager().getPermissionInfo(str, 0);
            if (permissionInfo == null || (loadLabel = permissionInfo.loadLabel(FinskyApp.a().getPackageManager())) == null) {
                return null;
            }
            return loadLabel.toString();
        } catch (PackageManager.NameNotFoundException e2) {
            return null;
        }
    }
}
