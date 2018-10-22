package sample;

import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class Controller {
    public Label theQuestion;
    public RadioButton button1;
    public RadioButton button2;
    public RadioButton button3;
    public RadioButton button4;

    public void questionAnswered() {
        System.out.println("A question has been answered.");
        theQuestion.setText("Here is another question...");
        button1.setText("Pretzel");

    }
}
