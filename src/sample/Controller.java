package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;


import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    @FXML
    public Text invApples;
    @FXML
    public Text invOranges;
    @FXML
    public Text invBananas;
    @FXML
    public Text invGrapes;
    @FXML
    public Text priceAvgApples;
    @FXML
    public Text priceAvgOranges;
    @FXML
    public Text priceAvgBananas;
    @FXML
    public Text priceAvgGrapes;
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
    @FXML
    public Text traderCash;

    Player traderJoe = new Player(100,0,0,0,0);
    Market fruitMarket = new Market(1,1,1,1);

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

//    public void updateInventory(){
//        invApples.setText());
//        invOranges.setText(countOranges);
//        invBananas.setText(countBananas);
//        invGrapes.setText(countGrapes);
//    }


    public void buyApples(ActionEvent actionEvent){
        traderJoe.invApples++;
        traderJoe.cash -= fruitMarket.priceApples;
        invApples.setText(String.valueOf(traderJoe.invApples));
        traderCash.setText(String.valueOf(traderJoe.cash));
        feedbackText.setText("APPLE(S) PURCHASED");
    }
//    public void clickOranges(ActionEvent actionEvent){
//        countOranges++;
//        updateBoxes();
//        feedbackText.setText(countOranges + " " + "ORANGE(S) PURCHASED");
//    }
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

//    public void sellApples(ActionEvent actionEvent){
//        if(countApples > 0){
//            countApples--;
//            updateBoxes();
//            feedbackText.setText("SALE SUCCESSFUL");
//        } else {
//            feedbackText.setText("ERROR. CAN'T SELL MORE THAN YOU HAVE." );
//        }
//
//    }
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

