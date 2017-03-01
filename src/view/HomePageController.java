package view;



import java.util.HashSet;
import java.util.Set;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;
import model.Album;

public class HomePageController {
	@FXML private ListView<Album> albumsList;
	@FXML Slider spaceInfo;
	@FXML
	protected void addAlbum(ActionEvent event){
		ObservableList<Album> data = albumsList.getItems();
		System.out.println("data: " +data);
		data.add(new Album("hehe", "heihei", null));
		System.out.println("adding albums");
		
		
	}
	
	
}
