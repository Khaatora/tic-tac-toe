package tictactoe.ui;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import tictactoe.resources.ResourcesLocation;
import tictactoe.ui.util.ScreenController;

public class SignupScreenBase extends AnchorPane {

    protected final ImageView imageView;
    protected final Text text;
    protected final Text text0;
    protected final TextField usernametxtField;
    protected final Button signupButton;
    protected final Hyperlink loginRedirect;
    protected final Text text1;
    protected final Text text2;
    protected final PasswordField passwordField;
    protected final PasswordField confirmField;

    public SignupScreenBase() {

        imageView = new ImageView();
        text = new Text();
        text0 = new Text();
        usernametxtField = new TextField();
        signupButton = new Button();
        loginRedirect = new Hyperlink();
        text1 = new Text();
        text2 = new Text();
        passwordField = new PasswordField();
        confirmField = new PasswordField();

        setId("AnchorPane");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(1000.0);
        setPrefWidth(1500.0);
        getStyleClass().add("button");

        imageView.setFitHeight(1000.0);
        imageView.setFitWidth(1500.0);
        imageView.setLayoutX(-4.0);
        imageView.setLayoutY(-1.0);
        imageView.setImage(new Image(
                ResourcesLocation.class.
                        getResource("images/backgrounds/main.jpg").toExternalForm()));

        text.setFill(javafx.scene.paint.Color.valueOf("#fcfafa"));
        text.setLayoutX(688.0);
        text.setLayoutY(159.0);
        text.setStroke(javafx.scene.paint.Color.valueOf("#1b1919"));
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("SIGNUP");
        text.setFont(new Font("Agency FB Bold", 60.0));

        text0.setFill(javafx.scene.paint.Color.valueOf("#fcfafa"));
        text0.setLayoutX(705.0);
        text0.setLayoutY(306.0);
        text0.setStroke(javafx.scene.paint.Color.valueOf("#171717"));
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Username");
        text0.setFont(new Font("Agency FB Bold", 40.0));

        usernametxtField.setLayoutX(608.0);
        usernametxtField.setLayoutY(331.0);
        usernametxtField.setPrefHeight(44.0);
        usernametxtField.setPrefWidth(348.0);
        usernametxtField.setPromptText("Enter username...");
        usernametxtField.setOpaqueInsets(new Insets(0.0, 0.0, 0.0, 10.0));

        signupButton.setLayoutX(698.0);
        signupButton.setLayoutY(778.0);
        signupButton.setMnemonicParsing(false);
        signupButton.setPrefHeight(49.0);
        signupButton.setPrefWidth(152.0);
        signupButton.getStylesheets().add("/tictactoe/resources/css/application.css");
        signupButton.setText("Signup");
        signupButton.setTextFill(javafx.scene.paint.Color.WHITE);
        signupButton.setFont(new Font("Agency FB Bold", 36.0));

        loginRedirect.setLayoutX(651.0);
        loginRedirect.setLayoutY(846.0);
        loginRedirect.setText("Have an account? Login!");
        loginRedirect.setTextFill(javafx.scene.paint.Color.valueOf("#fcfcfc"));
        loginRedirect.setFont(new Font("Agency FB", 30.0));
        loginRedirect.setOnAction((event) -> {
            ScreenController.popScreen();
        });

        text1.setFill(javafx.scene.paint.Color.valueOf("#fcfafa"));
        text1.setLayoutX(707.0);
        text1.setLayoutY(461.0);
        text1.setStroke(javafx.scene.paint.Color.valueOf("#171717"));
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Password");
        text1.setFont(new Font("Agency FB Bold", 40.0));

        text2.setFill(javafx.scene.paint.Color.valueOf("#fcfafa"));
        text2.setLayoutX(657.0);
        text2.setLayoutY(614.0);
        text2.setStroke(javafx.scene.paint.Color.valueOf("#171717"));
        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("Confirm password");
        text2.setFont(new Font("Agency FB Bold", 40.0));

        passwordField.setLayoutX(608.0);
        passwordField.setLayoutY(478.0);
        passwordField.setPrefHeight(44.0);
        passwordField.setPrefWidth(348.0);
        passwordField.setPromptText("Enter password...");

        confirmField.setLayoutX(608.0);
        confirmField.setLayoutY(638.0);
        confirmField.setPrefHeight(44.0);
        confirmField.setPrefWidth(348.0);
        confirmField.setPromptText("Enter password...");

        getChildren().add(imageView);
        getChildren().add(text);
        getChildren().add(text0);
        getChildren().add(usernametxtField);
        getChildren().add(signupButton);
        getChildren().add(loginRedirect);
        getChildren().add(text1);
        getChildren().add(text2);
        getChildren().add(passwordField);
        getChildren().add(confirmField);

    }

 

}