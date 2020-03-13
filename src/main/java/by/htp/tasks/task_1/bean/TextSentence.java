package by.htp.tasks.task_1.bean;

import java.util.Objects;

/**
 * @author khotyan.y <br />
 * Copyright 2020 Ifuture Plc. All rights reserved.
 * <p>
 * TODO: add description
 */
public class TextSentence extends Text
{
    private String sentence;

    public TextSentence(String sentence)
    {
        super();
        this.sentence = sentence;
    }

    public String getSentence()
    {
        return sentence;
    }

    public void setSentence(String sentence)
    {
        this.sentence = sentence;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TextSentence that = (TextSentence) o;
        return Objects.equals(sentence, that.sentence);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(sentence);
    }

    @Override
    public String toString()
    {
        return "TextSentence{" +
                "sentence='" + sentence + '\'' +
                '}';
    }
}
