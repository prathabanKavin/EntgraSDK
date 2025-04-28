package com.entgra.entgrasdk;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.entgra.uemsdk.SdkManager;
import com.entgra.uemsdk.model.FirmwareInfo;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnRegister = findViewById(R.id.btnRegister);
        Button btnGetFirmware = findViewById(R.id.btnGetFirmware);
        tvResult = findViewById(R.id.tvResult);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result = SdkManager.registerDevice();
                tvResult.setText(result);
            }
        });

        btnGetFirmware.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<FirmwareInfo> firmwares = SdkManager.getAvailableFirmwares("Galaxy-S21", "v1.0.5");
                if (firmwares.isEmpty()) {
                    tvResult.setText("No firmware updates available.");
                } else {
                    StringBuilder firmwareDetails = new StringBuilder();
                    for (FirmwareInfo firmware : firmwares) {
                        firmwareDetails.append("Version: ")
                                .append(firmware.getFirmwareVersion())
                                .append("\nDownload URL: ")
                                .append(firmware.getDownloadUrl())
                                .append("\n\n");
                    }
                    tvResult.setText(firmwareDetails.toString());
                }
            }
        });
    }
}