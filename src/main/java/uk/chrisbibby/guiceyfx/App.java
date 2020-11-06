package uk.chrisbibby.guiceyfx;

import com.google.inject.Guice;
import com.google.inject.Injector;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import uk.chrisbibby.guiceyfx.modules.MainModule;

import java.io.InputStream;

public class App extends Application {
  public static void main(String[] args) {
    launch();
  }

  @Override
  public void start(final Stage stage) {
    final Injector injector = Guice.createInjector(new MainModule());
    final FXMLLoader fxmlLoader = injector.getInstance(FXMLLoader.class);

    try (final InputStream inputStream = ClassLoader.getSystemResourceAsStream("demo.fxml")) {
      final Parent root = fxmlLoader.load(inputStream);
      stage.setScene(new Scene(root, 640, 480));
      stage.setTitle("GuiceyFX Demo");
      stage.setOnCloseRequest(event -> {
        System.exit(0);
      });

      stage.show();
    } catch (final Exception ex) {
      ex.printStackTrace();
    }
  }
}
