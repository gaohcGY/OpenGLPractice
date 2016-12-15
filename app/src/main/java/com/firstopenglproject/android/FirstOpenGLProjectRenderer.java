package com.firstopenglproject.android;

import android.opengl.GLSurfaceView;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import static android.opengl.GLES20.*;

/**
 * 
 * Created by gaohc on 2016/12/13.
 */
public class FirstOpenGLProjectRenderer implements GLSurfaceView.Renderer{
    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
        glClearColor(1.0f, 1.0f, 0.0f, 0.9f);
    }

    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height) {
        // Set the OpenGL viewport to fill the entire surface.
        glViewport(0, 0, width/2, height);
    }

    @Override
    public void onDrawFrame(GL10 gl) {
        // Clear the rendering surface
        glClear(GL_COLOR_BUFFER_BIT);
    }
}
