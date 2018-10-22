package sample;

import javafx.scene.control.Label;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.RadioButton;

public class Controller {
    public Label theQuestion;
    public RadioButton button1, button2, button3, button4;

    ToggleGroup answer;

    public void setTheQuestion;

    public void questionAnswered() {
        System.out.println("A question has been answered.");
        theQuestion.setText("Here is another question...");
        button1.setText("Pretzel");

    }
}
