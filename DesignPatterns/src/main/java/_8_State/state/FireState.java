package _8_State.state;

public class FireState implements ITransformerState{

    @Override
    public void action() {
        System.out.println("Transformer is firing.");
    }

}
