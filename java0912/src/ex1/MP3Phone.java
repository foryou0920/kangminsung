
package ex1;

public class MP3Phone extends Ex1_Super {
    private int size;
    public MP3Phone(String model, String num,int chord,int size){
        this.size = size;
        super.model=model;
        super.chord =chord;
        
        
    }

    public int getSize() {
        return size;
    }

}
