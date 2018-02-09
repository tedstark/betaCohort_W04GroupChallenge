package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
//The Fruit Market
//For this challenge, you will be working with 4 commodities; Apples, Oranges, Bananas, and Grapes. Delicious, right?
//When the application loads, you will need to have information for each of the commodities,
//  specifically the name and the market price of each. This information will need to be displayed
//  in a meaningful way on the visual application using.
//Every 15 seconds, the prices should change however, and with it, the listed price on the display.
//Specifically, the market price of each of the items should fluctuate up or down 50 cents
//  (between 1 cent and 50 cents) with each 15 second interval.
//Any given fruit is not allowed to go below a cost of 50 cents, or above the cost of 9 dollars and 99 cents.
//The information displayed for each of the fruit should have a button-like functionality where the user
//  can interact with each of the fruit displays. Available to the user is a total cash and an inventory
//  display that shows how much of each of the fruits they have purchased.
//Create a way for players to sell their fruit inventory at whatever the current market price of that fruit it.
//Deduct from their inventory and add to their total cash.
//The user is not allowed to spend more than they have. The user will start with $100.
//
//Next Steps:
//Also in the user display, should be an average purchased price, which shows, on average,
//  how much money they have spent on a given fruit in their inventory. Meaning that by clicking on the
// display for each of the fruits, allows the user to buy one of the fruits, at market price,
// which will be deducted from the total cash.

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("The Fruit Market");
        primaryStage.setScene(new Scene(root, 800, 500));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
