package com.iwcn.master.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iwcn.master.models.Producto;
import com.iwcn.master.repositories.ProductoRepositorio;

@Service
public class ProductoServiceS implements ProductoService {
	
	private ProductoRepositorio prodRepo;
	
	@Autowired
	public void setporductoRepositorio(ProductoRepositorio productoRepo) {
		this.prodRepo = productoRepo;
	}

	@Override
	public Iterable<Producto> listaproductos() {
		return prodRepo.findAll();
	}

	@Override
	public Producto getproductoid(Integer codigo) {
		return prodRepo.findOne(codigo);
	}

	@Override
	public Producto guardarproducto(Producto prod) {
		return prodRepo.save(prod);
	}

	@Override
	public void borrarproducto(Integer codigo) {
		prodRepo.delete(codigo);
	}
	
    /*@Override
    public String toString() {
        return "lista [productos=" + prodRepo + "]";
    }*/

}
