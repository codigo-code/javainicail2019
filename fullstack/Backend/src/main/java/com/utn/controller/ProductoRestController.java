package com.utn.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.utn.model.Producto;

@RestController
public class ProductoRestController {

	private List<Producto> listaProductos;

	public ProductoRestController() {
		this.listaProductos = new ArrayList<Producto>();

		Producto p1 = new Producto();
		Producto p2 = new Producto();
		Producto p3 = new Producto();

		p1.setId(1);
		p1.setDescripcion("Meta");
		p1.setCantidad(10);

		p2.setId(2);
		p2.setDescripcion("Base");
		p2.setCantidad(100);

		p3.setId(3);
		p3.setDescripcion("Efe");
		p3.setCantidad(50);

		this.listaProductos.add(p1);
		this.listaProductos.add(p2);
		this.listaProductos.add(p3);

	}

	@GetMapping(value = "/api/getList")
	public ResponseEntity getListaProductos() {

		Gson g = new Gson();
		try {
			return ResponseEntity.ok(g.toJson(this.listaProductos));

		} catch (Exception e) {

			return ResponseEntity.badRequest().body(e.getMessage());

		}
	}

	// request/Producto/1
	@GetMapping(value = "/api/producto/{id}")
	public String getProductoId(@PathVariable("id") int id) {
		Gson g = new Gson();
		return g.toJson(this.listaProductos.get(id));
	}
}
