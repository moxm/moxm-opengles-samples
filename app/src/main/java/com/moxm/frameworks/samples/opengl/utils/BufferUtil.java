package com.moxm.frameworks.samples.opengl.utils;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/**
 * Created by Richard on 15/7/13.
 */
public class BufferUtil {

    public static FloatBuffer floatToBuffer(float[] a){
        FloatBuffer buffer;
        //先初始化buffer，数组的长度*4，因为一个float占4个字节
        ByteBuffer mbb = ByteBuffer.allocateDirect(a.length*4);
        //数组排序用nativeOrder
        mbb.order(ByteOrder.nativeOrder());
        buffer = mbb.asFloatBuffer();
        buffer.put(a);
        buffer.position(0);
        return buffer;
    }
    public static IntBuffer intToBuffer(int[] a){
        IntBuffer buffer;
        //先初始化buffer，数组的长度*4，因为一个float占4个字节
        ByteBuffer mbb = ByteBuffer.allocateDirect(a.length*4);
        //数组排序用nativeOrder
        mbb.order(ByteOrder.nativeOrder());
        buffer = mbb.asIntBuffer();
        buffer.put(a);
        buffer.position(0);
        return buffer;
    }
}
