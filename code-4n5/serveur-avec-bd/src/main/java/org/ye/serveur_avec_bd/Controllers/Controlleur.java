package org.ye.serveur_avec_bd.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Sera automatiquement détecté au démarrage du serveur
@Controller
public class Controlleur {

	@PostMapping("/envoyer")
	public @ResponseBody String ajouterEnPost(@RequestParam(name="taille",required = false) String taille,@RequestBody String texte){
		StringBuilder text = new StringBuilder(texte);
		while (text.length() < Integer.valueOf(taille)){
			text.append(texte);
			if (text.length() > Integer.valueOf(taille)){
				text.substring(text.length() - Integer.valueOf(taille), text.length());
			}
		}
		return text.toString();
	}
}