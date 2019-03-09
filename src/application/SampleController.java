package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
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
		@FXML TextField Player1;
		@FXML TextField Player2;
		@FXML TextField Player3;
		@FXML TextField Player4;
		@FXML TextField Player5;
		@FXML TextField Player6;
		@FXML TextField Player7;
		@FXML TextField Player8;
		@FXML TextField Player9;
		@FXML TextField Player10;
		@FXML TextField Player11;
		@FXML TextField Player12;
		@FXML TextField Tag1;
		@FXML TextField Tag2;
		@FXML TextField Tag3;
		@FXML TextField Tag4;
		@FXML TextField Tag5;
		@FXML TextField Tag6;
		@FXML TextField Tag7;
		@FXML TextField Tag8;
		@FXML TextField Tag9;
		@FXML TextField Tag10;
		@FXML TextField Tag11;
		@FXML TextField Tag12;
	@FXML GridPane Result;
	@FXML Button CalcBtn;
	
	
	
	@FXML
	public void onClickCalcBtn(ActionEvent e) {
		Title.setText("Hello JavaFx!");
	}
	
}
