package de.schdef.slashcoding.jnario.example;

import de.schdef.slashcoding.example.Calculator;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.hamcrest.StringDescription;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("Zahlen addieren")
public class ZahlenAddierenSpec {
  Calculator calc = new Function0<Calculator>() {
    public Calculator apply() {
      Calculator _calculator = new Calculator();
      return _calculator;
    }
  }.apply();
  
  @Test
  @Named("Wenn ich mit einem Taschenrechner 1 und 1 zusammenz\\u00E4hle, dann erhalte ich 2")
  @Order(99)
  public void _wennIchMitEinemTaschenrechner1Und1ZusammenzähleDannErhalteIch2() throws Exception {
    int _add = this.calc.add(1, 1);
    boolean _should_be = Should.should_be(Integer.valueOf(_add), Integer.valueOf(2));
    Assert.assertTrue("\nExpected calc.add(1, 1) should be 2 but"
     + "\n     calc.add(1, 1) is " + new StringDescription().appendValue(Integer.valueOf(_add)).toString()
     + "\n     calc is " + new StringDescription().appendValue(this.calc).toString() + "\n", _should_be);
    
  }
}
