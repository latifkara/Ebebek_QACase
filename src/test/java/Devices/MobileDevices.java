package Devices;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MobileDevices {
    private String deviceName;
    private String automationName;
    private String platformVersion;
    private String platformName;
    private Boolean skipUnlock;
    private int newCommandTimeout;
    private Boolean connectHardwareKeyboard;

}
