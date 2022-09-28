package ch7;
 
class VCR {
    boolean power;
    int counter = 0;
    void power() {power =! power;}
    void play() {/*내용 생략*/}
    void stop() {/*내용 생략*/}
    void rew() {/*내용 생략*/}
    void ff() {/*내용 생략*/}
    
}
// 단일 상속만 허용하므로 비중이 높은 클래스 Tv를 상속받고 VCR클래스는 포함을 통해 다중상속을 피하고 코드의 재사용성을 높인다.
public class TVCR extends Tv{
    VCR vcr = new VCR();
    int counter = vcr.counter;
    
 
    void play() {
        vcr.play();
    }
 
    void stop() {
        vcr.stop();
    }
 
    void rew() {
        vcr.rew();
    }
 
    void ff() {
        vcr.ff();
    }
 
}