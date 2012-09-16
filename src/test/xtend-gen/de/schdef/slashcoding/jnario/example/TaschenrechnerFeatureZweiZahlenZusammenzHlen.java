package de.schdef.slashcoding.jnario.example;

import de.schdef.slashcoding.example.Calculator;
import org.hamcrest.StringDescription;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.Should;
import org.jnario.lib.StepArguments;
import org.jnario.lib.StringConversions;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Zwei Zahlen zusammenz\uFFFDhlen")
@SuppressWarnings("all")
public class TaschenrechnerFeatureZweiZahlenZusammenzHlen {
  @Test
  @Order(0)
  @Named("Given ein Taschenrechner")
  public void givenEinTaschenrechner() {
    Calculator _calculator = new Calculator();
    this.calculator = _calculator;
  }
  
  @Test
  @Order(1)
  @Named("When ich zwei Zahlen \"20\" und \"70\" eingebe und auf Addieren dr\uFFFDcke")
  public void whenIchZweiZahlen20Und70EingebeUndAufAddierenDrCke() {
    StepArguments _stepArguments = new StepArguments("20", "70");
    final StepArguments args = _stepArguments;
    String _first = JnarioIterableExtensions.<String>first(args);
    int _int = StringConversions.toInt(_first);
    String _second = JnarioIterableExtensions.<String>second(args);
    int _int_1 = StringConversions.toInt(_second);
    int _add = this.calculator.add(_int, _int_1);
    this.result = _add;
  }
  
  @Test
  @Order(2)
  @Named("Then wird die Summe \"90\" wird angezeigt")
  public void thenWirdDieSumme90WirdAngezeigt() {
    StepArguments _stepArguments = new StepArguments("90");
    final StepArguments args = _stepArguments;
    String _first = JnarioIterableExtensions.<String>first(args);
    int _int = StringConversions.toInt(_first);
    boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(this.result), Integer.valueOf(_int));
    Assert.assertTrue("\nExpected result => args.first.toInt but"
     + "\n     result is " + new StringDescription().appendValue(Integer.valueOf(this.result)).toString()
     + "\n     args.first.toInt is " + new StringDescription().appendValue(Integer.valueOf(_int)).toString()
     + "\n     args.first is " + new StringDescription().appendValue(_first).toString()
     + "\n     args is " + new StringDescription().appendValue(args).toString() + "\n", _doubleArrow);
    
  }
  
  Calculator calculator;
  
  int result;
}
