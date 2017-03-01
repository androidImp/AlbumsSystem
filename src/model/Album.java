package model;


import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

import javafx.scene.image.Image;

public class Album {
	private SimpleStringProperty createdDate;
	private SimpleStringProperty albumName;
	private SimpleIntegerProperty photosNumber;
	private Image cover;
	private SimpleDoubleProperty albumSize;

	public Album() {
		// TODO Auto-generated constructor stub
		this("", "", null);
		albumSize = new SimpleDoubleProperty(0);
		photosNumber = new SimpleIntegerProperty(0);
	}

	public Album(String albumName, String createDate, Image cover) {
		this.albumName = new SimpleStringProperty(albumName);
		this.createdDate = new SimpleStringProperty(createDate);
		this.cover = cover;
		albumSize = new SimpleDoubleProperty(0);
		photosNumber = new SimpleIntegerProperty(0);
		cover = null;
	}

	public String getCreatedDate() {
		return createdDate.get();
	}

	public String getAlbumName() {
		return albumName.get();
	}

	public Integer getPhotosNumber() {
		return photosNumber.get();
	}

	public Image getCover() {
		return cover;
	}

	public Double getAlbumSize() {
		return albumSize.get();
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate.set(createdDate);
		;
	}

	public void setAlbumName(String albumName) {
		this.albumName.set(albumName);
	}

	public void setPhotosNumber(Integer photosNumber) {
		this.photosNumber.set(photosNumber);
		;
	}

	public void setCover(Image cover) {
		this.cover = cover;
	}

	public void setAlbumSize(Double albumSize) {
		this.albumSize.set(albumSize);
	}

}
