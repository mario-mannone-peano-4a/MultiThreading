package ciaohihello;

/**
 *
 * @author mannone.mario
 */
public class CiaoHiHello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Say say1 = new Say("Ciao");
        Say say2 = new Say("Hi");
        Say say3 = new Say("Hello");
        say1.start();
        say2.start();
        say3.start();
    }
}
