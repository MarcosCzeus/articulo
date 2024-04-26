package com.example.SpringJDBCDemo.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.example.SpringJDBCDemo.model.Estudiantes;

import java.util.List;

@Repository
public class EstudianteRepo {

    private JdbcTemplate template;

    public JdbcTemplate getTemplate() {
        return template;
    }

    @Autowired
    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public void save(Estudiantes estudiante){
        String sql = "insert into estudiante (carnet, nombre, carrera) values (?,?,?)";

        int rows = template.update(sql, estudiante.getCarnet(), estudiante.getNombre(), estudiante.getCarrera());
        System.out.println(rows + "row/s affected");
    }

    public List<Estudiantes> findAll(){
        String sql = "select * from estudiante";

        List<Estudiantes> estudiantes = template.query(sql, (rs, row) -> {

            Estudiantes a = new Estudiantes();
            a.setCarnet(rs.getInt(1));
            a.setNombre(rs.getString(2));
            a.setCarrera(rs.getString(3));

            return a;
        });

        return estudiantes;

    }

}
