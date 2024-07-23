package tictactoe.ui;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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

public class LoginScreenBase extends AnchorPane {

    protected final ImageView imageView;
    protected final Text text;
    protected final Text text0;
    protected final TextField usernameTxtField;
    protected final Text text1;
    protected final Button loginButton;
    protected final Hyperlink hyperlink;
    protected final PasswordField passwordField;
    protected final Button backButton;

    public LoginScreenBase() {

        imageView = new ImageView();
        text = new Text();
        text0 = new Text();
        usernameTxtField = new TextField();
        text1 = new Text();
        loginButton = new Button();
        hyperlink = new Hyperlink();
        passwordField = new PasswordField();
        backButton = new Button();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(1000.0);
        setPrefWidth(1500.0);

        imageView.setFitHeight(1000.0);
        imageView.setFitWidth(1500.0);
        imageView.setImage(new Image(
                ResourcesLocation.class.
                        getResource("images/backgrounds/main.jpg").toExternalForm()));
        
        text.setFill(javafx.scene.paint.Color.valueOf("#f2f0f0"));
        text.setLayoutX(692.0);
        text.setLayoutY(190.0);
        text.setStroke(javafx.scene.paint.Color.valueOf("#1b1a1a"));
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("LOGIN");
        text.setWrappingWidth(162.4462890625);
        text.setFont(new Font("Agency FB Bold", 60.0));

        text0.setFill(javafx.scene.paint.Color.valueOf("#f2f0f0"));
        text0.setLayoutX(689.0);
        text0.setLayoutY(369.0);
        text0.setStroke(javafx.scene.paint.Color.valueOf("#282828"));
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Username");
        text0.setWrappingWidth(150.4462890625);
        text0.setFont(new Font("Agency FB Bold", 40.0));

        usernameTxtField.setEditable(true);
        usernameTxtField.setLayoutX(614.0);
        usernameTxtField.setLayoutY(402.0);
        usernameTxtField.setPrefHeight(49.0);
        usernameTxtField.setPrefWidth(318.0);
        usernameTxtField.setPromptText("Enter username...");
        usernameTxtField.setPadding(new Insets(0.0, 0.0, 0.0, 10.0));

        text1.setFill(javafx.scene.paint.Color.valueOf("#f2f0f0"));
        text1.setLayoutX(695.0);
        text1.setLayoutY(550.0);
        text1.setStroke(javafx.scene.paint.Color.valueOf("#1b1a1a"));
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Password");
        text1.setWrappingWidth(138.4462919086218);
        text1.setFont(new Font("Agency FB Bold", 40.0));

        loginButton.setLayoutX(674.0);
        loginButton.setLayoutY(754.0);
        loginButton.setMnemonicParsing(false);
        loginButton.setPrefHeight(77.0);
        loginButton.setPrefWidth(180.0);
        loginButton.getStylesheets().add("/tictactoe/resources/css/application.css");
        loginButton.setText("Login");
        loginButton.setTextFill(javafx.scene.paint.Color.valueOf("#f2efef"));
        loginButton.setFont(new Font("Agency FB Bold", 36.0));
        
        hyperlink.setOnAction((event) -> {
            ScreenController.pushScreen(new SignupScreenBase(), this);
        });

        hyperlink.setLayoutX(628.0);
        hyperlink.setLayoutY(831.0);
        hyperlink.setText("Don't have an account? Signup!");
        hyperlink.setTextFill(javafx.scene.paint.Color.valueOf("#fcfafa"));
        hyperlink.setFont(new Font("Agency FB", 28.0));

        passwordField.setEditable(true);
        passwordField.setLayoutX(605.0);
        passwordField.setLayoutY(576.0);
        passwordField.setPrefHeight(49.0);
        passwordField.setPrefWidth(318.0);
        passwordField.setPromptText("Enter password...");

        backButton.setLayoutX(51.0);
        backButton.setLayoutY(877.0);
        backButton.setMnemonicParsing(false);
        backButton.setPrefHeight(77.0);
        backButton.setPrefWidth(180.0);
        backButton.getStylesheets().add("/tictactoe/resources/css/application.css");
        backButton.setText("Back");
        backButton.setTextFill(javafx.scene.paint.Color.valueOf("#f2efef"));
        backButton.setFont(new Font("Agency FB Bold", 36.0));
        backButton.setOnAction((event) -> {
            ScreenController.popScreen();
        });

        getChildren().add(imageView);
        getChildren().add(text);
        getChildren().add(text0);
        getChildren().add(usernameTxtField);
        getChildren().add(text1);
        getChildren().add(loginButton);
        getChildren().add(hyperlink);
        getChildren().add(passwordField);
        getChildren().add(backButton);

    }
}