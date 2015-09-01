package com.blake.presentation;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

import javax.annotation.PostConstruct;
import java.awt.event.ActionEvent;
import java.beans.EventHandler;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Created by Josh on 9/1/2015.
 */
public class BlakeControl implements Initializable
{

	@FXML private Label statusLabel;

	@FXML private GridPane centerGridPane;

	@FXML private Button startButton;

	private List<Button> buttonList = new ArrayList<>();

	private int count = 0;

	private int rowIndex = 0;

	private int columnIndex = 0;

	public BlakeControl()
	{
	}

	@Override public void initialize(URL location, ResourceBundle resources)
	{
		startButton.setOnAction(e -> addButton());
	}

	private void addButton()
	{
		Button newButton = new Button(count + "");

		GridPane.setRowIndex(newButton, rowIndex);
		GridPane.setColumnIndex(newButton, columnIndex);

		centerGridPane.getChildren().add(newButton);

		if(columnIndex > 3)
		{
			rowIndex++;
			columnIndex = -1;
		}

		columnIndex++;

		count++;

		// TODO randomly assign the add button action to a new button.
	}

	private void addButtonAction()
	{

	}

	private void noOp()
	{
		// Does nothing.
	}
}
