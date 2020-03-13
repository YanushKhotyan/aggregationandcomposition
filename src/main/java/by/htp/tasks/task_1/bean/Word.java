package by.htp.tasks.task_1.bean;

import java.util.Objects;

/**
 * @author khotyan.y <br />
 * Copyright 2020 Ifuture Plc. All rights reserved.
 * <p>
 * TODO: add description
 */
public class Word extends Text
{
    private String word;

    public Word(String word)
    {
        this.word = word;
    }


    public void setWord(String word)
    {
        this.word = word;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word1 = (Word) o;
        return Objects.equals(word, word1.word);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(word);
    }

    @Override
    public String toString()
    {
        return "Word{" +
                "word='" + word + '\'' +
                '}';
    }
}
