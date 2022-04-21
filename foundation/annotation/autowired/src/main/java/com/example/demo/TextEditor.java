package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
    private SpellChecker spellChecker;

    @Autowired
    public void setSpellChecker(SpellChecker spellChecker) {

    }
}
