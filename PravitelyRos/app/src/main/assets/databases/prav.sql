--
-- Файл сгенерирован с помощью SQLiteStudio v3.1.1 в Сб мар 10 18:02:52 2018
--
-- Использованная кодировка текста: UTF-8
--
PRAGMA foreign_keys = off;
BEGIN TRANSACTION;

-- Таблица: praviteli
CREATE TABLE praviteli (
id_praviteli INTEGER PRIMARY KEY AUTOINCREMENT,
prav_name TEXT NOT NULL,
begin_date INTEGER NOT NULL,
end_date INTEGER NOT NULL
);
INSERT INTO praviteli (id_praviteli, prav_name, begin_date, end_date) VALUES (1, 'Рюрик', 862, 879);
INSERT INTO praviteli (id_praviteli, prav_name, begin_date, end_date) VALUES (2, 'Олег Вещий', 879, 912);
INSERT INTO praviteli (id_praviteli, prav_name, begin_date, end_date) VALUES (3, 'Игорь', 912, 945);
INSERT INTO praviteli (id_praviteli, prav_name, begin_date, end_date) VALUES (4, 'Ольга Святая', 945, 962);
INSERT INTO praviteli (id_praviteli, prav_name, begin_date, end_date) VALUES (5, 'Святослав', 945, 972);
INSERT INTO praviteli (id_praviteli, prav_name, begin_date, end_date) VALUES (6, 'Владимир Святой', 978, 1015);
INSERT INTO praviteli (id_praviteli, prav_name, begin_date, end_date) VALUES (7, 'Ярослав Мудрый', 1016, 1054);
INSERT INTO praviteli (id_praviteli, prav_name, begin_date, end_date) VALUES (8, 'Владимир Мономах', 1113, 1125);
INSERT INTO praviteli (id_praviteli, prav_name, begin_date, end_date) VALUES (9, 'Юрий Долгорукий', 1151, 1157);
INSERT INTO praviteli (id_praviteli, prav_name, begin_date, end_date) VALUES (10, 'Андрей Боголюбский', 1157, 1174);
INSERT INTO praviteli (id_praviteli, prav_name, begin_date, end_date) VALUES (11, 'Всеволод Большое Гнездо', 1176, 1212);
INSERT INTO praviteli (id_praviteli, prav_name, begin_date, end_date) VALUES (12, 'Даниил Галицкий', 1215, 1264);
INSERT INTO praviteli (id_praviteli, prav_name, begin_date, end_date) VALUES (13, 'Александр Невский', 1252, 1263);
INSERT INTO praviteli (id_praviteli, prav_name, begin_date, end_date) VALUES (14, 'Даниил Московский', 1263, 1303);
INSERT INTO praviteli (id_praviteli, prav_name, begin_date, end_date) VALUES (15, 'Иван I Калита', 1325, 1340);
INSERT INTO praviteli (id_praviteli, prav_name, begin_date, end_date) VALUES (16, 'Дмитрий Донской', 1359, 1389);
INSERT INTO praviteli (id_praviteli, prav_name, begin_date, end_date) VALUES (17, 'Иван III Великий', 1462, 1505);
INSERT INTO praviteli (id_praviteli, prav_name, begin_date, end_date) VALUES (18, 'Иван IV Грозный', 1533, 1584);
INSERT INTO praviteli (id_praviteli, prav_name, begin_date, end_date) VALUES (19, 'Борис Годунов', 1598, 1605);
INSERT INTO praviteli (id_praviteli, prav_name, begin_date, end_date) VALUES (20, 'Михаил Фёдорович', 1613, 1645);
INSERT INTO praviteli (id_praviteli, prav_name, begin_date, end_date) VALUES (21, 'Алексей Михайлович Тишайший', 1645, 1676);
INSERT INTO praviteli (id_praviteli, prav_name, begin_date, end_date) VALUES (22, 'Пётр I Великий', 1682, 1725);
INSERT INTO praviteli (id_praviteli, prav_name, begin_date, end_date) VALUES (23, 'Екатерина II Великая', 1762, 1796);
INSERT INTO praviteli (id_praviteli, prav_name, begin_date, end_date) VALUES (24, 'Александр I Благословенный', 1801, 1825);
INSERT INTO praviteli (id_praviteli, prav_name, begin_date, end_date) VALUES (25, 'Николай I Незабвенный', 1825, 1855);
INSERT INTO praviteli (id_praviteli, prav_name, begin_date, end_date) VALUES (26, 'Александр II Освободитель', 1855, 1881);
INSERT INTO praviteli (id_praviteli, prav_name, begin_date, end_date) VALUES (27, 'Александр III Миротворец', 1881, 1894);
INSERT INTO praviteli (id_praviteli, prav_name, begin_date, end_date) VALUES (28, 'Николай II', 1894, 1917);
INSERT INTO praviteli (id_praviteli, prav_name, begin_date, end_date) VALUES (29, 'Владимир Ленин', 1917, 1924);
INSERT INTO praviteli (id_praviteli, prav_name, begin_date, end_date) VALUES (30, 'Иосиф Сталин', 1924, 1953);
INSERT INTO praviteli (id_praviteli, prav_name, begin_date, end_date) VALUES (31, 'Никита Хрущёв', 1953, 1964);
INSERT INTO praviteli (id_praviteli, prav_name, begin_date, end_date) VALUES (32, 'Леонид Брежнев', 1966, 1982);
INSERT INTO praviteli (id_praviteli, prav_name, begin_date, end_date) VALUES (33, 'Михаил Горбачёв', 1985, 1991);
INSERT INTO praviteli (id_praviteli, prav_name, begin_date, end_date) VALUES (34, 'Борис Ельцин', 1991, 1999);
INSERT INTO praviteli (id_praviteli, prav_name, begin_date, end_date) VALUES (35, 'Владимир Путин', 2000, 2018);

COMMIT TRANSACTION;
PRAGMA foreign_keys = on;
