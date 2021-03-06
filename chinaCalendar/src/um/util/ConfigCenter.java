package um.util;

import android.content.Context;
import android.content.SharedPreferences;

public class ConfigCenter {
	public static final String PRE_NAME = "args";
	
	private static SharedPreferences getSharedPreferences(Context context){
		return context.getSharedPreferences(PRE_NAME, Context.MODE_PRIVATE);
	}
	
	public static void setValue(Context context,String key,String value){
		SharedPreferences.Editor editor = getSharedPreferences(context).edit();
		editor.putString(key, value);
		editor.commit();
	}
	
	public static String getValue(Context context,String key,String defaultValue){
		String ret = getSharedPreferences(context).getString(key, defaultValue);
		if(ret == null){
			ret = defaultValue;
		}
		return ret;
	}
	
	public static void setValue(Context context,String key,int value){
		SharedPreferences.Editor editor = getSharedPreferences(context).edit();
		editor.putInt(key, value);
		editor.commit();
	}
	
	public static int getValue(Context context,String key,int defaultValue){
		int ret = getSharedPreferences(context).getInt(key, defaultValue);		
		return ret;		
	}
	
	public static void setValue(Context context,String key,boolean value){
		SharedPreferences.Editor editor = getSharedPreferences(context).edit();
		editor.putBoolean(key, value);
		editor.commit();
	}
	
	
	public static boolean getValue(Context context,String key,boolean defValue){
		return getSharedPreferences(context).getBoolean(key, defValue);
	}

}
