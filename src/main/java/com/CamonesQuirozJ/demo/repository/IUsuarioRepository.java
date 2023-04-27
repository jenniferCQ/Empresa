package com.CamonesQuirozJ.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CamonesQuirozJ.demo.model.Empleado;

public interface IUsuarioRepository extends JpaRepository  <Empleado,String>{

}
