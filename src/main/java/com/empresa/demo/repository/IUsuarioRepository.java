package com.empresa.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.demo.model.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario,String>{

}
