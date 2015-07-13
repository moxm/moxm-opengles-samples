package com.moxm.frameworks.samples.opengl;

import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.moxm.frameworks.samples.opengl.view.GLRenderer;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 创建一个GLSurfaceView，用于显示OpenGL绘制的图形
        GLSurfaceView glView = new GLSurfaceView(this);
        // 创建GLSurfaceView的内容绘制器
        GLRenderer renderer = new GLRenderer();
        // 为GLSurfaceView设置绘制器
        glView.setRenderer(renderer);
        setContentView(glView);
    }

}
