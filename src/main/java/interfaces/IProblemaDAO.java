/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;


import java.util.List;
import model.Problema;

/**
 *
 * @author martinbl
 */
public interface IProblemaDAO {
    boolean insertar(Problema problema);
    Problema obtenerPorId(int idProblema);
    List<Problema> obtenerTodos();
    boolean actualizar(Problema problema);
    boolean eliminar(int idProblema);
}
