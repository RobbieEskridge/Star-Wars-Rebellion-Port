package edu.wpi.solo;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class SceneSwitcher {

  public static List<SCENES> fxmlval = new ArrayList<SCENES>();

  public enum SCENES {
    HOME,
    SETTINGS,
    MAP,
    CREDITS;
  }

  private final HashMap<SCENES, String> screenMap = new HashMap<>();
  public static Scene currentScene;

  public SceneSwitcher() {

    addScene(SCENES.HOME, "views/Home.fxml");
    addScene(SCENES.SETTINGS, "views/Settings.fxml");
    addScene(SCENES.CREDITS, "views/Credits.fxml");
    // addScene(SCENES.MAP, "views/Map.fxml");
  }

  public void addScene(SCENES name, String pathToFXML) {
    screenMap.put(name, pathToFXML);
  }

  public void switchScene(SCENES name) throws IOException {

    FXMLLoader loader = new FXMLLoader();
    URL xmlUrl = App.class.getResource(screenMap.get(name));
    loader.setLocation(xmlUrl);

    Parent root = loader.load();
    if (currentScene == null) currentScene = new Scene(root);
    else currentScene.setRoot(root);
    App.getStage().setScene(currentScene);
    App.getStage().show();
    fxmlval.add(name);
  }
}
