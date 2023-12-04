package JavaPractice01.test;

public class MyTv implements TvInterface{
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prevChannel;
    private final int MAX_VOLUME = 100;
    private final int MIN_VOLUME = 0;
    private final int MAX_CHANNEL = 100;
    private final int MIN_CHANNEL = 1;
    MyTv(int c, int v, boolean onoff) {
        this.channel = c;
        this.volume = v;
        this.isPowerOn = onoff;
    }

    public void setChannel(int channel){
        this.prevChannel = this.channel;
        this.channel = channel;
    }
    public void setVolume(int volume){
        this.volume = volume;
    }
    public int getChannel(){
      return this.channel;
    }

    public  int getVolume(){
        return this.volume;
    }

    @Override
    public void turnOnOff() {
        isPowerOn = !this.isPowerOn;
    }

    @Override
    public void channelUp() {
        this.prevChannel = this.channel;
        if (this.channel == MAX_CHANNEL){
            setChannel(1);
        } else {
            this.channel++;
        }
    }

    @Override
    public void channelDown() {
        this.prevChannel = this.channel;
        if (this.channel == MIN_CHANNEL){
            setChannel(100);
        } else {
            this.channel--;
        }
    }

    @Override
    public void volumeUp() {
        if (this.volume == MAX_VOLUME){
            setVolume(1);
        } else {
            this.volume++;
        }
    }

    @Override
    public void volumeDown() {
        if (this.volume == MIN_VOLUME){
            setVolume(100);
        } else {
            this.volume--;
        }
    }

    @Override
    public void gotoPrevChannel() {
        if(prevChannel == 0){
            setChannel(1);
        }
        else {
            this.channel = prevChannel;
        }
    }
}
