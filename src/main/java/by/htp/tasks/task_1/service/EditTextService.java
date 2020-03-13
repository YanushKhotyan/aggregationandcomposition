package by.htp.tasks.task_1.service;

import by.htp.tasks.task_1.bean.Text;
import by.htp.tasks.task_1.bean.TextSentence;

/**
 * @author khotyan.y <br />
 * Copyright 2020 Ifuture Plc. All rights reserved.
 * <p>
 * TODO: add description
 */
public class EditTextService
{
    private void addNewSentence(String text){
        TextSentence textSentence = new TextSentence(text);
        Text text1 = new Text();
        text1.setTextSentence(textSentence);
    }


    public static void main(String [] args){
        Text text = new Text("Привет, Андрей! ");
        EditTextService editTextService = new EditTextService();
        editTextService.addNewSentence("Как дела?");

        System.out.println(" " + text.toString());
    }

}
