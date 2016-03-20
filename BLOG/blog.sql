/*
Navicat MySQL Data Transfer

Source Server         : LocalMySQL
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : blog

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2015-12-04 16:41:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for accounts
-- ----------------------------
DROP TABLE IF EXISTS `accounts`;
CREATE TABLE `accounts` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `un` varchar(111) NOT NULL,
  `pw` varchar(111) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of accounts
-- ----------------------------
INSERT INTO `accounts` VALUES ('1', 'admin', '1234');
INSERT INTO `accounts` VALUES ('2', 'EmirCivas', 'qwer');

-- ----------------------------
-- Table structure for kategoriler
-- ----------------------------
DROP TABLE IF EXISTS `kategoriler`;
CREATE TABLE `kategoriler` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ad` varchar(111) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of kategoriler
-- ----------------------------
INSERT INTO `kategoriler` VALUES ('1', 'Sinema - Dizi');
INSERT INTO `kategoriler` VALUES ('2', 'Muzik');
INSERT INTO `kategoriler` VALUES ('3', 'Java');

-- ----------------------------
-- Table structure for yazilar
-- ----------------------------
DROP TABLE IF EXISTS `yazilar`;
CREATE TABLE `yazilar` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account_id` int(11) NOT NULL,
  `kategori_id` int(11) NOT NULL,
  `tarih` date NOT NULL,
  `baslik` varchar(111) NOT NULL,
  `icerik` text NOT NULL,
  `yorum_acik` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `account_id` (`account_id`),
  KEY `kategori_id` (`kategori_id`),
  CONSTRAINT `yazilar_ibfk_1` FOREIGN KEY (`account_id`) REFERENCES `accounts` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `yazilar_ibfk_2` FOREIGN KEY (`kategori_id`) REFERENCES `kategoriler` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of yazilar
-- ----------------------------
INSERT INTO `yazilar` VALUES ('1', '1', '1', '2015-12-04', 'Hello World', 'There was once upon a time an old king who was ill and thought to\r\nhimself \'I am lying on what must be my deathbed.\' Then said he \'tell\r\nfaithful John to come to me.\' Faithful John was his favorite servant,\r\nand was so called, because he had for his whole life long been so\r\ntrue to him.  When therefore he came beside the bed, the king said to\r\nhim \'most faithful John, I feel my end approaching, and have no\r\nanxiety except about my son.  He is still of tender age, and cannot\r\nalways know how to guide himself.  If you do not promise me to teach\r\nhim everything that he ought to know, and to be his foster-father, I\r\ncannot close my eyes in peace.\' Then answered faithful John \'I will\r\nnot forsake him, and will serve him with fidelity, even if it should\r\ncost me my life.\' At this, the old king said \'now I die in comfort\r\nand peace.\' Then he added \'after my death, you shall show him the\r\nwhole castle - all the chambers, halls, and vaults, and all the\r\ntreasures which lie therein, but the last chamber in the long\r\ngallery, in which is the picture of the princess of the golden\r\ndwelling, shall you not show.  If he sees that picture, he will fall\r\nviolently in love with her, and will drop down in a swoon, and go\r\nthrough great danger for her sake, therefore you must protect him\r\nfrom that.\' And when faithful John had once more given his promise to\r\nthe old king about this, the king said no more, but laid his head on\r\nhis pillow, and died.\r\n\r\nWhen the old king had been carried to his grave, faithful John told\r\nthe young king all that he had promised his father on his deathbed,\r\nand said \'this will I assuredly keep, and will be faithful to you as\r\nI have been faithful to him, even if it should cost me my life.\' When\r\nthe mourning was over, faithful John said to him \'it is now time that\r\nyou should see your inheritance.  I will show you your father\'s\r\npalace.\' Then he took him about everywhere, up and down, and let him\r\nsee all the riches, and the magnificent apartments, only there was\r\none room which he did not open, that in which hung the dangerous\r\npicture.  The picture, however, was so placed that when the door was\r\nopened you looked straight on it, and it was so admirably painted\r\nthat it seemed to breathe and live, and there was nothing more\r\ncharming or more beautiful in the whole world.  The young king\r\nnoticed, however, that faithful John always walked past this one\r\ndoor, and said \'why do you never open this one for me.\' \'There is\r\nsomething within it, he replied,  \'which would terrify you.\' But the\r\nking answered \'I have seen all the palace, and I want to know what is\r\nin this room also, and he went and tried to break open the door by\r\nforce.  Then faithful John held him back and said \'I promised your\r\nfather before his death that you should not see that which is in this\r\nchamber, it might bring the greatest misfortune on you and on me.\'\r\n\'Ah, no, replied the young king,  \'if I do not go in, it will be my\r\ncertain destruction.  I should have no rest day or night until I had\r\nseen it with my own eyes.  I shall not leave the place now until you\r\nhave unlocked the door.\'\r\n\r\nThen faithful John saw that there was no help for it now, and with a\r\nheavy heart and many sighs, sought out the key from the great bunch.\r\nWhen he opened the door, he went in first, and thought by standing\r\nbefore him he could hide the portrait so that the king should not see\r\nit in front of him.  But what good was this.  The king stood on\r\ntip-toe and saw it over his shoulder.  And when he saw the portrait\r\nof the maiden, which was so magnificent and shone with gold and\r\nprecious stones, he fell fainting to the ground.  Faithful John took\r\nhim up, carried him to his bed, and sorrowfully thought \'the\r\nmisfortune has befallen us, Lord God, what will be the end of it.\'\r\nThen he strengthened him with wine, until he came to himself again.\r\nThe first words the king said were \'ah, the beautiful portrait.\r\nWhose it it.\' \'That is the princess of the golden dwelling, answered\r\nfaithful John.  Then the king continued \'my love for her is so great,\r\nthat if all the leaves on all the trees were tongues, they could not\r\ndeclare it.  I will give my life to win her.  You are my most\r\nfaithful John, you must help me.\r\n\r\nThe faithful servant considered within himself for a long time how to\r\nset about the matter, for it was difficult even to obtain a sight of\r\nthe king\'s daughter.  At length he thought of a way, and said to the\r\nking \'everything which she has about her is of gold - tables, chairs,\r\ndishes, glasses, bowls, and household furniture.  Among your\r\ntreasures are five tons of gold, let one of the goldsmiths of the\r\nkingdom fashion these into all manner of vessels and utensils, into\r\nall kinds of birds, wild beasts and strange animals, such as may\r\nplease her, and we will go there with them and try our luck.\'\r\n\r\nThe king ordered all the goldsmiths to be brought to him, and they\r\nhad to work night and day until at last the most splendid things were\r\nprepared.  When everything was stowed on board a ship, faithful John\r\nput on the dress of a merchant, and the king was forced to do the\r\nsame in order to make himself quite unrecognizable.  Then they sailed\r\nacross the sea, and sailed on until they came to the town wherein\r\ndwelt the princess of the golden dwelling.\r\n\r\nFaithful John bade the king stay behind on the ship, and wait for\r\nhim.  \'Perhaps I shall bring the princess with me,  said he,\r\n\'therefore see that everything is in order, have the golden vessels\r\nset out and the whole ship decorated.\' Then he gathered together in\r\nhis apron all kinds of golden things, went on shore and walked\r\nstraight to the royal palace. When he entered the courtyard of the\r\npalace, a beautiful girl was standing there by the well with two\r\ngolden buckets in her hand, drawing water with them.  And when she\r\nwas just turning round to carry away the sparkling water she saw the\r\nstranger, and asked who he was.  So he answered \'I am a merchant, and\r\nopened his apron, and let her look in.  Then she cried \'oh, what\r\nbeautiful golden things.\' And put her pails down and looked at the\r\ngolden wares one after the other.  Then said the girl \'the princess\r\nmust see these, she has such great pleasure in golden things, that\r\nshe will buy all you have.\' She took him by the hand and led him\r\nupstairs, for she was the waiting-maid. When the king\'s daughter saw\r\nthe wares, she was quite delighted and said \'they are so beautifully\r\nworked, that I will buy them all from you.\' But faithful John said \'I\r\nam only the servant of a rich merchant.  The things I have here are\r\nnot to be compared with those my master has in his ship.  They are\r\nthe most beautiful and valuable things that have ever been made in\r\ngold.\' When she wanted to have everything brought up to her, he said\r\n\'there are so many of them that it would take a great many days to do\r\nthat, and so many rooms would be required to exhibit them, that your\r\nhouse is not big enough.\' Then her curiosity and longing were still\r\nmore excited, until at last she said \'conduct me to the ship, I will\r\ngo there myself, and behold the treasures of your master.\' At this\r\nfaithful John was quite delighted, and led her to the ship, and when\r\nthe king saw her, he perceived that her beauty was even greater than\r\nthe picture had represented it to be, and thought no other than that\r\nhis heart would burst in twain.  Then she boarded the ship, and the\r\nking led her within.  Faithful John, however, remained with the\r\nhelmsman, and ordered the ship to be pushed off, saying \'set all\r\nsail, till it fly like a bird in the air.\' Within, the king showed\r\nher the golden vessels, every one of them, also the wild beasts and\r\nstrange animals.  Many hours went by whilst she was seeing\r\neverything, and in her delight she did not observe that the ship was\r\nsailing away.  After she had looked at the last, she thanked the\r\nmerchant and wanted to go home, but when she came to the side of the\r\nship, she saw that it was on the high seas far from land, and\r\nhurrying onwards with all sail set.  \'Ah,  cried she in her alarm, \'I\r\nam betrayed.  I am carried away and have fallen into the power of a\r\nmerchant - I would rather die.\' The king, however, seized her hand,\r\nand said \'I am not a merchant.  I am a king, and of no meaner origin\r\nthan you are, and if I have carried you away with subtlety, that has\r\ncome to pass because of my exceeding great love for you.  The first\r\ntime that I looked on your portrait, I fell fainting to the ground.\'\r\nWhen the princess of the golden dwelling heard this, she was\r\ncomforted, and her heart was drawn to him, so that she willingly\r\nconsented to be his wife. It so happened, while they were sailing\r\nonwards over the deep sea, that faithful John, who was sitting on the\r\nfore part of the vessel, making music, saw three ravens in the air,\r\nwhich came flying towards them.  At this he stopped playing and\r\nlistened to what they were saying to each other, for that he well\r\nunderstood.  One cried \'oh, there he is carrying home the princess of\r\nthe golden dwelling.\' \'Yes, replied the second,  \'but he has not got\r\nher yet.\' Said the third \'but he has got her, she is sitting beside\r\nhim in the ship.\' Then the first began again, and cried \'what good\r\nwill that do him.  When they reach land a chestnut horse will leap\r\nforward to meet him, and the prince will want to mount it, but if he\r\ndoes that, it will run away with him, and rise up into the air, and\r\nhe will never see his maiden more.\' Spoke the second \'but is there no\r\nescape.\' \'Oh, yes, if someone else mounts it swiftly, and takes out\r\nthe pistol which he will find in its holster, and shoots the horse\r\ndead, the young king is saved.  But who knows that. And whosoever\r\ndoes know it, and tells it to him, will be turned to stone from the\r\ntoe to the knee.\' Then said the second \'I know more than that, even\r\nif the horse be killed, the young king will still not keep his bride.\r\nWhen they go into the castle together, a wrought bridal garment will\r\nbe lying there in a dish, and looking as if it were woven of gold and\r\nsilver,  it is, however, nothing but sulphur and pitch, and if he put\r\nit on, it will burn him to the very bone and marrow.\' Said the third\r\n\'is there no escape at all.\' \'Oh, yes, replied the second,  \'if any\r\none with gloves on seizes the garment and throws it into the fire and\r\nburns it, the young king will be saved.  But what good will that do.\r\nWhosoever knows it and tells it to him, half his body will become\r\nstone from the knee to the heart.\' Then said the third \'I know still\r\nmore, even if the bridal garment be burnt, the young king will still\r\nnot have his bride. After the wedding, when the dancing begins and\r\nthe young queen is dancing, she will suddenly turn pale and fall down\r\nas if dead, and if some one does not lift her up and draw three drops\r\nof blood from her right breast and spit them out again, she will die.\r\nBut if any one who knows that were to declare it, he would become\r\nstone from the crown of his head to the sole of his foot.\' When the\r\nravens had spoken of this together, they flew onwards, and faithful\r\nJohn had well understood everything, but from that time forth he\r\nbecame quiet and sad, for if he concealed what he had heard from his\r\nmaster, the latter would be unfortunate, and if he disclosed it to\r\nhim, he himself must sacrifice his life.  At length, however, he said\r\nto himself \'I will save my master, even if it bring destruction on\r\nmyself.\' When therefore they came to shore, all happened as had been\r\nforetold by the ravens, and a magnificent chestnut horse sprang\r\nforward.  \'Good, said the king,  \'he shall carry me to my palace,\r\nand was about to mount it when faithful John got before him, jumped\r\nquickly on it, drew the pistol out of the holster, and shot the\r\nhorse.  Then the other attendants of the king, who were not very fond\r\nof faithful John, cried \'how shameful to kill the beautiful animal,\r\nthat was to have carried the king to his palace.\' But the king said\r\n\'hold your peace and leave him alone, he is my most faithful John.\r\nWho knows what good may come of this.\' They went into the palace, and\r\nin the hall there stood a dish, and therein lay the bridal garment\r\nlooking no otherwise than as if it were made of gold and silver.  The\r\nyoung king went towards it and was about to take hold of it, but\r\nfaithful John pushed him away, seized it with gloves on, carried it\r\nquickly to the fire and burnt it.  The other attendants again began\r\nto murmur, and said \'behold, now he is even burning the king\'s bridal\r\ngarment.\' But the young king said \'who knows what good he may have\r\ndone, leave him alone, he is my most faithful John.\' And now the\r\nwedding was solemnized - the dance began, and the bride also took\r\npart in it, then faithful John was watchful and looked into her face,\r\nand suddenly she turned pale and fell to the ground as if she were\r\ndead.  On this he ran hastily to her, lifted her up and bore her into\r\na chamber - then he laid her down, and knelt and sucked the three\r\ndrops of blood from her right breast, and spat them out.  Immediately\r\nshe breathed again and recovered herself, but the young king had seen\r\nthis, and being ignorant why faithful John had done it, was angry and\r\ncried \'throw him into a dungeon.\' Next morning faithful John was\r\ncondemned, and led to the gallows, and when he stood on high, and was\r\nabout to be executed, he said \'every one who has to die is permitted\r\nbefore his end to make one last speech, may I too claim the right.\'\r\n\'Yes, answered the king,  \'it shall be granted unto you.\' Then said\r\nfaithful John \'I am unjustly condemned, and have always been true to\r\nyou,  and he related how he had hearkened to the conversation of the\r\nravens when on the sea, and how he had been obliged to do all these\r\nthings in order to save his master.  Then cried the king \'oh, my most\r\nfaithful John.  Pardon, pardon - bring him down.\' But as faithful\r\nJohn spoke the last word he had fallen down lifeless and become a\r\nstone.\r\n\r\nThereupon the king and the queen suffered great anguish, and the king\r\nsaid \'ah, how ill I have requited great fidelity.\' And ordered the\r\nstone figure to be taken up and placed in his bedroom beside his bed.\r\nAnd as often as he looked on it he wept and said \'ah, if I could\r\nbring you to life again, my most faithful John.\'\r\n\r\nSome time passed and the queen bore twins, two sons who grew fast and\r\nwere her delight.  Once when the queen was at church and the father\r\nwas sitting with his two children playing beside him, he looked at\r\nthe stone figure again, sighed, and full of grief he said \'ah, if I\r\ncould but bring you to life again, my most faithful John.\' Then the\r\nstone began to speak and said \'you can bring me to life again if you\r\nwill use for that purpose what is dearest to you.\' Then cried the\r\nking \'I will give everything I have in the world for you.\' The stone\r\ncontinued \'if you will cut off the heads of your two children with\r\nyour own hand, and sprinkle me with their blood, I shall be restored\r\nto life.\'\r\n\r\nThe king was terrified when he heard that he himself must kill his\r\ndearest children, but he thought of faithful John\'s great fidelity,\r\nand how he had died for him, drew his sword, and with his own hand\r\ncut off the children\'s heads.  And when he had smeared the stone with\r\ntheir blood, life returned to it, and faithful John stood once more\r\nsafe and healthy before him. He said to the king \'your truth shall\r\nnot go unrewarded, and took the heads of the children, put them on\r\nagain, and rubbed the wounds with their blood, at which they became\r\nwhole again immediately, and jumped about, and went on playing as if\r\nnothing had happened.  Then the king was full of joy, and when he saw\r\nthe queen coming he hid faithful John and the two children in a great\r\ncupboard.  When she entered, he said to her \'have you been praying in\r\nthe church.\' \'Yes, answered she, \'but I have constantly been thinking\r\nof faithful John and what misfortune has befallen him through us.\'\r\nThen said he \'dear wife, we can give him his life again, but it will\r\ncost us our two little sons, whom we must sacrifice.\' The queen\r\nturned pale, and her heart was full of terror, but she said \'we owe\r\nit to him, for his great fidelity.\' Then the king was rejoiced that\r\nshe thought as he had thought, and went and opened the cupboard, and\r\nbrought forth faithful John and the children, and said \'God be\r\npraised, he is delivered, and we have our little sons again also,\r\nand told her how everything had occurred.  Then they dwelt together\r\nin much happiness until their death.', '1');
INSERT INTO `yazilar` VALUES ('2', '1', '2', '2015-12-04', 'qweqweqw', 'asdasdasdasda', '0');
INSERT INTO `yazilar` VALUES ('3', '2', '2', '2015-12-04', 'zsdf', 'sdfsd', '1');
INSERT INTO `yazilar` VALUES ('4', '1', '2', '2016-01-14', 'Yilbasi Hakkinda!', 'asdjasdkasjdkasjdkajs akj adsk djaskdj aksd jk<br>asdasd', '1');

-- ----------------------------
-- Table structure for yorumlar
-- ----------------------------
DROP TABLE IF EXISTS `yorumlar`;
CREATE TABLE `yorumlar` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `yazi_id` int(11) NOT NULL,
  `tarih` datetime NOT NULL,
  `ip_adresi` varchar(111) NOT NULL,
  `ad` varchar(111) NOT NULL,
  `eposta` varchar(111) NOT NULL,
  `icerik` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `yazi_id` (`yazi_id`),
  CONSTRAINT `yorumlar_ibfk_1` FOREIGN KEY (`yazi_id`) REFERENCES `yazilar` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of yorumlar
-- ----------------------------
INSERT INTO `yorumlar` VALUES ('1', '3', '0000-00-00 00:00:00', '', '', '', '');

-- ----------------------------
-- Procedure structure for sp_admin_login
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp_admin_login`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_admin_login`(in _un varchar(111),
in _pw varchar(111) )
begin
select count(*) as 'Result', id, un from accounts 
where un = _un and pw = _pw;
end
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for sp_get_son_yazilar
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp_get_son_yazilar`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_get_son_yazilar`()
begin
select id, baslik from yazilar
order by tarih desc limit 5;
end
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for sp_list_yazi_tarihleri
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp_list_yazi_tarihleri`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_list_yazi_tarihleri`()
begin
SELECT


concat(month(tarih),'.',year(tarih),' (', count(*), ')') as 'Liste'
from yazilar
group by year(tarih) desc, month(tarih) desc;
end
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for sp_yazi_listesi
-- ----------------------------
DROP PROCEDURE IF EXISTS `sp_yazi_listesi`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_yazi_listesi`()
begin
SELECT
a.un as 'YazarAdi',
y.id as 'YaziId',
y.baslik as 'Baslik',
y.tarih as 'Tarih',
y.icerik as 'Icerik',
k.ad as 'Kategori',
(
	select count(*) 
	from yorumlar 
	where yazi_id = y.id
) as 'YorumSayisi'

from
accounts a, yazilar y, kategoriler k
where 
y.account_id = a.id and y.kategori_id = k.id

ORDER BY y.tarih desc; 
end
;;
DELIMITER ;
