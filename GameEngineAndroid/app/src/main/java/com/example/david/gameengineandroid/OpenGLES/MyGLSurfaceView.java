package com.example.david.gameengineandroid.OpenGLES;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

/**
 * Created by David on 18/11/2015.
 */
public class MyGLSurfaceView extends GLSurfaceView {

 //   private final MyGLRenderer mRenderer;


    public MyGLSurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);
        // Create an OpenGL ES 2.0 context
        setEGLContextClientVersion(2);

      //  mRenderer = new MyGLRenderer();

        // Set the Renderer for drawing on the GLSurfaceView
       // setRenderer(mRenderer);
    }
}
