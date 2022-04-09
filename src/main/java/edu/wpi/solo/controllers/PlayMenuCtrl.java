package edu.wpi.solo.controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXComboBox;
import javafx.fxml.FXML;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;

public class PlayMenuCtrl extends MasterCtrl {
  @FXML JFXCheckBox expansionCheckBox;
  @FXML private JFXComboBox<String> factionComboBox;
  @FXML private JFXComboBox<String> playerCardSetComboBox;
  @FXML private JFXButton gameRulesButton;

  @FXML private ContextMenu gameRules = new ContextMenu();

  public PlayMenuCtrl() {
    MenuItem item1 = new MenuItem("item1");
    gameRules.getItems().add(item1);
  }

  public void initialize() {
    gameRulesButton.setContextMenu(gameRules);
  }

  public void configure() {}

  @FXML
  private void startGame() {
    System.out.println("Game started");
  }
}
