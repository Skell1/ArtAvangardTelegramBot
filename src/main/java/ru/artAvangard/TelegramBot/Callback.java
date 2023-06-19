package ru.artAvangard.TelegramBot;
import org.apache.commons.lang3.StringUtils;

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

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Заказ звонка" + '\n');
        if (!StringUtils.isBlank(mail)) stringBuilder.append("E-mail: " + mail + '\n');
        stringBuilder.append("телефон: " + telephone + '\n');
        if (!StringUtils.isBlank(fio)) stringBuilder.append("ФИО: " + fio + '\n');
        if (!StringUtils.isBlank(text)) stringBuilder.append("Описание заказа: " + text);
        return stringBuilder.toString();
    }
}
