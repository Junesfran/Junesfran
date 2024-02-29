/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package biblioteca;

import com.github.javafaker.Faker;
import items.*;
import usuarios.*;
import java.util.Locale;
import java.util.Random;

/**
 *
 * @author Néstor y asociados
 */
public class Run {

    public static void main(String[] args) {
        Faker f = new Faker(Locale.CHINA);
        Random r = new Random();
        
        biblioteca.Bibioteca b = new biblioteca.Bibioteca(r.nextInt(1,5), f.educator().campus(), f.address().fullAddress(), r.nextInt(20,200));
        
        System.out.println(b.getDireccion());
        for (int i = 0; i < 51; i++) {
            b.altaItem(new Libro(
            f.book().author(), f.code().isbn13(),
            f.book().title(), f.book().publisher(),
            Tematica.FANTASTICO,
            r.nextInt(100,400),
            false, i));
        }
        System.out.println(b.listaLibros());
        
        Usuario u = new Usuario("1", f.name().fullName(),
                null, f.phoneNumber().cellPhone());

        System.out.println(b.listadoTema(Tematica.FANTASTICO));

        u.tomerItem(b.getitem(0));
        u.tomerItem(b.getitem(2));
        u.tomerItem(b.getitem(3));
        System.out.println(u.listadoUsuario());
    }
    

}
