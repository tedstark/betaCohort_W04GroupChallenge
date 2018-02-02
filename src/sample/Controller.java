package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;

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
    Timer tickTock = new Timer();
    TimerTask tickTockTask = new TimerTask() {
        @Override
        public void run() {
            chngPrices();
        }
    };

    public double startingCash = 100;
    public int startingInv = 0;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        trader = new Player(startingCash,startingInv,startingInv,startingInv,startingInv);
        market = new Market();
        setTextCash();
        setPrices();
        tickTock.schedule(tickTockTask, 5000L,5000L);
    }
    public void setTextCash() {
        textCash.setText(money.format(trader.cash));
    }

    public void setPrices(){
        priceApples.setText("$"+ money.format(market.priceApples));
        priceOranges.setText("$"+ money.format(market.priceOranges));
        priceBananas.setText("$"+ money.format(market.priceBananas));
        priceGrapes.setText("$"+ money.format(market.priceGrapes));
    }
    public void chngPrices () {
        market.updateAllPrices();
        setPrices();
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
    public void buyBananas(ActionEvent actionEvent){
        trader.invBananas++;
        trader.cash -= market.priceBananas;
        textBananas.setText(String.valueOf(trader.invBananas));
        textCash.setText("$" + money.format(trader.cash));
        feedbackText.setText("Banana Purchased for $"+money.format(market.priceBananas));
    }
    public void buyGrapes(ActionEvent actionEvent){
        trader.invGrapes++;
        trader.cash -= market.priceGrapes;
        textGrapes.setText(String.valueOf(trader.invGrapes));
        textCash.setText("$" + money.format(trader.cash));
        feedbackText.setText("Banana Purchased for $"+money.format(market.priceGrapes));
    }
    public void sellApples(ActionEvent actionEvent){
        if(trader.invApples > 0){
            trader.invApples--;
            trader.cash += market.priceApples;
            textApples.setText(String.valueOf(trader.invApples));
            textCash.setText("$" + money.format(trader.cash));
            feedbackText.setText("Apple sold for $" + money.format(market.priceApples));
        } else {
            feedbackText.setText("You don't have enough apples to sell on the market.");
        }
    }
    public void sellOranges(ActionEvent actionEvent){
        if(trader.invOranges > 0){
            trader.invOranges--;
            trader.cash += market.priceOranges;
            textOranges.setText(String.valueOf(trader.invOranges));
            textCash.setText("$" + money.format(trader.cash));
            feedbackText.setText("Orange sold for $" + money.format(market.priceOranges));
        } else {
            feedbackText.setText("You don't have enough oranges to sell on the market.");
        }
    }
    public void sellBananas(ActionEvent actionEvent){
        if(trader.invBananas > 0){
            trader.invBananas--;
            trader.cash += market.priceBananas;
            textBananas.setText(String.valueOf(trader.invBananas));
            textCash.setText("$" + money.format(trader.cash));
            feedbackText.setText("Banana sold for $" + money.format(market.priceBananas));
        } else {
            feedbackText.setText("You don't have enough bananas to sell on the market.");
        }
    }
    public void sellGrapes(ActionEvent actionEvent){
        if(trader.invGrapes > 0){
            trader.invGrapes--;
            trader.cash += market.priceGrapes;
            textGrapes.setText(String.valueOf(trader.invGrapes));
            textCash.setText("$" + money.format(trader.cash));
            feedbackText.setText("Grapes sold for $" + money.format(market.priceGrapes));
        } else {
            feedbackText.setText("You don't have enough grapes to sell on the market.");
        }
    }
}

