package com.example.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ville implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_ville;
	private String nom_vile;
	
	//une ville contient plusieur quartiers
	@OneToMany(mappedBy = "quartier")
	private Collection<Quartier> quartiers;
	
}
