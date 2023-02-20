package uk.chrisbibby.guiceyfx.services;

public class DemoStringsImpl implements DemoStrings {

  private final String title = "GuiceyFX - JavaFX & Guice Demo";
  private final String header = "JavaFX 17 & Guice 5";
  private final String content = "Demo to illustrate wiring JavaFX and Guice";

  @Override
  public String getTitle() {
    return title;
  }

  @Override
  public String getHeader() {
    return header;
  }

  @Override
  public String getContent() {
    return content;
  }
}
