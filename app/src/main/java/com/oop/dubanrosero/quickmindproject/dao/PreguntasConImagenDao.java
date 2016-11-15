package com.oop.dubanrosero.quickmindproject.dao;

import com.oop.dubanrosero.quickmindproject.Util.Constant;
import com.oop.dubanrosero.quickmindproject.models.PreguntaConImagen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by jhon on 11/11/16.
 */

public class PreguntasConImagenDao {
     boolean isEnglish;

    public PreguntasConImagenDao(boolean isEnglish) {
        this.isEnglish = isEnglish;
    }

    public List<PreguntaConImagen> getPreguntasConImagenCiencia(){

        List<PreguntaConImagen> data = new ArrayList<>();

        if (isEnglish){
            String[] options1 = {
                    "Isaac Newton","Tesla","Kirchhoff","Faraday"
            };

            PreguntaConImagen imageQuestion1 = new PreguntaConImagen(
                    "http://www.biografiasyvidas.com/biografia/k/fotos/kirchhoff.jpg",
                    Constant.TYPE_CIENCIAS,
                    options1,
                    "Kirchhoff"
            );

            data.add(imageQuestion1);

            String[] options2 = {
                    "Cyclopentyl","Cyclopentane","Pentyl","Heptyl"
            };

            PreguntaConImagen imageQuestion2 = new PreguntaConImagen(
                    "http://structuresearch.merck-chemicals.com/getImage/MDA_CHEM_818769",
                    Constant.TYPE_CIENCIAS,
                    options2,
                    "Cyclopentane"
            );

            data.add(imageQuestion2);

            String[] options3 = {
                    "Archaea","Bacteriophage","Taenia solium","Helical virus"
            };

            PreguntaConImagen imageQuestion3 = new PreguntaConImagen(
                    "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcQI0PbZSwENcdjwn1lQzZBWCYYm_FMqZUZ-vZl4nWWadxeAZoNTfg",
                    Constant.TYPE_CIENCIAS,
                    options3,
                    "Bacteriophage"
            );

            data.add(imageQuestion3);

            String[] options4 = {
                    "International Space Station","Plank","Hubble Space Telescope","Kepler Space Telescope"
            };

            PreguntaConImagen imageQuestion4 = new PreguntaConImagen(
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSOvowzZSBN3hwX-TUJT6XavWKhDyOUAvulkuLXs3jv0C3k8OgBhg",
                    Constant.TYPE_CIENCIAS,
                    options4,
                    "Hubble Space Telescope"
            );

            data.add(imageQuestion4);

            String[] options5 = {
                    "Mercury","Neptupe","Mars","Jupiter"
            };

            PreguntaConImagen imageQuestion5 = new PreguntaConImagen(
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR4hpBV-85H7sUMHIIzYz7WsSAQGIiZfNqzENl2sb5lV7tpbz4lrg",
                    Constant.TYPE_CIENCIAS,
                    options5,
                    "Neptupe"
            );
            data.add(imageQuestion5);


        }

        else {

            String[] opciones1 = {
                    "Isaac Newton","Tesla","Kirchhoff","Faraday"
            };

            PreguntaConImagen preguntaConImagen1 = new PreguntaConImagen(
                    "http://www.biografiasyvidas.com/biografia/k/fotos/kirchhoff.jpg",
                    Constant.TYPE_CIENCIAS,
                    opciones1,
                    "Kirchhoff"
            );
            data.add(preguntaConImagen1);

            String[] opciones2 = {
                    "Pentanol","Pentano","Ciclopentano","Cicloheptano"
            };

            PreguntaConImagen preguntaConImagen2 = new PreguntaConImagen(
                    "http://structuresearch.merck-chemicals.com/getImage/MDA_CHEM_818769",
                    Constant.TYPE_CIENCIAS,
                    opciones2,
                    "Ciclopentano"
            );
            data.add(preguntaConImagen2);

            String[] opciones3 = {
                    "Taenia solium ","Virus Bacteriófago","Arquea","Virus helicoidal"
            };

            PreguntaConImagen preguntaConImagen3 = new PreguntaConImagen(
                    "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcQI0PbZSwENcdjwn1lQzZBWCYYm_FMqZUZ-vZl4nWWadxeAZoNTfg",
                    Constant.TYPE_CIENCIAS,
                    opciones3,
                    "Virus Bacteriófago"
            );
            data.add(preguntaConImagen3);

            String[] opciones4 = {
                    "Estacion espacial internacional","Plank","Telescopio espacial Hubble","Telescopio espacial Kepler"
            };

            PreguntaConImagen preguntaConImagen4 = new PreguntaConImagen(
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSOvowzZSBN3hwX-TUJT6XavWKhDyOUAvulkuLXs3jv0C3k8OgBhg",
                    Constant.TYPE_CIENCIAS,
                    opciones4,
                    "Telescopio espacial Hubble"
            );
            data.add(preguntaConImagen4);
            String[] opciones5 = {
                    "Mercurio","Neptupo","Marte","Júpiter"
            };

            PreguntaConImagen preguntaConImagen5 = new PreguntaConImagen(
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR4hpBV-85H7sUMHIIzYz7WsSAQGIiZfNqzENl2sb5lV7tpbz4lrg",
                    Constant.TYPE_CIENCIAS,
                    opciones5,
                    "Neptupo"
            );
            data.add(preguntaConImagen5);



        }
        return data;
    }

