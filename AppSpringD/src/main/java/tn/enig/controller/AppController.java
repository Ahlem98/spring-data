package tn.enig.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import tn.enig.dao.IGestionMagasin;
import tn.enig.dao.IGestionProduit;
import tn.enig.model.Mgasin;
import tn.enig.model.Produit;

@Controller
public class AppController {
	@Autowired
	private IGestionMagasin dao1 ;
	@Autowired
	private IGestionProduit dao2 ;
	public IGestionMagasin getDao1() {
		return dao1;
	}
	public void setDao1(IGestionMagasin dao1) {
		this.dao1 = dao1;
	}
	@GetMapping("/home1")
   public String fn1(Model m) {
		List<Produit> liste= dao2.findAll() ;
		m.addAttribute("liste", liste) ;
		
		return "page1" ;
	}
	@GetMapping("/home2")
	   public String fn2(Model m) {
			List<Mgasin> liste= dao1.findAll() ;
			m.addAttribute("liste", liste) ;
			System.out.println(liste.get(0));
			return "page2" ;
		}
	
	@GetMapping("/addProduct")
	public String addProduct(Model m) {
		List<Produit> liste=dao2.findAll();
		Produit p=new Produit();
		m.addAttribute("produit", p);
		m.addAttribute("listeMagasin", liste);
		
		return "addProduct";
		
	}
	@PostMapping("/ajouterProduct")
	public String ajouterProduct(Model m,@ModelAttribute("produit") Produit produit) {
		dao2.save(produit);
		return "redirect:/addProduct";
	}
}
