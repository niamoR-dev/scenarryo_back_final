package fr.ibformation.scenarryo_back.beans;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import fr.ibformation.scenarryo_back.enums.AgeEnum;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity // Indique que c'est une table
@Getter
@Setter
@NoArgsConstructor // génération automatique d'un constructeur vide
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class, 
        property = "id")
@Table
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // Auto incrémentation de l'ID
	private int id;
	private String title;
	private String producer;
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate releaseDate;
	AgeEnum ageLimited = AgeEnum.TOUS_PUBLIC;// "Tous public" par défaut si rien définie
	@Column(columnDefinition = "TEXT") // Pour typer en base de donnée en "TEXT"
	private String synopsis;
	private String duration;
	private String poster; // Strings car image en URL

	@OneToMany (mappedBy="showMovie")
	private List<FilmShow> filmShow =  new ArrayList<FilmShow>();
	
	
	
	public Movie(String title, LocalDate releaseDate, AgeEnum ageLimited, String synopsis, String duration, String poster, String producer) {
		this.title = title;
		this.releaseDate = releaseDate;
		this.ageLimited = ageLimited;
		this.synopsis = synopsis;
		this.duration = duration;
		this.poster = poster;
		this.producer=producer;
	}

	public Movie(int id,String title, LocalDate releaseDate, AgeEnum ageLimited, String synopsis, String duration, String poster, String producer) {
		this.id = id;
		this.title = title;
		this.releaseDate = releaseDate;
		this.ageLimited = ageLimited;
		this.synopsis = synopsis;
		this.duration = duration;
		this.poster = poster;
		this.producer=producer;
	}
	
	public Movie(String title, String producer, LocalDate releaseDate, AgeEnum ageLimited, String synopsis,
			String duration, String poster) {
		super();
		this.title = title;
		this.producer = producer;
		this.releaseDate = releaseDate;
		this.ageLimited = ageLimited;
		this.synopsis = synopsis;
		this.duration = duration;
		this.poster = poster;
	}
	
	
	
	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", releaseDate=" + releaseDate + ", ageLimited=" + ageLimited
				+ ", synopsis=" + synopsis + ", duration=" + duration + ", poster=" + poster + ", producer=" + producer + ", filmShow=" + filmShow
				+ "]";
	}

	

	
}
