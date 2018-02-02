package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;


import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    //trader info fields
    @FXML
    public Text textApples;
    @FXML
    public Text textOranges;
    @FXML
    public Text textBananas;
    @FXML
    public Text textGrapes;
    @FXML
    public Text textAvgApples;
    @FXML
    public Text textAvgOranges;
    @FXML
    public Text textAvgBananas;
    @FXML
    public Text textAvgGrapes;
    @FXML
    public Text textCash;

    //market info fields
    @FXML
    public Text priceApples;
    @FXML
    public Text priceOranges;
    @FXML
    public Text priceBananas;
    @FXML
    public Text priceGrapes;
    @FXML
    public Text feedbackText;

    //class fields
    Player trader;
    Market market;

    DecimalFormat money = new DecimalFormat("0.00");
    public double startingCash = 100;
    public int startingInv = 0;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        trader = new Player(startingCash,startingInv,startingInv,startingInv,startingInv);
        market = new Market();
        setPricesAndCash();
    }

    public void setPricesAndCash(){
        textCash.setText(money.format(trader.cash));
        priceApples.setText("$"+ money.format(market.priceApples));
        priceOranges.setText("$"+ money.format(market.priceOranges));
        priceBananas.setText("$"+ money.format(market.priceBananas));
        priceGrapes.setText("$"+ money.format(market.priceGrapes));
    }

    public void buyApples(ActionEvent actionEvent){
        trader.invApples++;
        trader.cash -= market.priceApples;
        textApples.setText(String.valueOf(trader.invApples));
        textCash.setText("$" + money.format(trader.cash));
        feedbackText.setText("Apple Purchased for $"+money.format(market.priceApples));
    }

    public void buyOranges(ActionEvent actionEvent){
        trader.invOranges++;
        trader.cash -= market.priceOranges;
        textOranges.setText(String.valueOf(trader.invOranges));
        textCash.setText("$" + money.format(trader.cash));
        feedbackText.setText("Orange Purchased for $"+money.format(market.priceOranges));
    }
//
//    public void clickBananas(ActionEvent actionEvent){
//        countBananas++;
//        updateBoxes();
//        feedbackText.setText(countBananas + " " + "BANANA(S) PURCHASED");
//    }
//    public void clickGrapes(ActionEvent actionEvent){
//        countGrapes++;
//        updateBoxes();
//        feedbackText.setText(countGrapes + " " + "GRAPE(S) PURCHASED");
//    }

    public void sellApples(ActionEvent actionEvent){
        if(trader.invApples > 0){
            trader.invApples--;
            trader.cash += market.priceApples;
            textApples.setText(String.valueOf(trader.invApples));
            textCash.setText("$" + money.format(trader.cash));
            feedbackText.setText("Orange sold for $" + money.format(market.priceApples));
        } else {
            feedbackText.setText("You don't have enough oranges to sell on the market.");
        }

    }
//    public void sellOranges(ActionEvent actionEvent){
//        if(countOranges > 0){
//            countOranges--;
//            updateBoxes();
//            feedbackText.setText("SALE SUCCESSFUL");
//        } else {
//            feedbackText.setText("ERROR. CAN'T SELL MORE THAN YOU HAVE." );
//        }
//    }
//    public void sellBananas(ActionEvent actionEvent){
//        if(countBananas > 0){
//            countBananas--;
//            updateBoxes();
//            feedbackText.setText("SALE SUCCESSFUL");
//        } else {
//            feedbackText.setText("ERROR. CAN'T SELL MORE THAN YOU HAVE." );
//        }
//    }
//    public void sellGrapes(ActionEvent actionEvent){
//        if(countGrapes > 0){
//            countGrapes--;
//            updateBoxes();
//            feedbackText.setText("SALE SUCCESSFUL");
//        } else {
//            feedbackText.setText("ERROR. CAN'T SELL MORE THAN YOU HAVE." );
//        }
//    }
}

