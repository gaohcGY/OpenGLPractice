package android.firstopenglproject.com.airhockey1;

import android.opengl.GLSurfaceView;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import static android.opengl.GLES20.*;

/**
 * AirHockeyRenderer
 * Created by gaohc on 2016/12/15.
 */
public class AirHockeyRenderer implements GLSurfaceView.Renderer{
    
    private static final int POSITION_COMPOENT_COUNT = 2;
    
    private static final int BYTES_PRE_FLOAT = 4;
    private final FloatBuffer vertexData;
    
    private float[] tableVerticesWithTriangles = {
            // Triangle 1
            0f, 0f,
            9f, 14f,
            0f, 14f,
            // Triangle 2
            0f, 0f,
            9f, 0f,
            9f, 14f,
            
            // Line 1
            0f, 7f,
            9f, 7f,
            
            // Mallets
            4.5f, 2f,
            4,5f, 12f
    };
    
    public AirHockeyRenderer() {
        vertexData = ByteBuffer.allocateDirect(tableVerticesWithTriangles.length * BYTES_PRE_FLOAT).order(ByteOrder.nativeOrder()).asFloatBuffer();
        vertexData.put(tableVerticesWithTriangles);
    }
    
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
