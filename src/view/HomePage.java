package view;

import java.io.File;
import java.io.IOException;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.util.Callback;
import model.Album;
import model.ColorCell;
import model.albumCell;
import util.FileChooserUtil;

public class HomePage extends Application {
	FileChooser fileChooser;
	BorderPane borderPane;

	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		initialHomePage(stage);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

	public void initialHomePage(Stage stage) {
		Parent root = null;
		try {
			root = FXMLLoader.load(getClass().getResource("homePage.fxml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Scene scene = new Scene(root);
		// scene.getStylesheets().add("view/application.css");
		stage.setTitle("主界面");
		stage.setScene(scene);
		// borderPane = new BorderPane();
		// addHeader(stage);
		// scene.setRoot(borderPane);
	}

	public void addHeader(Stage stage) {
		HBox hBox = new HBox();
		hBox.setStyle("-fx-background-color:#336699");
		// 增加添加照片的按钮
		hBox.getChildren().addAll(addPicturesButton(stage), addShareButton(stage));
		// hBox.setMaxSize(Control.USE_COMPUTED_SIZE,Control.USE_COMPUTED_SIZE);
		borderPane.setTop(hBox);
	}

	public Button addShareButton(Stage stage) {
		Button shareBtn = null;
		if (shareBtn == null) {
			shareBtn = new Button("分享");
		}
		return shareBtn;
	}

	public Button addPicturesButton(Stage stage) {
		Button addPicBtn = null;
		if (addPicBtn == null) {
			addPicBtn = new Button("添加照片");
			if (fileChooser == null) {
				fileChooser = new FileChooser();
			}
			addPicBtn.setOnAction((final ActionEvent e) -> {
				FileChooserUtil.configureFileChooser(fileChooser);
				File file = fileChooser.showOpenDialog(stage);
				if (file != null) {
					FileChooserUtil.openFile(file);
				}
			});
		}
		return addPicBtn;
	}

}
