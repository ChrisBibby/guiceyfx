package uk.chrisbibby.guiceyfx.controllers;

import com.google.inject.Inject;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import uk.chrisbibby.guiceyfx.services.DemoStrings;

public class DemoController {

  private final DemoStrings demoStrings;

  @Inject
  public DemoController(final DemoStrings demoStrings) {
    this.demoStrings = demoStrings;
  }

  @FXML
  void onAboutBtnClick(ActionEvent event) {
    final Alert alert = new Alert(Alert.AlertType.INFORMATION);
    alert.setTitle(demoStrings.getTitle());
    alert.setHeaderText(demoStrings.getHeader());
    alert.setContentText(demoStrings.getContent());
    alert.showAndWait();
  }

  @FXML
  void initialize() {
    // no-op.
  }
}
