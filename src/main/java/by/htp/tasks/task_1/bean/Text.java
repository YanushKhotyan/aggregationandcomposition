package by.htp.tasks.task_1.bean;

import java.util.Objects;

/**
 * @author khotyan.y <br />
 * Copyright 2020 Ifuture Plc. All rights reserved.
 * <p>
 * TODO: add description
 */
public class Text
{
    private String text;
    private TextSentence textSentence;
    private Word word;

    public Text()
    {
    }

    public Text(String text)
    {
        this.text = text;
    }

    public Text(TextSentence textSentence)
    {
        this.textSentence = textSentence;
    }

    public Text(Word word)
    {
        this.word = word;
    }

    public TextSentence getTextSentence()
    {
        return textSentence;
    }

    public void setTextSentence(TextSentence textSentence)
    {
        this.textSentence = textSentence;
    }

    public Word getWord()
    {
        return word;
    }

    public void setWord(Word word)
    {
        this.word = word;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text = (Text) o;
        return Objects.equals(textSentence, text.textSentence) &&
                Objects.equals(word, text.word);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(textSentence, word);
    }

    @Override
    public String toString()
    {
        return "Text{" +
                "textSentence=" + textSentence +
                ", word=" + word +
                '}';
    }
}
