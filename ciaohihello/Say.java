package ciaohihello;

/**
 *
 * @author mannone.mario
 */
public class Say extends Thread {

    public String cosaDire;

    public Say(String cosaDire) {
        this.cosaDire = cosaDire;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(cosaDire);
        }
    }
}
