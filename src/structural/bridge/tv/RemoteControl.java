package structural.bridge.tv;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class RemoteControl {
    protected Device device;
    public abstract void togglePower();
}
