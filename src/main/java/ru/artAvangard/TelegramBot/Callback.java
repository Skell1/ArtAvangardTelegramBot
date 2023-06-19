package ru.artAvangard.TelegramBot;

public class Callback {
    private String mail;
    private String telephone;
    private String fio;
    private String text;

    public Callback(String mail, String telephone, String fio, String text) {
        this.mail = mail;
        this.telephone = telephone;
        this.fio = fio;
        this.text = text;
    }
}
