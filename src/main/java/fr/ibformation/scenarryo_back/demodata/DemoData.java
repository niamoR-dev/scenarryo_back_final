package fr.ibformation.scenarryo_back.demodata;


import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import fr.ibformation.scenarryo_back.beans.Movie;
import fr.ibformation.scenarryo_back.dao.MovieDAO;
import fr.ibformation.scenarryo_back.enums.AgeEnum;




@Component
public class DemoData {

	@Autowired
	private MovieDAO movieDAO;
	/*
	@Autowired
	private RoomDAO roomDAO;
	@Autowired
	private ScheduleDAO scheduleDAO;
	@Autowired
	private FilmShowDAO filmShowDAO;
	*/
	
	@EventListener
	public void appReady (ApplicationReadyEvent event) {
		/*
		roomDAO.save(new Room (1, 600));
		roomDAO.save(new Room (2, 500));
		roomDAO.save(new Room (3, 1000));
		roomDAO.save(new Room (4, 200));
		roomDAO.save(new Room (5, 1000));
		
		scheduleDAO.save(new Schedule (LocalDate.of(2021, 5, 25), "10:00", "12:00" ));
		scheduleDAO.save(new Schedule (LocalDate.of(2021, 5, 25), "12:00", "14:00" ));
		scheduleDAO.save(new Schedule (LocalDate.of(2021, 5, 25), "14:00", "16:00" ));
		scheduleDAO.save(new Schedule (LocalDate.of(2021, 5, 25), "16:00", "18:00" ));
		scheduleDAO.save(new Schedule (LocalDate.of(2021, 5, 26), "18:00", "20:00" ));
		scheduleDAO.save(new Schedule (LocalDate.of(2021, 5, 26), "20:00", "22:00" ));
		scheduleDAO.save(new Schedule (LocalDate.of(2021, 5, 27), "10:00", "12:00" ));
		scheduleDAO.save(new Schedule (LocalDate.of(2021, 5, 27), "12:00", "14:00" ));
		scheduleDAO.save(new Schedule (LocalDate.of(2021, 5, 27), "14:00", "16:00" ));
		scheduleDAO.save(new Schedule (LocalDate.of(2021, 5, 28), "16:00", "18:00" ));
		scheduleDAO.save(new Schedule (LocalDate.of(2021, 5, 28), "18:00", "20:00" ));
		scheduleDAO.save(new Schedule (LocalDate.of(2021, 5, 29), "20:00", "22:00" ));
		scheduleDAO.save(new Schedule (LocalDate.of(2021, 5, 31), "10:00", "12:00" ));
		scheduleDAO.save(new Schedule (LocalDate.of(2021, 5, 31), "12:00", "14:00" ));
		scheduleDAO.save(new Schedule (LocalDate.of(2021, 5, 31), "14:00", "16:00" ));
		scheduleDAO.save(new Schedule (LocalDate.of(2021, 5, 31), "16:00", "18:00" ));
		scheduleDAO.save(new Schedule (LocalDate.of(2021, 5, 31), "18:00", "20:00" ));
		scheduleDAO.save(new Schedule (LocalDate.of(2021, 5, 31), "20:00", "22:00" ));
		*/
		
		movieDAO.save(new Movie ("Harry Potter à l'école des sorciers", "Chris Columbus", LocalDate.of(2001,12,05), AgeEnum.TOUS_PUBLIC, "Orphelin, Harry Potter a été recueilli à contrecœur par son oncle Vernon et sa tante Pétunia, aussi cruels que mesquins, qui n'hésitent pas à le faire dormir dans le placard sous l'escalier. Constamment maltraité, il doit en outre supporter les jérémiades de son cousin Dudley, garçon cupide et archi-gâté par ses parents. De leur côté, Vernon et Pétunia détestent leur neveu dont la présence leur rappelle sans cesse le tempérament \"imprévisible\" des parents du garçon et leur mort mystérieuse.\r\n"
				+ "À l'approche de ses 11 ans, Harry ne s'attend à rien de particulier – ni carte, ni cadeau, ni même un goûter d'anniversaire. Et pourtant, c'est à cette occasion qu'il découvre qu'il est le fils de deux puissants magiciens et qu'il possède lui aussi d'extraordinaires pouvoirs. Quand on lui propose d'intégrer Poudlard, la prestigieuse école de sorcellerie, il trouve enfin le foyer et la famille qui lui ont toujours manqué… et s'engage dans l'aventure de sa vie.", 
				"02:32:00", "https://img.over-blog-kiwi.com/1/88/59/62/20160508/ob_1a62f7_affiche.jpg"));
		movieDAO.save(new Movie ("Harry Potter et la chambre des secrets", "Chris Columbus", LocalDate.of(2002,12,04), AgeEnum.TOUS_PUBLIC, "Alors que l'oncle Vernon, la tante Pétunia et son cousin Dudley reçoivent d'importants invités à dîner, Harry Potter est contraint de passer la soirée dans sa chambre. Dobby, un elfe, fait alors son apparition. Il lui annonce que de terribles dangers menacent l'école de Poudlard et qu'il ne doit pas y retourner en septembre. Harry refuse de le croire.\r\n"
				+ "Mais sitôt la rentrée des classes effectuée, ce dernier entend une voix malveillante. Celle-ci lui dit que la redoutable et légendaire Chambre des secrets est à nouveau ouverte, permettant ainsi à l'héritier de Serpentard de semer le chaos à Poudlard. Les victimes, retrouvées pétrifiées par une force mystérieuse, se succèdent dans les couloirs de l'école, sans que les professeurs - pas même le populaire Gilderoy Lockhart - ne parviennent à endiguer la menace. Aidé de Ron et Hermione, Harry doit agir au plus vite pour sauver Poudlard.", 
				"02:30:00", "https://static.fnac-static.com/multimedia/images_produits/ZoomPE/2/9/6/3322069866692/tsp20110629153819/Harry-Potter-et-la-chambre-des-secrets-Edition-Simple-DVD.jpg"));
		movieDAO.save(new Movie ("Harry Potter et le prisonnier d'Azkaban", "Alfonso Cuarón", LocalDate.of(2004,06,02), AgeEnum.TOUS_PUBLIC, "Sirius Black, un dangereux sorcier criminel, s'échappe de la sombre prison d'Azkaban avec un seul et unique but : retrouver Harry Potter, en troisième année à l'école de Poudlard. Selon la légende, Black aurait jadis livré les parents du jeune sorcier à leur assassin, Lord Voldemort, et serait maintenant déterminé à tuer Harry...", 
				"02:20:00", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRT6Hqol6TnghN9xWTkXYuMu5GzHJQcSKwZ6ZWQuBD0FjKqMotM"));
		movieDAO.save(new Movie ("Harry Potter et la coupe de feu", "Mike Newell", LocalDate.of(2005,11,30), AgeEnum.TOUS_PUBLIC, "La quatrième année à l'école de Poudlard est marquée par le \"Tournoi des trois sorciers\". Les participants sont choisis par la fameuse \"coupe de feu\" qui est à l'origine d'un scandale. Elle sélectionne Harry Potter alors qu'il n'a pas l'âge légal requis !\r\n"
				+ "Accusé de tricherie et mis à mal par une série d'épreuves physiques de plus en plus difficiles, ce dernier sera enfin confronté à Celui dont on ne doit pas prononcer le nom, Lord V.", 
				"02:35:00", "https://images-na.ssl-images-amazon.com/images/I/411XT99VX6L._AC_.jpg"));
		movieDAO.save(new Movie ("Harry Potter et l'ordre du phénix", "David Yates", LocalDate.of(2007,07,11), AgeEnum.TOUS_PUBLIC, "Alors qu'il entame sa cinquième année d'études à Poudlard, Harry Potter découvre que la communauté des sorciers ne semble pas croire au retour de Voldemort, convaincue par une campagne de désinformation orchestrée par le Ministre de la Magie Cornelius Fudge. Afin de le maintenir sous surveillance, Fudge impose à Poudlard un nouveau professeur de Défense contre les Forces du Mal, Dolorès Ombrage, chargée de maintenir l'ordre à l'école et de surveiller les faits et gestes de Dumbledore. Prodiguant aux élèves des cours sans grand intérêt, celle qui se fait appeler la Grande Inquisitrice de Poudlard semble également décidée à tout faire pour rabaisser Harry. Entouré de ses amis Ron et Hermione, ce dernier met sur pied un groupe secret, \"L'Armée de Dumbledore\", pour leur enseigner l'art de la défense contre les forces du Mal et se préparer à la guerre qui s'annonce...", 
				"02:18:00", "https://album.fr/wp-content/uploads/2016/02/harry-potter-et-l-ordre-du-phenix-212x300.jpg"));
		movieDAO.save(new Movie ("Harry Potter et le prince de sang mêlé", "David Yates", LocalDate.of(2009,07,15), AgeEnum.TOUS_PUBLIC, "L'étau démoniaque de Voldemort se resserre sur l'univers des Moldus et le monde de la sorcellerie. Poudlard a cessé d'être un havre de paix, le danger rode au coeur du château... Mais Dumbledore est plus décidé que jamais à préparer Harry à son combat final, désormais imminent. Ensemble, le vieux maître et le jeune sorcier vont tenter de percer à jour les défenses de Voldemort. Pour les aider dans cette délicate entreprise, Dumbledore va relancer et manipuler son ancien collègue, le Professeur Horace Slughorn, qu'il croit en possession d'informations vitales sur le jeune Voldemort. Mais un autre \"mal\" hante cette année les étudiants : le démon de l'adolescence ! Harry est de plus en plus attiré par Ginny, qui ne laisse pas indifférent son rival, Dean Thomas ; Lavande Brown a jeté son dévolu sur Ron, mais oublié le pouvoir \"magique\" des chocolats de Romilda Vane ; Hermione, rongée par la jalousie, a décidé de cacher ses sentiments, vaille que vaille. L'amour est dans tous les coeurs - sauf un. Car un étudiant reste étrangement sourd à son appel. Dans l'ombre, il poursuit avec acharnement un but aussi mystérieux qu'inquiétant... jusqu'à l'inévitable tragédie qui bouleversera à jamais Poudlard...", 
				"02:32:00", "https://fr.web.img2.acsta.net/medias/nmedia/18/65/64/35/19116952.jpg"));
		movieDAO.save(new Movie ("Harry Potter et les reliques de la mort - partie 1", "David Yates", LocalDate.of(2010,11,24), AgeEnum.TOUS_PUBLIC, "Le pouvoir de Voldemort s'étend. Celui-ci contrôle maintenant le Ministère de la Magie et Poudlard. Harry, Ron et Hermione décident de terminer le travail commencé par Dumbledore, et de retrouver les derniers Horcruxes pour vaincre le Seigneur des Ténèbres. Mais il reste bien peu d'espoir aux trois sorciers, qui doivent réussir à tout prix.", 
				"02:25:00", "https://fr.web.img5.acsta.net/medias/nmedia/18/69/69/81/19590744.jpg"));
		movieDAO.save(new Movie ("Harry Potter et les reliques de la mort - partie 2", "David Yates", LocalDate.of(2011,07,13), AgeEnum.TOUS_PUBLIC, "Dans la 2e Partie de cet épisode final, le combat entre les puissances du bien et du mal de l’univers des sorciers se transforme en guerre sans merci. Les enjeux n’ont jamais été si considérables et personne n’est en sécurité. Mais c’est Harry Potter qui peut être appelé pour l’ultime sacrifice alors que se rapproche l’ultime épreuve de force avec Voldemort.", 
				"02:10:00", "https://www.legaliondesetoiles.com/photo/art/grande/3337709-4790710.jpg?v=1520758687"));

		//movieDAO.save(new Movie ("HP", "Alex", LocalDate.of(1991,01,29), Age.M_18, "synopsis test.", "02:10:00", "https://www.legaliondesetoiles.com/photo/art/grande/3337709-4790710.jpg?v=1520758687"));
		
		//showDAO.save(new Show(7, 0, new Room (6, 600),new Schedule (LocalDate.of(2021, 5, 16), "22:00", "24:00"),new Movie ("HP", "Alex", LocalDate.of(1991,01,29), Age.M_18, "synopsis test.", "02:10:00", "https://www.legaliondesetoiles.com/photo/art/grande/3337709-4790710.jpg?v=1520758687")));

	}
	
	

	
}


	

