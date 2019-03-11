package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SampleController {
	// メインパネルの表示
	@FXML BorderPane MainBorder;
	
	// パーツの表示
	@FXML Label Title;
	@FXML GridPane TeamName;
	@FXML GridPane Points;
		@FXML Label PlayerName;
		@FXML Label TeamTag;
		@FXML Label PlayerPoints;
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
		@FXML TextField Point1;
		@FXML TextField Point2;
		@FXML TextField Point3;
		@FXML TextField Point4;
		@FXML TextField Point5;
		@FXML TextField Point6;
		@FXML TextField Point7;
		@FXML TextField Point8;
		@FXML TextField Point9;
		@FXML TextField Point10;
		@FXML TextField Point11;
		@FXML TextField Point12;
	@FXML GridPane Result;
	@FXML Button CalcBtn;
	
	/*public static int[] point = new int[12];
	public static String[] name = new String[12];
	public static String[] tag = new String[12];
	public int[] tagNum = new int[12];
	String str;*/
	
	
	@FXML
	void onClickCalcBtn(ActionEvent event) {
		System.out.println("aaa");
		try {
			System.out.println("bbb");
			showSecondWindow();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	void showSecondWindow() throws IOException {
		
		//getTexts(Player1,Tag1,Point1,1);
		System.out.println("ccc");

		FXMLLoader loader = new FXMLLoader(getClass().getResource("SecondView.fxml"));
		BorderPane root = (BorderPane) loader.load();
		Scene scene = new Scene(root);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.showAndWait();
		System.out.println("ddd");
		//SecondController.output();
	}
	
	/*void getTexts(TextField n, TextField t, TextField p, int i) {
		i -= 1;
		name[i] = n.getText();
		tag[i] = t.getText();
		point[i] = Integer.parseInt(p.getText());
	}*/
	
}
