class Voice {
    public void prepareVoice() {
        System.out.println("Preparing voice...");
    }

    public void hear() {
        System.out.println("Listening to the voice...");
    }
}

class Voice2 extends Voice {
    public void templateMethod() {
        prepareVoice(); 
        hear();         
    }
}
public class Main {
    public static void main(String[] args) {
        Voice2 voice2 = new Voice2();
        voice2.templateMethod();
    }
}
