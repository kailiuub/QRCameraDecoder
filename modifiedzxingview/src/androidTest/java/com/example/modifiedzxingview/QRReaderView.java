package com.example.modifiedzxingview;

import android.graphics.PointF;
import android.hardware.Camera;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import com.example.zxinglib.CamManager;

/**
 * Created by ee on 4/23/17.
 */

public class QRReaderView extends SurfaceView implements SurfaceHolder.Callback, Camera.PreviewCallback{
    // define QRReaderListener method (to be implemented during application)
    public interface QRReaderListener {
        void onQRRead(String text, PointF[] points);
    }
    // instantilize QRReaderListener
    private QRReaderListener qrListener;

    private int previwHeight;
    private int previewWidth;
    private boolean decodeEnabled = true;
    private CamManager cameraManager;




    @Override
    public void onPreviewFrame(byte[] bytes, Camera camera) {

    }

    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder) {

    }

    @Override
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {

    }


}
