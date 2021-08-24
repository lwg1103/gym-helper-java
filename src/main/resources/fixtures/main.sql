SET FOREIGN_KEY_CHECKS = 0;
truncate training_exercises;
truncate exercise;
truncate training;
truncate user;
SET FOREIGN_KEY_CHECKS = 1;

insert into user (username, password)
values
("user1", "user1"),
("user2", "user2");

insert into training (id, `user`, name)
values
(1, 1, "K&P1"),
(2, 1, "nogi"),
(3, 1, "K&P2"),
(4, 1, "barki"),
(5, 1, "ramiona");

insert into exercise (id, name, series, weight, repeats, break_time, training)
values
(1, "wyciskanie sztangi", 4, 45, 11, 60, 1),
(2, "wioslowanie szeroko", 4, 40, 13, 60, 1),
(3, "pompki na poreczach", 3, -55, 14, 60, 1),
(4, "przyciaganie wyciagu dolnego", 3, 35, 13, 60, 1),
(5, "wznosy zgietych nog w zwisie", 3, 0, 5, 60, 1),
(6, "brzuszki", 3, 0, 11, 60, 1),
(7, "przysiady ze sztanga", 4, 55, 11, 60, 2),
(8, "zginacze jedna noga", 3, 8, 18, 60, 2),
(9, "prostowanie jedna noga", 3, 15, 19, 60, 2),
(10, "wspiecia na palcach", 3, 25, 20, 60, 2),
(11, "odwodzenie nogi do tyłu", 3, 15, 16, 60, 2),
(12, "wyciskanie w gore", 4, 35, 12, 60, 3),
(13, "sciaganie wyciagu gornego szeroko", 4, 35, 14, 60, 3),
(14, "butterfly", 3, 30, 15, 60, 3),
(15, "sciaganie wyciagu gornego wasko", 3, 30, 15, 60, 3),
(16, "wznosy zgietych nog w zwisie", 3, 0, 5, 60, 3),
(17, "brzuszki", 3, 0, 11, 60, 3),
(18, "wyciskanie żołnierskie", 4, 25, 12, 60, 4),
(19, "unoszenie hantli w bok", 3, 6, 12, 60, 4),
(20, "unoszenie hantli w opadzie", 3, 6, 12, 60, 4),
(21, "podciaganie lamanej wzdluz tułowia", 3, 25, 12, 60, 4),
(22, "szrugsy", 3, 12, 17, 60, 4),
(23, "uginanie ramion ze sztanga", 3, 20, 10, 60, 5),
(24, "sciaganie wyciagu gornego stojac", 3, 35, 11, 60, 5),
(25, "uginanie ramion młotkowo siedzac", 3, 6, 14, 60, 5),
(26, "wyciskanie francuskie hantli leżąc", 3, 5, 15, 60, 5),
(27, "uginanie sztangi łamanej na modlitewniku", 3, 12.5, 15, 60, 5),
(28, "prostowanie ramienia w opadzie", 3, 6, 15, 60, 5),
(29, "uginanie nadgarstkow podchwytem", 3, 6, 20, 60, 5),
(30, "uginanie nadgarstkow nadchwytem", 3, 4, 15, 60, 5);

insert into training_exercises (training_id, exercises_id, exercises_order)
values
(1, 1, 0),
(1, 2, 1),
(1, 3, 2),
(1, 4, 3),
(1, 5, 4),
(1, 6, 5),
(2, 7, 0),
(2, 8, 1),
(2, 9, 2),
(2, 10, 3),
(2, 11, 4),
(3, 12, 0),
(3, 13, 1),
(3, 14, 2),
(3, 15, 3),
(3, 16, 4),
(3, 17, 5),
(4, 18, 0),
(4, 19, 1),
(4, 20, 2),
(4, 21, 3),
(4, 22, 4),
(5, 23, 0),
(5, 24, 1),
(5, 25, 2),
(5, 26, 3),
(5, 27, 4),
(5, 28, 5),
(5, 29, 6),
(5, 30, 7);
