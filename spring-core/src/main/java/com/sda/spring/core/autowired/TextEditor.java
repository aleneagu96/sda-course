package com.sda.spring.core.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TextEditor {

//     dependency injection: 3 actions

    private SpellChecker spellChecker;


    //   3. field injection is evil
    @Autowired
    private TextFormatter textFormatter;


    private ImageConverter imageConverter;

    //    1. constructor injection = good practice
    @Autowired
    public TextEditor(SpellChecker newSpellChecker) {
        this.spellChecker = newSpellChecker;
    }

    // 2. setter injection = ok
    @Autowired
    public void setImageConverter(ImageConverter imageConverter) {
        this.imageConverter = imageConverter;
    }

    // delegation
    public void spellCheck() {
        spellChecker.checkSpelling();
    }

    public void format() {
        textFormatter.formatText();
    }

    public void convertImage() {
        imageConverter.convert();
    }
}
