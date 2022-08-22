DROP TABLE IF EXISTS comments;

CREATE TABLE `comments` (
	`post_id` int AUTO_INCREMENT PRIMARY KEY,
	`user_id` int NOT NULL,
	`game_id` int NOT NULL,
	`content` varchar(4000) NOT NULL,
	`post_datetime` timestamp NOT NULL
);

INSERT INTO `comments` (`user_id`, `game_id`, `content`, `post_datetime`)
	VALUES ('1', '1', 'This game is crazy good. 10/10 recommended', '2022-08-22 14:56:59');
INSERT INTO `comments` (`user_id`, `game_id`, `content`, `post_datetime`)
	VALUES ('1', '2', 'Average game.', '2022-08-21 19:30:43');
INSERT INTO `comments` (`user_id`, `game_id`, `content`, `post_datetime`)
	VALUES ('2', '1', 'Excellent game.', '2022-08-20 09:05:33');
INSERT INTO `comments` (`user_id`, `game_id`, `content`, `post_datetime`)
	VALUES ('2', '2', 'OK game.', '2022-08-21 12:25:01');
INSERT INTO `comments` (`user_id`, `game_id`, `content`, `post_datetime`)
	VALUES ('5', '3', 'even when this game is at its most irritating, there is still something irresistibly likeable about it.', '2022-08-18 11:02:09');