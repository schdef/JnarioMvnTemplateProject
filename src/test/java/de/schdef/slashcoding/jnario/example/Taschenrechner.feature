package de.schdef.slashcoding.jnario.example

import static extension org.jnario.lib.JnarioIterableExtensions.*
import static extension org.jnario.lib.StringConversions.*
import de.schdef.slashcoding.example.Calculator

Feature: Taschenrechner

Als Matheanfänger
benötige ich einen Taschenrechner welcher die Basisrechenarten beherrscht
damit ich meine Berechnungen überprüfen kann 

Scenario: Zwei Zahlen zusammenzählen
	Calculator calculator
	int result
Given ein Taschenrechner
	calculator = new Calculator
When ich zwei Zahlen "20" und "70" eingebe und auf Addieren drücke
	result = calculator.add(args.first.toInt, args.second.toInt)
Then wird die Summe "90" wird angezeigt
	result => args.first.toInt