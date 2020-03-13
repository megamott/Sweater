package com.example.sweater.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Matvey
 */

// Сущность для сохранения в базу данных
@Entity
public class Message {
    @Id //Идентификатор ключей
    @GeneratedValue(strategy= GenerationType.AUTO) //Способ генерации идентификатора
    private Integer id;

    private String text;
    private String tag;

    //Еслт Entity, то обязательно должен быть конструктор без параметров
    public Message() {
    }

    public Message(String text, String tag) {
        this.text = text;
        this.tag = tag;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