    public List<PreguntaConImagen> getPreguntasConImagenDeporte(){
        List<PreguntaConImagen> data = new ArrayList<>();
        if (isEnglish){
            String[] options1 = {
                    "Celta de Vigo","Malaga","Cruz Azul","Cuy sabor"
            };

            PreguntaConImagen imageQuestion1 = new PreguntaConImagen(
                    "https://www.ecured.cu/images/thumb/f/f9/Escudo-del-real-club-celta-de-vigo-deportes-escudos-de-futbol-pintado-por-martinb-9769932.jpg/260px-Escudo-del-real-club-celta-de-vigo-deportes-escudos-de-futbol-pintado-por-martinb-9769932.jpg",
                    Constant.TYPE_DEPORTE,
                    options1,
                    "Celta de Vigo"
            );

            data.add(imageQuestion1);

            String[] options2 = {
                    "Fuleco","Ato","Naranjito","Zakumi"
            };

            PreguntaConImagen imageQuestion2 = new PreguntaConImagen(
                    "https://upload.wikimedia.org/wikipedia/en/thumb/8/8f/Zakumi.svg/870px-Zakumi.svg.png",
                    Constant.TYPE_DEPORTE,
                    options2,
                    "Zakumi"
            );

            data.add(imageQuestion2);

            String[] options3 = {
                    "Signal Iduna Park","Allianz Arena","Santiago Bernabeu","Camp Nou"
            };

            PreguntaConImagen imageQuestion3 = new PreguntaConImagen(
                    "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcRYA0Q5MNmJif7q6KtQh3HGmf5zPQdTKREnxlvdR80zFaySmMfkcw",
                    Constant.TYPE_DEPORTE,
                    options3,
                    "Signal Iduna Park"
            );

            data.add(imageQuestion3);

            String[] options4 = {
                    "Ato","Ciao","Sakumi","Fuleco"
            };

            PreguntaConImagen imageQuestion4 = new PreguntaConImagen(
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRxCgS4XluYyON0ArPuHJU-H1JTQ2g2uzOdZ8YyX4WEdfpbI96I",
                    Constant.TYPE_DEPORTE,
                    options4,
                    "Ciao"
            );

            data.add(imageQuestion4);

            String[] options5= {
                    "Milan","Inter","Juventus","Napoli"
            };

            PreguntaConImagen imageQuestion5= new PreguntaConImagen(
                    "http://4.bp.blogspot.com/-E5A7wsfG4FM/VhUwkLM5dSI/AAAAAAAAx2g/L960dSH5I8Q/s1600/AC%2BMilan%2B512x512%2BPESLogos.png",
                    Constant.TYPE_DEPORTE,
                    options5,
                    "Milan"
            );

            data.add(imageQuestion5);





        }

        else {

            String[] opciones1 = {
                    "Celta de Vigo","Malaga","Cruz Azul","Cuy sabor"
            };

            PreguntaConImagen preguntaConImagen1 = new PreguntaConImagen(
                    "https://www.ecured.cu/images/thumb/f/f9/Escudo-del-real-club-celta-de-vigo-deportes-escudos-de-futbol-pintado-por-martinb-9769932.jpg/260px-Escudo-del-real-club-celta-de-vigo-deportes-escudos-de-futbol-pintado-por-martinb-9769932.jpg",
                    Constant.TYPE_DEPORTE,
                    opciones1,
                    "Celta de Vigo"
            );
            data.add(preguntaConImagen1);

            String[] opciones2 = {
                    "Fuleco","Ato","Naranjito","Zakumi"
            };

            PreguntaConImagen preguntaConImagen2 = new PreguntaConImagen(
                    "https://upload.wikimedia.org/wikipedia/en/thumb/8/8f/Zakumi.svg/870px-Zakumi.svg.png",
                    Constant.TYPE_DEPORTE,
                    opciones2,
                    "Zakumi"
            );
            data.add(preguntaConImagen2);

            String[] opciones3 = {
                    "Signal Iduna Park","Allianz Arena","Santiago Bernabeu","Camp Nou"
            };

            PreguntaConImagen preguntaConImagen3 = new PreguntaConImagen(
                    "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcRYA0Q5MNmJif7q6KtQh3HGmf5zPQdTKREnxlvdR80zFaySmMfkcw",
                    Constant.TYPE_DEPORTE,
                    opciones3,
                    "Signal Iduna Park"
            );
            data.add(preguntaConImagen3);

            String[] opciones4 = {
                    "Ato","Ciao","Sakumi","Fuleco"
            };

            PreguntaConImagen preguntaConImagen4= new PreguntaConImagen(
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRxCgS4XluYyON0ArPuHJU-H1JTQ2g2uzOdZ8YyX4WEdfpbI96I",
                    Constant.TYPE_DEPORTE,
                    opciones4,
                    "Ciao"
            );
            data.add(preguntaConImagen4);

            String[] opciones5= {
                    "Milan","Inter","Juventus","Napoli"
            };

            PreguntaConImagen preguntaconImagen5= new PreguntaConImagen(
                    "http://4.bp.blogspot.com/-E5A7wsfG4FM/VhUwkLM5dSI/AAAAAAAAx2g/L960dSH5I8Q/s1600/AC%2BMilan%2B512x512%2BPESLogos.png",
                    Constant.TYPE_DEPORTE,
                    opciones5,
                    "Milan"
            );

            data.add(preguntaconImagen5);


        }
        return data;
    }
    public List<PreguntaConImagen> getPreguntasConImagenSociales(){
        List<PreguntaConImagen> data = new ArrayList<>();

        if (isEnglish){
            String[] options1 = {
                    "Philipins","Puerto Rico","Dominican Republic","Vietnam"
            };

            PreguntaConImagen imageQuestion1 = new PreguntaConImagen(
                    "http://vignette4.wikia.nocookie.net/worldmusicfestival/images/1/17/Filipinas_Flag_Bandera.jpg/revision/latest?cb=20140710180135",
                    Constant.TYPE_SOCIALES,
                    options1,
                    "Philipins"
            );

            data.add(imageQuestion1);

            String[] options2 = {
                    "Wales","Gibraltar","Republic of Malta","Papua New Guinea"
            };

            PreguntaConImagen imageQuestion2 = new PreguntaConImagen(
                    "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcSrWypLa1zsQIZBiMzNCgU7ff7TqHlmWAHtYwdrraFNz7LgEeH-",
                    Constant.TYPE_SOCIALES,
                    options2,
                    "Gibraltar"
            );

            data.add(imageQuestion2);

            String[] options3 = {
                    "Gulf of Alaska","Gulf of Mexico","Lower California Peninsula","Gulf of California"
            };

            PreguntaConImagen imageQuestion3 = new PreguntaConImagen(
                    "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcQU2HT1uP5xHbWnd50xt4Tt5zJecGQuLcf6MSeiiOWW91vljkJ-Xg",
                    Constant.TYPE_SOCIALES,
                    options3,
                    "Gulf of Mexico"
            );

            data.add(imageQuestion3);

            String[] options4 = {
                    "Taj Mahal, India","Golden Temple, Japan","The Colosseum, Italy","Golden Temple, India"
            };

            PreguntaConImagen imageQuestion4 = new PreguntaConImagen(
                    "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRV1k14kARZmBii04GIJwyeMMKqzCsTnCRMur67GCouklRY7ycu",
                    Constant.TYPE_SOCIALES,
                    options4,
                    "Golden Temple, India"
            );

            data.add(imageQuestion4);

            String[] options5 = {
                    "Pasto","Popayan","Bogota","Cali"
            };

            PreguntaConImagen imageQuestion5 = new PreguntaConImagen(
                    "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcSu51JXTsJY3OrMLAs9wGXgCoCS3vXegdPnBcLWKDSBBwf5g-sj-A",
                    Constant.TYPE_SOCIALES,
                    options5,
                    "Bogota"
            );

            data.add(imageQuestion5);



        }

        else {

            String[] opciones1 = {
                    "Filipinas","Puerto Rico","Republica Dominicana","Vietnam"
            };

            PreguntaConImagen preguntaConImagen1 = new PreguntaConImagen(
                    "http://vignette4.wikia.nocookie.net/worldmusicfestival/images/1/17/Filipinas_Flag_Bandera.jpg/revision/latest?cb=20140710180135",
                    Constant.TYPE_SOCIALES,
                    opciones1,
                    "Filipinas"
            );
            data.add(preguntaConImagen1);

            String[] opciones2 = {
                    "Gales","Gibraltar","Republica de Malta","Papua Nueva Guinea"
            };

            PreguntaConImagen preguntaConImagen2 = new PreguntaConImagen(
                    "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcSrWypLa1zsQIZBiMzNCgU7ff7TqHlmWAHtYwdrraFNz7LgEeH-",
                    Constant.TYPE_SOCIALES,
                    opciones2,
                    "Gibraltar"
            );

            data.add(preguntaConImagen2 );

            String[] opciones3 = {
                    "Golfo de Alaska","Golfo de Mexico","Peninsula de la baja California","Golfo de California"
            };

            PreguntaConImagen preguntaConImagen3 = new PreguntaConImagen(
                    "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcQU2HT1uP5xHbWnd50xt4Tt5zJecGQuLcf6MSeiiOWW91vljkJ-Xg",
                    Constant.TYPE_SOCIALES,
                    opciones3,
                    "Golfo de Mexico"
            );

            data.add(preguntaConImagen3);

            String[] opciones4 = {
                    "Taj Mahal, India","Templo dorado, Japon","El coliseo, Italia","Templo dorado, India"
            };

            PreguntaConImagen preguntaConImagen4 = new PreguntaConImagen(
                    "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcRV1k14kARZmBii04GIJwyeMMKqzCsTnCRMur67GCouklRY7ycu",
                    Constant.TYPE_SOCIALES,
                    opciones4,
                    "Templo dorado, India"
            );

            data.add(preguntaConImagen4);

            String[] opciones5 = {
                    "Pasto","Popayán","Bogotá","Calí"
            };

            PreguntaConImagen preguntaConImagen5 = new PreguntaConImagen(
                    "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcSu51JXTsJY3OrMLAs9wGXgCoCS3vXegdPnBcLWKDSBBwf5g-sj-A",
                    Constant.TYPE_SOCIALES,
                    opciones5,
                    "Bogotá"
            );

            data.add(preguntaConImagen5);

        }

        return data;
    }

