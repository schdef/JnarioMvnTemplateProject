package de.schdef.slashcoding.jnario.example

import de.schdef.slashcoding.example.Calculator

describe "Zahlen addieren"{
	Calculator calc = new Calculator()
	fact "Wenn ich mit einem Taschenrechner 1 und 1 zusammenzaehle, dann erhalte ich 2" {
		calc.add(1, 1) should be 2
	}
	
}