package com.jaco.heladeria.interfaces;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.jaco.heladeria.Modelos.Usuario; 


@Repository
public interface IUsuarioRepositorio extends JpaRepository<Usuario, Integer> {
   
}