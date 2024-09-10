package com.study.sep10;

public class Tv {

    private boolean isOn;       // false 상태(전원이 꺼져 있는 상태)
    private int volume;

    // Tv 전원을 켜 주는 메소드
    // turnOn
    // 볼륨을 높이는 버튼을 누르는 메소드
    // volumeUp
    // 음소거 버튼을 눌러 볼륨을 0으로 만드는 메소드
    // mute
    // 볼륨이 0이 됐을 때 Tv 전원을 끌 수 있는 메소드
    // turnOff




    public void turnOn() {
        if(isOn) {
            System.out.println("이미 전원이 켜져 있습니다.");
        } else {
            this.isOn = true;
            System.out.println("전원 버튼을 눌렀습니다. 전원을 켭니다.");
        }
    }

    public void volumeUp() {
        if(isOn) {
            System.out.println("볼륨 버튼을 눌렀습니다. 볼륨을 높입니다.");
            this.volume += 10;
            System.out.println("현재 볼륨은 " + this.volume + "입니다.");
        } else {
            System.out.println("전원이 켜져 있지 않습니다. 전원을 먼저 켜주세요.");
        }
    }

    public void mute() {
        if(isOn) {
            if (this.volume > 0) {
                this.volume = 0;
                System.out.println("음소거 버튼을 눌렀습니다. 소리를 음소거 합니다.");
            } else {
                System.out.println("이미 소리가 음소거 상태입니다.");
            }
        } else {
            System.out.println("전원이 켜져 있지 않습니다. 전원을 먼저 켜주세요.");
        }
    }

    public void turnOff() {
        if(isOn) {
            if(this.volume > 0) {
                System.out.println("볼륨이 키워져 있는 상태에서 전원을 끌 수 없습니다. 음소거 버튼을 먼저 눌러주세요.");
            } else {
                this.isOn = false;
                System.out.println("전원을 끕니다. 다시 작동하려면 전원 버튼을 눌러주세요.");
            }
        } else {
            System.out.println("이미 전원이 꺼져 있는 상태입니다. 전원 상태를 확인해주세요.");
        }
    }
}
