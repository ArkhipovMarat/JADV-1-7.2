Абстрактная модель работы по учету приемов в ветеринарной клинике.

База данных выведена во внешний слой (в программе представлена в виде Map),
с помощью DBservice можно "подключить" БД.

БД представляет из себя журнал, в котором приемщик registrationService записывает
входные данные - клиент, питомец, назначает врача, статус лечения

ветеринарный врач после осмотра, записывает в ту же БД соответствующую информацию - 
диагностику, проведенное лечение и т.п., статус лечения
