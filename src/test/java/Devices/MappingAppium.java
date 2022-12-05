package Devices;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class MappingAppium {

    public MobileDevices convertToObject() throws IOException {
        MobileDevices devices = new ObjectMapper().readValue(new File("F:\\4.yil_birinci_dnem\\pratik.dev\\QACase\\src\\test\\resources\\Capabilities\\Android.json"), MobileDevices.class);
        return devices;
    }
}
