DROP TABLE IF EXISTS `player`;
CREATE TABLE player (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL
);

DROP TABLE IF EXISTS `game`;
CREATE TABLE game (
  id INT AUTO_INCREMENT  PRIMARY KEY
);

DROP TABLE IF EXISTS `card`;
CREATE TABLE card (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  suit VARCHAR(250) NOT NULL,
  face VARCHAR(250) NOT NULL
);

DROP TABLE IF EXISTS `deck`;
CREATE TABLE deck (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  game_id INT,
  FOREIGN KEY (game_id) REFERENCES game (id)
);

DROP TABLE IF EXISTS `deck_card`;
CREATE TABLE deck_card (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  deck_id INT,
  card_id INT,
  FOREIGN KEY (deck_id) REFERENCES deck (id),
  FOREIGN KEY (card_id) REFERENCES card (id)
);

DROP TABLE IF EXISTS `game_player_card`;
CREATE TABLE game_player (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  game_id INT,
  player_id INT,
  card_id INT,
  FOREIGN KEY (game_id) REFERENCES game (id),
  FOREIGN KEY (player_id) REFERENCES player (id),
  FOREIGN KEY (card_id) REFERENCES deck_card (id)
);

INSERT INTO card (suit, face) VALUES
  ('CLUBS', 'ACE'),
  ('CLUBS', 'TWO'),
  ('CLUBS', 'THREE'),
  ('CLUBS', 'FOUR'),
  ('CLUBS', 'FIVE'),
  ('CLUBS', 'SIX'),
  ('CLUBS', 'SEVEN'),
  ('CLUBS', 'EIGHT'),
  ('CLUBS', 'NINE'),
  ('CLUBS', 'TEN'),
  ('CLUBS', 'JACK'),
  ('CLUBS', 'QUEEN'),
  ('CLUBS', 'KING'),
  ('DIAMONDS', 'ACE'),
  ('DIAMONDS', 'TWO'),
  ('DIAMONDS', 'THREE'),
  ('DIAMONDS', 'FOUR'),
  ('DIAMONDS', 'FIVE'),
  ('DIAMONDS', 'SIX'),
  ('DIAMONDS', 'SEVEN'),
  ('DIAMONDS', 'EIGHT'),
  ('DIAMONDS', 'NINE'),
  ('DIAMONDS', 'TEN'),
  ('DIAMONDS', 'JACK'),
  ('DIAMONDS', 'QUEEN'),
  ('DIAMONDS', 'KING'),
  ('HEARTS', 'ACE'),
  ('HEARTS', 'TWO'),
  ('HEARTS', 'THREE'),
  ('HEARTS', 'FOUR'),
  ('HEARTS', 'FIVE'),
  ('HEARTS', 'SIX'),
  ('HEARTS', 'SEVEN'),
  ('HEARTS', 'EIGHT'),
  ('HEARTS', 'NINE'),
  ('HEARTS', 'TEN'),
  ('HEARTS', 'JACK'),
  ('HEARTS', 'QUEEN'),
  ('HEARTS', 'KING'),
  ('SPADES', 'ACE'),
  ('SPADES', 'TWO'),
  ('SPADES', 'THREE'),
  ('SPADES', 'FOUR'),
  ('SPADES', 'FIVE'),
  ('SPADES', 'SIX'),
  ('SPADES', 'SEVEN'),
  ('SPADES', 'EIGHT'),
  ('SPADES', 'NINE'),
  ('SPADES', 'TEN'),
  ('SPADES', 'JACK'),
  ('SPADES', 'QUEEN'),
  ('SPADES', 'KING');
