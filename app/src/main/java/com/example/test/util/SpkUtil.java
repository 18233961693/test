package com.example.test.util;

import android.content.Context;
import android.widget.Toast;

public class SpkUtil {

    public static void testLog(Context mContext, String message){
        Toast.makeText(mContext,message,Toast.LENGTH_SHORT).show();
    }
}
