package br.unicesumar.ads.ejb;

import javax.ejb.*;

@Remote
public interface SimpleBean {
  public String sayHello(String name);
}
