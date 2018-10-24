package sample;

import javafx.scene.control.Label;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.RadioButton;
import javafx.scene.control.RadioButton;

public class Controller {
    public Label theQuestion;
    public Label Listening;
    public RadioButton button1, button2, button3, button4;

    ToggleGroup answer;
    public void answerChoose() {

    }

    public void questionAnswered() {
        System.out.println("A question has been answered.");
        theQuestion.setText("Question 2: If you won the lottery,");
        button1.setText("Work as a tour guide.");
        button2.setText("Call the authorities.");
        button3.setText("Ignore it.");
        button4.setText("");
        Listening.setText("Question 2 of 3");
    }
}