    public List<PreguntaConImagen> getPreguntasConImagenArtes(){
        List<PreguntaConImagen> data = new ArrayList<>();

        if (isEnglish){
            String[] options1 = {
                    "Chimera","Minotaur","Centaur","Griffin"
            };

            PreguntaConImagen imageQuestion1 = new PreguntaConImagen(
                    "http://vignette1.wikia.nocookie.net/el-bestiario/images/0/06/Quimera.jpg/revision/latest?cb=20141011201106&path-prefix=es",
                    Constant.TYPE_ARTES,
                    options1,
                    "Chimera"
            );

            data.add(imageQuestion1);

            String[] options2 = {
                    "Guitar","Bass","Bandola","Ukelele"
            };

            PreguntaConImagen imageQuestion2 = new PreguntaConImagen(
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSLD99rTyZA_S7W4vLJKlLKWBcO3ux5QO3TDzCigY0vrIj1wVKnYQ",
                    Constant.TYPE_ARTES,
                    options2,
                    "Bass"
            );
            data.add(imageQuestion2);

            String[] options3 = {
                    "G-clef","C-clef","F-clef","M-clef"
            };

            PreguntaConImagen imageQuestion3 = new PreguntaConImagen(
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT23I_3pBwi2y5FsShFM0ROUAbFTGT8Ck1QCNG69BhQAn88EwdYJA",
                    Constant.TYPE_ARTES,
                    options3,
                    "C-clef"
            );
            data.add(imageQuestion3);

            String[] options4 = {
                    "Gioconda","The Persistence of Memory","The Starry Night","The Scream"
            };

            PreguntaConImagen imageQuestion4 = new PreguntaConImagen(
                    "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSH6ZomqF3mJ_rb6LGEAhjuZu1aYXEoDS3kN2DlG9X_MNIASSvxtw",
                    Constant.TYPE_ARTES,
                    options4,
                    "The Scream"
            );
            data.add(imageQuestion4);

            String[] options5 = {
                    "Pablo Picasso", "Fernando Botero", "Alejandro Obregon","Salvador Dali"
            };

            PreguntaConImagen imageQuestion5 = new PreguntaConImagen(
                    "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcSDsOD9jyTD55lf5bvvqteLBVUxTFEwwKAWJ8VVxKb3Vwxwiyzs",
                    Constant.TYPE_ARTES,
                    options5,
                    "Salvador Dali"
            );
            data.add(imageQuestion5);

        }

        else {

            String[] opciones1 = {
                    "Quimera","Minotauro","Grifo","Centauro"
            };

            PreguntaConImagen preguntaConImagen1 = new PreguntaConImagen(
                    "http://vignette1.wikia.nocookie.net/el-bestiario/images/0/06/Quimera.jpg/revision/latest?cb=20141011201106&path-prefix=es",
                    Constant.TYPE_ARTES,
                    opciones1,
                    "Quimera"
            );
            data.add(preguntaConImagen1);

            String[] opciones2 = {
                    "Guitarra","Bajo","Bandola","Ukelele"
            };

            PreguntaConImagen preguntaConImagen2 = new PreguntaConImagen(
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSLD99rTyZA_S7W4vLJKlLKWBcO3ux5QO3TDzCigY0vrIj1wVKnYQ",
                    Constant.TYPE_ARTES,
                    opciones2,
                    "Bajo"
            );
            data.add(preguntaConImagen2);

            String[] opciones3 = {
                    "Clave de Sol","Clave de Fa","Clave de Do","Clave de Mi"
            };

            PreguntaConImagen preguntaConImagen3 = new PreguntaConImagen(
                    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT23I_3pBwi2y5FsShFM0ROUAbFTGT8Ck1QCNG69BhQAn88EwdYJA",
                    Constant.TYPE_ARTES,
                    opciones3,
                    "Clave de Do"
            );
            data.add(preguntaConImagen3);
            String[] opciones4 = {
                    "La noche estrellada","El grito","Gioconda","La persistencia de la memoria"
            };

            PreguntaConImagen preguntaConImagen4 = new PreguntaConImagen(
                    "https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSH6ZomqF3mJ_rb6LGEAhjuZu1aYXEoDS3kN2DlG9X_MNIASSvxtw",
                    Constant.TYPE_ARTES,
                    opciones4,
                    "El grito"
            );
            data.add(preguntaConImagen4);

            String[] opciones5 = {
                    "Pablo Picasso", "Fernando Botero", "Alejandro Obregón","Salvador Dalí"
            };

            PreguntaConImagen preguntaConImagen5 = new PreguntaConImagen(
                    "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcSDsOD9jyTD55lf5bvvqteLBVUxTFEwwKAWJ8VVxKb3Vwxwiyzs",
                    Constant.TYPE_ARTES,
                    opciones5,
                    "Salvador Dalí"
            );
            data.add(preguntaConImagen5);


        }

        return data;
    }


    public PreguntaConImagen getRandomPreguntaConImagen(List<PreguntaConImagen> data){
        Random rand = new Random();
        int  n = rand.nextInt(data.size());
        return data.get(n);
    }
}
