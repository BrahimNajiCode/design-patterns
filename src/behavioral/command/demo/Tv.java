package behavioral.command.demo;

import lombok.Getter;

public class Tv {
    private boolean isOn = false;
    @Getter
    private int volume = 10;

    public void powerOn(){
        this.isOn = true;
        System.out.println("Tv is ON.");
    }

    public void powerOff(){
        this.isOn = false;
        System.out.println("Tv is OFF.");
    }

    public void setVolume(int volume){
        this.volume = Math.clamp(volume, 0, 100);
        System.out.println("Volume: "+this.volume);
    }

}
