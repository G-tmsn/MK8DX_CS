package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class SampleController {
	// メインパネルの表示
	@FXML BorderPane MainBorder;
	
	// パーツの表示
	@FXML Label Title;
	@FXML GridPane TeamName;
		@FXML Label TeamName1;
		@FXML Label TeamName2;
	@FXML GridPane Points;
	@FXML GridPane Result;
	@FXML Button CalcBtn;
	
	
	
	@FXML
	public void onClickCalcBtn(ActionEvent e) {
		Title.setText("Hello JavaFx!");
	}
	
}
