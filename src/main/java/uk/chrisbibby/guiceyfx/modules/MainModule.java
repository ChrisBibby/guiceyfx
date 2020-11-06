package uk.chrisbibby.guiceyfx.modules;

import com.google.inject.AbstractModule;
import javafx.fxml.FXMLLoader;
import uk.chrisbibby.guiceyfx.modules.providers.FXMLLoaderProvider;
import uk.chrisbibby.guiceyfx.services.DemoStrings;
import uk.chrisbibby.guiceyfx.services.DemoStringsImpl;

public class MainModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(FXMLLoader.class).toProvider(FXMLLoaderProvider.class);
    bind(DemoStrings.class).to(DemoStringsImpl.class);
  }
}
