package com.josrangel.bottomsheetandroidjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomsheet.BottomSheetDialog;

/**
 * Source: https://www.geeksforgeeks.org/android-bottomsheet-example-in-kotlin/?ref=rp
 */

public class MainActivity extends AppCompatActivity {

    private Button btnBottomSheet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
    }

    private void initUI() {
        btnBottomSheet = findViewById(R.id.btn_show_button_sheet);
        btnBottomSheet.setOnClickListener(v -> makeBottomSheet());
    }

    private void makeBottomSheet() {
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
        View view = getLayoutInflater().inflate(R.layout.bottom_sheet_dialog, null);
        Button btnClose = view.findViewById(R.id.btn_dismiss);
        btnClose.setOnClickListener(v1 -> bottomSheetDialog.dismiss());
        bottomSheetDialog.setCancelable(false);
        bottomSheetDialog.setContentView(view);
        bottomSheetDialog.show();
    }

}