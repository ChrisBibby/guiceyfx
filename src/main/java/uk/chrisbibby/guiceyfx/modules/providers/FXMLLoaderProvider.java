package uk.chrisbibby.guiceyfx.modules.providers;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;
import javafx.fxml.FXMLLoader;

public class FXMLLoaderProvider implements Provider<FXMLLoader> {

  @Inject
  private Injector injector;

  @Override
  public FXMLLoader get() {
    final FXMLLoader loader = new FXMLLoader();
    loader.setControllerFactory(controller -> injector.getInstance(controller));
    return loader;
  }
}
