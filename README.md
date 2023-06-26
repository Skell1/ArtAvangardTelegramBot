#### Доступные эндпоинты в Telegram `https://t.me/AvangardArtBot`:
- /start` - приветственное сообщение
- /getChatId` - получить Id текущего чата

#### Доступные эндпоинты на `http://localhost:8081`:
- POST `/callBack` - отправить данные пользователя для обратного звонка в формате:
{ "mail" : "ivan@yandex.ru", "telephone" : "89160384438", "fio" : "Иван Иванович Иванов", "text" : "Some text"
}