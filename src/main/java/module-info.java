module uk.chrisbibby.guiceyfx {
  requires com.google.guice;
  requires javafx.controls;
  requires javafx.fxml;
  requires javafx.graphics;

  opens uk.chrisbibby.guiceyfx.modules.providers to com.google.guice;
  opens uk.chrisbibby.guiceyfx.controllers to com.google.guice, javafx.fxml;
  opens uk.chrisbibby.guiceyfx.services to com.google.guice, javafx.fxml;

  exports uk.chrisbibby.guiceyfx;
}