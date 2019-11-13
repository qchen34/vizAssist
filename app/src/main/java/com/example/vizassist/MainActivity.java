package com.example.vizassist;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import com.example.vizassist.imagepipeline.ImageActions;
import com.example.vizassist.utilities.HttpUtilities;

import org.apache.http.client.ClientProtocolException;
import org.json.JSONException;

import java.io.IOException;
import java.net.HttpURLConnection;

public class MainActivity extends AppCompatActivity {

    private static final String UPLOAD_HTTP_URL = "http://34.83.193.190:80/Vizassist/annotate";

    private static final int IMAGE_CAPTURE_CODE = 1;
    private static final int SELECT_IMAGE_CODE = 2;


    private static final int CAMERA_PERMISSION_REQUEST = 1001;

    private MainActivityUIController mainActivityUIController;

    private Uri imageUri;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e("TAG", "Hello world");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions,
                                           int[] grantResults) {
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    }

    private void uploadImage(Bitmap bitmap) {
    }
}