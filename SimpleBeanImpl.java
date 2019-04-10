package br.unicesumar.ads.ejb;

import javax.ejb.*;

@Stateless(name="Example", mappedName="ejb/SimpleBeanJNDI")
public class SimpleBeanImpl implements SimpleBean {
   public String sayHello(String name) {
      return "Hello " + name + "!";
   }
}
